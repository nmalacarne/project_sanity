package project_sanity.essence.sanity;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.IMendable;
import project_sanity.IWoundable;
import project_sanity.counter.ACounter;
import project_sanity.counter.Wound;
import project_sanity.essence.AEssence;
import project_sanity.range.Range;

/**
 *
 * @author nicholas
 */
public class Sanity extends AEssence implements IWoundable, IMendable {

    private final Range range;
    
    private final Deque<ACounter> delusionPool;

    public Sanity() {
        range = new Range(0, 100);
        delusionPool = new ArrayDeque<>();
    }

    @Override
    public void wound() {
        delusionPool.add(new Wound());
    }

    @Override
    public void mend() {
        delusionPool.pollFirst();
    }
    
    @Override
    public void decay() {
        if (super.getValue() < range.getMAX()){
            super.decay();
        }else{
            // alert sanity empty -nm
        }
    }

    @Override
    public void grow() {
        if (super.getValue() > range.getMIN()){
            super.grow();
        }else{
            // alert sanity full -nm
        }
    }
    
    @Override
    public int getValue() {
        int total = range.getMAX() - delusionPool.size() - super.getValue();
        return range.rangeCheck(total);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
