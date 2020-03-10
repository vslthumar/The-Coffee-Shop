/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the interface of consumable products which is implemented by other class/classes.
 *
 * @author Vishal Thumar
 */
public interface Consumable {

    /**
     * this is the empty model method which returns calorie count in other
     * classes
     *
     * @return
     */
    public int getCalorieCount();

    /**
     * this is the empty model method which returns consumption method in other
     * classes
     *
     * @return
     */
    public String getConsumptionMethod();
}
