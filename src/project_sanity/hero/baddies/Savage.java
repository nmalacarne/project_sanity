/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.hero.baddies;

import java.util.HashMap;
import java.util.Map;
import project_sanity.essence.AEssence;
import project_sanity.essence.blood.Blood;
import project_sanity.essence.sanity.Sanity;
import project_sanity.hero.AI;

/**
 *
 * @author nicholas
 */
public class Savage extends AI {
    
    private final Map<Class, AEssence> essences;

    public Savage() {
        essences = new HashMap<>();
        essences.put(Blood.class, new Blood());
        essences.put(Sanity.class, new Sanity());
    }
}
