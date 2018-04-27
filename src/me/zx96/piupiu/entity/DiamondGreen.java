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
 * @author SUGAR
 */
public class DiamondGreen extends Item {
    
    public DiamondGreen(double originX, double originY) {
    super(Resources.SPR_ITEM_DIAMONDGREEN, Dimensions.PROJECTILE_ITEM_DIAMOND_WIDTH, 
            Dimensions.PROJECTILE_ITEM_DIAMOND_HEIGHT, Health.PROJECTILE_ITEM_DIAMONDGREEN_DMG,
            originX, originY, Timing.PROJECTILE_ITEM_DIAMOND_DELTA_X,
            Timing.PROJECTILE_ITEM_DIAMOND_DELTA_Y);
        }

    @Override
    protected void doMovement() {
        //super.doMovement(); //To change body of generated methods, choose Tools | Templates.
        setX(getX() - deltaX);
        setY(getY() + deltaY);
    }
    
}
