/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpz;

/**
 *
 * @author sahad
 */
public class Constant {
    public static final int GOLD=280;
    public static class Direction{
        public static final int LEFT=0;
        public static final int UP=1;
        public static final int RIGHT=2;
        public static final int DOWN=3;
    }
    public static class Tiles{
        public static final int GRASS_TILE=0;
        public static final int WATER_TILE=1;
        public static final int ROAD_TILE=2;
        public static final int WALL_TILE=3;
        public static final int DOOR_TILE=4;
        public static final int TOWER_TILE=5;
    }
    public static class Enemies{
        public static final int NORMAL=0;
        public static final int TANKY=1;
        public static final int THIEFT=2;
        public static final int BOSS=3;
        public static int getGold(int type){
            switch(type){
                case NORMAL:
                    return GetHealth(NORMAL);
                case TANKY:
                    return GetHealth(TANKY);
                case THIEFT:
                    return GetHealth(THIEFT);
                case BOSS:
                    return GetHealth(BOSS);
            }
            return 0;
        }
        public static float GetSpeed(int type){
            switch(type){
                case NORMAL:
                    return 0.7f;
                case TANKY:
                    return .4f;
                case THIEFT:
                    return 2.1f;
                case BOSS:
                    return .7f;
            }
            return 0;
        }
        public static int GetHealth(int type){
            switch(type){
                case NORMAL:
                    return 6;
                case TANKY:
                    return 12;
                case THIEFT:
                    return 5;
                case BOSS:
                    return 175;
            }
            return 0;
        }
    }
    public static class Mages{
        public static final int WIND=0;
        public static final int FIRE=1;
        public static final int ICE=2;
        public static final int EARTH=3;
        public static String GetNameMage(int mageTowerType){
            switch(mageTowerType){
                case ICE:
                    return "Ice Mage";
                case EARTH:
                    return "Earth Mage";
                case WIND:
                    return "Wind Mage";
                case FIRE:
                    return "Fire Mage";
            }
            return "";
        }
        public static int GetCostMage(int mageTowerType){
            switch(mageTowerType){
                case ICE:
                    return 400;
                case EARTH:
                    return 325;
                case WIND:
                    return 150;
                case FIRE:
                    return 200;
            }
            return 0;
        }
        public static int GetDamageMage(int mageTowerType){
            switch(mageTowerType){
                case ICE:
                    return 0;
                case EARTH:
                    return 2;
                case WIND:
                    return 2;
                case FIRE:
                    return 1;
            }
            return 0;
        }
        public static double GetRangeMage(int mageTowerType){
            switch(mageTowerType){
                case ICE:
                    return 70;
                case EARTH:
                    return 90;
                case WIND:
                    return 120;
                case FIRE:
                    return 80;
            }
            return 0;
        }
        public static double GetCooldownMage(int mageTowerType){
            switch(mageTowerType){
                case ICE:
                    return 35;
                case EARTH:
                    return 60;
                case WIND:
                    return 50;
                case FIRE:
                    return 10;
            }
            return 0;
        }

        public static String GetAbilityMage(int towerType) {
            switch(towerType){
                case ICE:
                    return "Freezeeee !!";
                case EARTH:
                    return "Penetrate !!";
                case WIND:
                    return "AoE Damage!!";
                case FIRE:
                    return "Rapid & High dmg !!";
            }
            return "";
        }
    }
    public static class Projectiles{
        public static final int WIND_SPELL=0;
        public static final int ICE_SPELL=2;
        public static final int EARTH_SPELL=3;
        public static final int FIRE_SPELL=1;
        public static float GetSpeed(int mageTowerType){
            switch(mageTowerType){
                case ICE_SPELL:
                    return 10;
                case EARTH_SPELL:
                    return 10;
                case WIND_SPELL:
                    return 10;
                case FIRE_SPELL:
                    return 10;
            }
            return 0;
        }
    }
}
