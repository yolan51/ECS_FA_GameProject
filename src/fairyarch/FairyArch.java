/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairyarch;

import Core.Components.PositionComponent;
import Core.Entity;
import Core.EntityStore;

/**
 *
 * @author Yo
 */
public class FairyArch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityStore test = new EntityStore();
        Entity mytest = new Entity(test);
        PositionComponent mycomp = new PositionComponent(mytest);
        mycomp.x =10;
        mytest.AddComponent(mycomp);
        
        PositionComponent mycomp2 = new PositionComponent(mytest);
        mycomp2.x = 12;
        mytest.AddComponent(mycomp2);
        
        mycomp2 = mytest.GetComponent(mycomp);
        System.out.println(mycomp2.x);
        
    }
    
}
