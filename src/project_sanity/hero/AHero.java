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
    
    private final Map<Class, AEssence>      m_ess;
    private final Map<Class, AAttribute>    m_att;

    public AHero() {
        
        m_ess    = new HashMap<>();
        m_att  = new HashMap<>();
        
        m_ess.put(Blood.class, new Blood());
        m_ess.put(Sanity.class, new Sanity());
        
        m_att.put(Strength.class, new Strength(3));
        m_att.put(Dexterity.class, new Dexterity(3));
        m_att.put(Intelligence.class, new Intelligence(3));
    }
}
