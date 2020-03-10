
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class prepares a Donut by inherit TimsProduct class and implementing
 * Consumable interface, also defines Donut's properties and specifications
 *
 * @author Vishal Thumar
 */
public class Donut extends TimsProduct implements Consumable {

    /**
     * declaration of the variable for description of donut
     */
    private String description;

    /**
     * declaration of the variable for calorie count of donut
     */
    private int calorieCount;

    /**
     * constructor of the class with proper parameters
     *
     * @param description
     * @param calorieCount
     * @param name
     * @param cost
     * @param price
     */
    private Donut(String description, int calorieCount, String name, double cost, double price) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    /**
     * creates a donut by taking user input and returns a private constructor of
     * the class
     *
     * @return
     */
    public static Donut create() {
        String description = "Kruller";
        int calorieCount = 198;
        String name = "Tim's freshly baked Donut";
        double cost = 0.33;
        double price = 1.25;
        return (new Donut(description, calorieCount, name, cost, price));
    }

    /**
     * returns description of the donut
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * override method from Consumable interface and returns calorie count
     *
     * @return
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * override method from Consumable interface and returns CunsumptionMethod
     * as a string
     *
     * @return
     */
    @Override
    public String getConsumptionMethod() {
        return "Eat it.";
    }

    /**
     * override toString method, returns string
     *
     * @return
     */
    @Override
    public String toString() {
        return "Tims Product { Name:" + super.getName() + ", Cost:$" + super.getProductionCost() + ", Price:$" + super.getRetailPrice() + "}\n"
                + "Type: Donut [Description:" + description + ", Calorie count:" + getCalorieCount() + ", Consumption method:" + getConsumptionMethod() + "]";
    }

}
