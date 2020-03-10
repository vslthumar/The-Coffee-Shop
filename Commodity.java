/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the interface of commodity of products which is implemented by other class/classes.
 *
 * @author Vishal Thumar
 */
public interface Commodity {

    /**
     * this is the empty model method which returns production cost in other
     * classes
     *
     * @return
     */
    public double getProductionCost();

    /**
     * this is the empty model method which returns retail price in other class
     *
     * @return
     */
    public double getRetailPrice();

}
