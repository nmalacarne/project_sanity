package project_sanity.essence.sanity;

import java.util.logging.Logger;
import project_sanity.IMendable;
import project_sanity.IWoundable;
import project_sanity.counter.Delusion;
import project_sanity.essence.AEssence;
import project_sanity.pool.Pool;
import project_sanity.range.Range;

/**
 *
 * @author nicholas
 */
public class Sanity extends AEssence implements IWoundable, IMendable {

    private final static Logger LOG = Logger.getLogger(Sanity.class.getName());
    
    private final Range range;
    
    private final Pool pool;

    public Sanity() {
        this.range = new Range(0, 100);
        this.pool = new Pool(new Delusion());
    }

    @Override
    public void wound() {
        if ( this.getWounds() < range.getMAX()){
            this.pool.addCounter();
        }else{
            // alert wounds full -nm
        }
    }

    @Override
    public int getWounds() {
        return this.pool.getCount();
    }

    @Override
    public void mend() {
        if (this.getWounds() > range.getMIN()){
            this.pool.removeCounter();
        }else{
            // alert wounds empty -nm
        }
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
        int total = this.range.getMAX() - this.pool.getCount() - super.getValue();
        return range.rangeCheck(total);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
