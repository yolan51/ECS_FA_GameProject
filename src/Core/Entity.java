/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Core.Components.BaseComponent;


/**
 *
 * @author Yo
 */
public class Entity{
    private final int id;
    private EntityStore entityStore;
    private static int counterId = 0;

    public Entity(EntityStore s){
        this.id = setIDValue();
        entityStore = s;
    }
    
    private int setIDValue(){
        
            counterId++;
            return counterId;
    }
    public <T extends BaseComponent> void AddComponent(T c)
    {
        entityStore.addComponents(c);
    }

    public <T extends BaseComponent> T GetComponent(T comp)
    {
        
        return entityStore.GetComponent(comp,this);
    }
}
