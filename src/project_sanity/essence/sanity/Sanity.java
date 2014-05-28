package project_sanity.essence.sanity;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import project_sanity.IAlertable;
import project_sanity.IBuildable;
import project_sanity.IMendable;
import project_sanity.IWoundable;
import project_sanity.counter.Delusion;
import project_sanity.essence.AEssence;
import project_sanity.pool.Pool;
import project_sanity.range.Range;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class Sanity extends AEssence implements IWoundable, IMendable {

    private final static Logger LOG = Logger.getLogger(Sanity.class.getName());
    
    private final Range range;
    
    private final Pool pool;
    
    private final List<IAlertable> observers;

    private Sanity(Sanity.Builder builder) {
        
        Sanity.LOG.setLevel(Level.INFO);
        
        this.range = new Range(0, 100);
        
        this.pool = new Pool(new Delusion());
        
        this.observers = builder.observers;
    }

    @Override
    public void wound() {
        if ( this.getWounds() < range.getMAX()){
            this.pool.addCounter();
        }else{
            Sanity.LOG.log(Level.INFO, "{0} full wounds!", this);
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
            Sanity.LOG.log(Level.INFO, "{0} has no wounds!", this);
        }
    }
    
    @Override
    public void decay() {
        if (super.getValue() < range.getMAX()){
            super.decay();
        }else{
            Sanity.LOG.log(Level.INFO, "{0} !", this);
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
    
    public static class Builder implements IBuildable<Sanity>{

        private final List<IAlertable> observers = new ArrayList<>();
        
        public Sanity.Builder addObserver(IAlertable observer){
            
            this.observers.add(observer);
            
            return this;
        }
        
        @Override
        public Sanity build() {
            return new Sanity(this);
        }
    }
}
