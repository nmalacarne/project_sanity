/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public interface IBuildable<T extends Object> {

    T build();
}
