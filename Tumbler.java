
import javafx.scene.paint.Color;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class prepares a Tumbler by inherit TimsProduct class, also defines
 * Tumbler's properties and specifications
 * @author Vishal Thumar
 */
public class Tumbler extends TimsProduct {

    /**
     * declaration of the variable for color
     */
    private Color color;

    /**
     * constructor of the class with proper parameters
     * @param color
     * @param name
     * @param cost
     * @param price
     */
    private Tumbler(Color color, String name, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }
    
    /**
     * creates Tumbler with user inputs and returns a private constructor of the class
     * @return
     */
    public static Tumbler create(){
        Scanner sc=new Scanner(System.in);
        String name="Tim's Official Tumbler";
        double cost=3.5;
        double price=8.75;
        System.out.println("Which color of Tumbler do you want?");
        String text=sc.next();
        Color color;
        color = Color.web(text);
        return (new Tumbler(color,name,cost,price));    
    }

    /**
     * returns color of the Tumbler
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * Override toString method, returns string
     * @return
     */
    @Override
    public String toString() {
        return "Tims Product { Name:" + super.getName() + ", Cost:$"+ super.getProductionCost() + ", Price:$"+ super.getRetailPrice() +"}\n"
                +"Type: Tumbler [Color: "+getColor()+"]";
    }
    
    
}
