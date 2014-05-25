package project_sanity.essence;

import project_sanity.IMendable;
import project_sanity.IWoundable;
import project_sanity.range.Range;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class Essence implements IWoundable, IMendable {

    private final Range range;
    
    @Override
    public void wound() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mend() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
