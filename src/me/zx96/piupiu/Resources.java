/*
 * This file contains constants for the names of resources.
 */
package me.zx96.piupiu;

/*
 * Jonathan Zentgraf
 * Michael Ondrasek
 * CS-1180-01 Lab 10
 * Matthew Flaute
 */
public class Resources {
    public static final String BASE = "me/zx96/piupiu/res/";
    public static final String SPR_BASE = BASE + "img/";
    public static final String AUD_BASE = BASE + "audio/";
    
    //Sprites
    public static final String SPR_NULL = SPR_BASE + "null_sprite.png";
    
    public static String SPR_PLAYER = SPR_BASE + "player0.png";
    public static String SPR_PLAYER_LEFT = SPR_BASE + "player_l0.png";
    public static String SPR_PLAYER_RIGHT = SPR_BASE + "player_r0.png";
    
    public static final String SPR_ENEMY_SMALL = SPR_BASE + "enemy_sm.png";
    public static final String SPR_ENEMY_LARGE = SPR_BASE + "enemy_lg.png";
    
    public static final String SPR_ENEMY_MINI = SPR_BASE + "miniEnemy.png";
    
    public static final String SPR_PROJECTILE_PLAYER = SPR_BASE + "projectile_player.png";
    public static final String SPR_PROJECTILE_ENEMY_SMALL = SPR_BASE + "projectile_enemy_sm.png";
    public static final String SPR_PROJECTILE_ENEMY_LARGE = SPR_BASE + "projectile_enemy_lg.png";
    
    public static final String SPR_ITEM_HEART = SPR_BASE + "heart.png";
    public static final String SPR_ITEM_DIAMOND = SPR_BASE + "diamond.png";
    
    //Audio
    public static final String AUD_BGM = AUD_BASE + "bgm.mp3";
    public static final String AUD_SFX_EXPLOSION = AUD_BASE + "explode.mp3";
    public static final String AUD_SHOOT = AUD_BASE + "shoot.mp3";
    
    //Font
    public static final String FONT = BASE + "PressStart2P.ttf";
    
    //Not actually in the res package, but this is a good file to put this in
    public static final String HIGH_SCORE_FILE = "highscore.txt";
    
    //
    public static int color = 0;
    
    
    public static void changeColor(){
         //change color rocket
        switch(Resources.color){
            case 0: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"0.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"0.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"0.png";
                break;
            case 1: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"1.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"1.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"1.png";
                break;
            case 2: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"2.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"2.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"2.png";
                break;
            case 3: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"3.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"3.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"3.png";
                break;
            case 4: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"4.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"4.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"4.png";
                break;
            case 5: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"5.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"5.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"5.png";
                break;
            case 6: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"6.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"6.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"6.png";
                break;
            case 7: Resources.SPR_PLAYER = Resources.SPR_BASE + "player"+"7.png";
                    Resources.SPR_PLAYER_LEFT =  Resources.SPR_BASE + "player_l"+"7.png";
                    Resources.SPR_PLAYER_RIGHT = Resources.SPR_BASE + "player_r"+"7.png";
                break;
        }
    }
    
    
}
