/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class prepares a IcedCoffee by inherit TimsProduct class and implementing Consumable interface, also defines Iced coffee's properties and specifications
 *
 * @author Vishal Thumar
 */
public class IcedCoffee extends TimsProduct implements Consumable {

    /**
     * declaration of the variable for description of the iced coffee
     */
    private String description;

    /**
     * declaration of the variable for calorie count of iced coffee
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
    private IcedCoffee(String description, int calorieCount, String name, double cost, double price) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    /**
     * creates an iced coffee by taking user input and returns a private
     * constructor of the class
     *
     * @return
     */
    public static IcedCoffee create() {
        String description = "Cold Coffee";
        int calorieCount = 160;
        String name = "Tim's Premium Blend Chilled Iced Coffee";
        double cost = 0.99;
        double price = 2.29;
        return (new IcedCoffee(description, calorieCount, name, cost, price));
    }

    /**
     * returns description of the iced coffee
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
        return "Drink it.";
    }

    /**
     * override toString method, returns string
     *
     * @return
     */
    @Override
    public String toString() {
        return "Tims Product { Name:" + super.getName() + ", Cost:$" + super.getProductionCost() + ", Price:$" + super.getRetailPrice() + "}\n"
                + "Type: Iced Coffee [Description:" + description + ", Calorie count:" + getCalorieCount() + ", Consumption method:" + getConsumptionMethod() + "]";
    }

}
