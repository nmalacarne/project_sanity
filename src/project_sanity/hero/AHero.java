/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.hero;

import java.util.HashMap;
import java.util.Map;
import project_sanity.attribute.AAttribute;
import project_sanity.attribute.Dexterity;
import project_sanity.attribute.Intelligence;
import project_sanity.attribute.Strength;
import project_sanity.essence.AEssence;
import project_sanity.essence.blood.Blood;
import project_sanity.essence.sanity.Sanity;

/**
 *
 * @author nicholas
 */
public abstract class AHero {
    
    private final Map<Class, AEssence>      essences;
    private final Map<Class, AAttribute>    attributes;

    public AHero() {
        
        essences    = new HashMap<>();
        attributes  = new HashMap<>();
        
        essences.put(Blood.class, new Blood());
        essences.put(Sanity.class, new Sanity());
        
        attributes.put(Strength.class, new Strength(3));
        attributes.put(Dexterity.class, new Dexterity(3));
        attributes.put(Intelligence.class, new Intelligence(3));
    }
}
