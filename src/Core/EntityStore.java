/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Core.Components.BaseComponent;
import java.util.HashMap;

/**
 *
 * @author Yo
 */
public class EntityStore {
         /// Generic Box to store  the components
        public class Box<T>
        {
            public HashMap<Entity, T> Components_ = new HashMap<>();
        }

        /// This dictionnary contains the boxes and stores every components by their type
        private  HashMap<Integer, Box<BaseComponent>> Boxes = new HashMap<>();
        
        public <T extends BaseComponent> void addComponents(T component){

            Box<BaseComponent> box;
            box = GetBox(component);

            // means there's no box for this type of component
            if(box == null)
            {
                // Creating a box for the type of component the user wants to store
                box = new Box<>();
                Boxes.put(component.ID, box);
            }

            // Adding the component to the box
            box.Components_.put(component.Owner, component);

        }
        public <T extends BaseComponent> T GetComponent(Entity owner)
        {
            return null;
//            T comp;
//            T<BaseComponent> stringA = new T<BaseComponent>();
//            Box<BaseComponent> box;
//
//            // Getting the box
//            Boxes_.TryGetValue(x.ID_, out box);
//
//            // means there's no box for the asked component , so we return null
//            if (box == null)
//            {
//                return null;
//            }
//
//            // From here the box for the specified component exists
//
//            BaseComponent component;
//
//            // Getting the component from the box 
//            box.Components_.TryGetValue(owner, out component);
//
//            // Returns the component casted to the concrete type or null if the component doesn't exist
//            return component == null ? null : (T)component;
        }
        public  <T extends BaseComponent> Box<BaseComponent> GetBox(T component)
        {
            
            Box<BaseComponent> box = Boxes.get(component.ID);

            return box;
            
        }
}
