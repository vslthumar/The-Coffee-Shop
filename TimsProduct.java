/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class defines Tims Product and it's properties, specification as a model, which implements Commodity interface
 *
 * @author Vishal Thumar
 */
public abstract class TimsProduct implements Commodity {

    /**
     * declaration of name field
     */
    private String name;

    /**
     * declaration of cost field
     */
    private double cost,
            /**
             * declaration of price field
             */
            price;

    /**
     * constructor of the class with proper parameters
     *
     * @param name
     * @param cost
     * @param price
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * returns name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Overrides from Commodity interface, returns production cost
     *
     * @return
     */
    @Override
    public double getProductionCost() {
        return cost;
    }

    ;
    
    /**
     * Overrides from Commodity interface, returns production cost
     * @return
     */
    @Override
    public double getRetailPrice() {
        return price;
    }

    ;

    /**
     * Overrides and is overridden, returns string 
     * @return
     */
    @Override
    public String toString() {
        return "TimsProduct{" + "name=" + name + ", cost=" + cost + ", price=" + price + '}';
    }
}
