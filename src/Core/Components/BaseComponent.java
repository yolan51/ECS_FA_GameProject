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
public class BaseComponent implements ComponentsInterface{
        protected boolean update = false;

        protected static int NEXT_COMPONENT_TYPE_ID_ = 0;


        protected static int GetNextComponentTypeId()
        {
            return NEXT_COMPONENT_TYPE_ID_++;
        }

        public int ID;

        // Component's owner
        public Entity Owner;


        public BaseComponent(int id, Entity e)
        {

            ID = id;
            Owner = e;
        }   
}
