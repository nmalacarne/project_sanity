package project_sanity.essence.blood;

import project_sanity.IMendable;
import project_sanity.IWoundable;
import project_sanity.counter.Wound;
import project_sanity.essence.AEssence;
import project_sanity.pool.Pool;
import project_sanity.range.Range;

/**
 *
 * @author nicholas
 */
public class Blood extends AEssence implements IWoundable, IMendable {
    
    private final Range range;
    
    private final Pool pool;

    public Blood() {
        this.range = new Range(0, 100);
        
        this.pool = new Pool(new Wound());
    }

    @Override
    public void wound() {
        this.pool.addCounter();
    }

    @Override
    public void mend() {
        this.pool.removeCounter();
    }
    
    @Override
    public void decay() {
        if (super.getValue() < range.getMAX()){
            super.decay();
        }else{
            // alert blood empty -nm
        }
    }

    @Override
    public void grow() {
        if (super.getValue() > range.getMIN()){
            super.grow();
        }else{
            // alert blood full -nm
        }
    }
    
    @Override
    public int getValue() {
        int total = range.getMAX() - pool.getCount() - super.getValue();
        return range.rangeCheck(total);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
