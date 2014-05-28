/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.attribute;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.IDecayable;
import project_sanity.IGrowable;
import project_sanity.IResetable;
import project_sanity.IValuable;
import project_sanity.counter.ACounter;
import project_sanity.counter.Decay;
import project_sanity.range.Range;

/**
 *
 * @author nicholas
 */
public abstract class AAttribute implements IDecayable, IGrowable, 
                                            IValuable,  IResetable {
    
    private final int m_default;
    private final Range m_range;
    private final Deque<ACounter> m_decay;

    public AAttribute(int value) {
        m_range   = new Range(1, 10);
        m_default = m_range.rangeCheck(value);
        m_decay   = new ArrayDeque<>();
    }

    @Override
    public void reset() {
        m_decay.clear();
    }

    @Override
    public void decay() {
        m_decay.add(new Decay());
    }

    @Override
    public void grow() {
        m_decay.pollFirst();
    }

    @Override
    public int getValue() {
        int total = m_range.getMAX() - (m_range.getMAX() - m_default) - m_decay.size();
        return m_range.rangeCheck(total);
    }
}
