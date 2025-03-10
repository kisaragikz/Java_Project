package main;

import javax.swing.JFrame;

import inputs.KeyboardListener;
import inputs.MyMouseListener;
import managers.DecorationManager;
import managers.TileManager;
import scenes.Menu;
import scenes.Playing;
import scenes.Settings;

public class Game extends JFrame implements Runnable {

	private GameScreen gameScreen;
	private Thread gameThread;

	private final double FPS_SET = 120.0;
	private final double UPS_SET = 60.0;

	

	// Classes
	private Render render;
	private Menu menu;
	private Playing playing;
	private Settings settings;
        private TileManager tileManager;
        private DecorationManager decorationManager;
	public Game() {
		initClasses();
                this.setTitle("Tower Defense Beginner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(gameScreen);
		pack();
		setVisible(true);
	}

	private void initClasses() {
            tileManager = new TileManager();
            decorationManager = new DecorationManager();
            render = new Render(this);
            gameScreen = new GameScreen(this);
            menu = new Menu(this);
            playing = new Playing(this);
            settings = new Settings(this);
	}

	

	private void start() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	private void updateGame() {
            switch(GameStates.gameState){
                case MENU:
                    break;
                case PLAYING:
                    playing.update();
                    break;
                case SETTINGS:
                    break;
                default:
                    break;
            }
	}

	public static void main(String[] args) {
		Game game = new Game();
                game.gameScreen.initInputs();
		game.start();
	}

	@Override
	public void run() {
		double timePerFrame = 1000000000.0 / FPS_SET;
		double timePerUpdate = 1000000000.0 / UPS_SET;
		long lastFrame = System.nanoTime();
		long lastUpdate = System.nanoTime();
		long lastTimeCheck = System.currentTimeMillis();
		int frames = 0;
		int updates = 0;
		long now;
		while (true) {

			now = System.nanoTime();
			// Render
			if (now - lastFrame >= timePerFrame) {
				repaint();
				lastFrame = now;
				frames++;
			}

			// Update
			if (now - lastUpdate >= timePerUpdate) {
				updateGame();
				lastUpdate = now;
				updates++;
			}

			if (System.currentTimeMillis() - lastTimeCheck >= 1000) {
				System.out.println("FPS: " + frames + " | UPS: " + updates);
				frames = 0;
				updates = 0;
				lastTimeCheck = System.currentTimeMillis();
			}

		}

	}

	// Getters and setters
	public Render getRender() {
		return render;
	}

	public Menu getMenu() {
		return menu;
	}

	public Playing getPlaying() {
		return playing;
	}

	public Settings getSettings() {
		return settings;
	}
        public TileManager getTileManager(){
            return tileManager;
        }

    public DecorationManager getDecorationManager() {
        return decorationManager;
    }
        
}