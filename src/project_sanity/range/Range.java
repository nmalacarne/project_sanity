/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.range;

/**
 *
 * @author nicholas
 */
public class Range {
    
    private final int MIN;
    private final int MAX;

    public Range(int MIN, int MAX) {
        this.MIN = MIN;
        this.MAX = MAX;
    }

    public int getMIN() {
        return MIN;
    }

    public int getMAX() {
        return MAX;
    }
    
    public boolean isInRange(int value){
        
        return ( value >= MIN && value <= MAX );
    }
}
