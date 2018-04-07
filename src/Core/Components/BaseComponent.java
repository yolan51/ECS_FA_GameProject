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
 * @param <T>
 */
public class  BaseComponent<T extends BaseComponent> implements ComponentsInterface{
        protected boolean update = false;

        public Class<T> Type_;

        // Component's owner
        public Entity Owner;


        public BaseComponent(Entity e,Class<T> type)
        {
            Type_ =type;
            Owner = e;
        }   
}
