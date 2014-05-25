package project_sanity.essence;

import project_sanity.IBuildable;
import project_sanity.pool.decay.DecayPool;
import project_sanity.pool.wound.WoundPool;
import project_sanity.range.Range;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class Essence {

    private final Range range;
    
    private final DecayPool decay;
    private final WoundPool wounds;

    private Essence(Essence.Builder build) {
        this.range = build.range;
        
        this.decay  = new DecayPool();
        this.wounds = new WoundPool();
    }

    public static class Builder implements IBuildable<Essence> {
    
        private final Range range;

        public Builder(Range range) {
            this.range = range;
        }

        @Override
        public Essence build() {
            return new Essence(this);
        }
    }
}
