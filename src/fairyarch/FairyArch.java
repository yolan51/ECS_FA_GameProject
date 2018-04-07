/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairyarch;

import Core.Components.GraphicComponent;
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
        
        //entity 1
        Entity mytest = new Entity(test);
        PositionComponent mycomp = new PositionComponent(mytest);
        mycomp.x =10;
        mytest.AddComponent(mycomp);
        
        PositionComponent mycomp2 = new PositionComponent(mytest);
        mycomp2.x = 12;
        mytest.AddComponent(mycomp2);
        GraphicComponent mycomp3 = new GraphicComponent(mytest);
        mycomp3.x = 12;
        mytest.AddComponent(mycomp3);
        
        //entity 2
                Entity mytest2 = new Entity(test);
        PositionComponent mycomp22 = new PositionComponent(mytest2);
        mycomp22.x =10;
        mytest.AddComponent(mycomp22);
        
        PositionComponent mycomp223 = new PositionComponent(mytest2);
        mycomp223.x = 12;
        mytest.AddComponent(mycomp223);
        GraphicComponent mycomp32 = new GraphicComponent(mytest2);
        mycomp32.x = 48;
        mytest.AddComponent(mycomp32);
        //affichage test code
        System.out.println(mycomp2.x);
        System.out.println(test.getBoxes().get(mycomp32.Type_).Components_.size());
    }
    
}
