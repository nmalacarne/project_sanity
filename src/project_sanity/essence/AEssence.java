package project_sanity.essence;

import java.util.logging.Logger;
import project_sanity.IDecayable;
import project_sanity.IGrowable;
import project_sanity.IValuable;
import project_sanity.counter.Decay;
import project_sanity.pool.Pool;

/**
 * Used to manage a 'health' system.
 * 
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public abstract class AEssence implements IDecayable, IGrowable, IValuable {
    
    private final static Logger LOG = Logger.getLogger(AEssence.class.getName());
    
    private final Pool pool;

    /**
     * sole constructor
     */
    public AEssence() {
        this.pool = new Pool(new Decay());
    }
    
    /**
     * Increase number of decay counters by one
     */
    @Override
    public void decay() {
        this.pool.addCounter();
    }

    /**
     * Decrease number of decay counters by one
     */
    @Override
    public void grow() {
        this.pool.removeCounter();
    }
    
    /**
     * 
     * @return int  current number of decay counters
     */
    @Override
    public int getValue() {
        return this.pool.getCount();
    }
}
