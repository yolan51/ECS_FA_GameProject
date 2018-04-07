/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core.Components;

import Core.Entity;

/**
 *
 * @author Yo
 */
public class GraphicComponent extends BaseComponent{
    public float x,y;

    public GraphicComponent(Entity e) {
        super(e,GraphicComponent.class);
    }
    
}
