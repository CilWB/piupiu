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
public class Item extends Projectile {

    public Item(String spriteName, double width, double height,
            int damage, double originX, double originY, double deltaX, double deltaY) {
        super(spriteName, width, height, damage, originX, originY, deltaX, deltaY);
    }
    
}
