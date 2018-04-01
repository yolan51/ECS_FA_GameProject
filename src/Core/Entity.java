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
public abstract class Entity{
    private int id;
    private EntityStore entityStore;
    public static int counterId = 0;

    protected Entity(EntityStore s){
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

    public <T extends BaseComponent> T GetComponent()
    {
        
        return entityStore.GetComponent(this);
    }
}
