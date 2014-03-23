/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.effect.condition;

import project_sanity.effect.AEffect;
import project_sanity.range.Range;

/**
 *
 * @author nicholas
 */
public abstract class ACondition extends AEffect {
    
    private final static Range DURATION = new Range(1, 10);
    
    @Override
    public void decay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
