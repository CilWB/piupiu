/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.zx96.piupiu.entity;

import me.zx96.piupiu.Dimensions;
import me.zx96.piupiu.Health;
import me.zx96.piupiu.Resources;
import me.zx96.piupiu.Timing;
/**
 *
 * @author bow
 */
public class Heart extends Item {

    public Heart(double originX, double originY) {
        super(Resources.SPR_ITEM_HEART, Dimensions.PROJECTILE_ITEM_HEART_WIDTH, 
                Dimensions.PROJECTILE_ITEM_HEART_HEIGHT, Health.PROJECTILE_ITEM_HEART_HEAL,
                originX, originY, Timing.PROJECTILE_ITEM_HEART_DELTA_X,
                Timing.PROJECTILE_ITEM_HEART_DELTA_Y);
        
              System.out.println("X= "+Timing.PROJECTILE_ITEM_HEART_DELTA_X);
              System.out.println("Y= "+Timing.PROJECTILE_ITEM_HEART_DELTA_Y);
    }

    @Override
    protected void doMovement() {
        //super.doMovement(); //To change body of generated methods, choose Tools | Templates.
        setX(getX() - deltaX);
        setY(getY() + deltaY);
    }
    
    
        
}
