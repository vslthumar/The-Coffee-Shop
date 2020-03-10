
import java.util.Scanner;
import javafx.scene.paint.Color;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class prepares a Mug by inherit TimsProduct class, also defines Mug's
 * properties and specifications
 * @author Vishal Thumar
 */
public class Mug extends TimsProduct {

    /**
     * declaration of variable for color
     */
    private Color color;

    /**
     * constructor of the class with proper parameters declaration
     * @param color
     * @param name
     * @param cost
     * @param price
     */
    private Mug(Color color, String name, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }
    
    /**
     * creates Mug with user input and returns private constructor of the class 
     * @return
     */
    public static Mug create(){
        Scanner sc=new Scanner(System.in);
        String name="Tim's Official Mug";
        double cost=2.5;
        double price=4.75;
        System.out.println("Which color of Mug do you want?");
        String text=sc.next();
        Color color;
        color = Color.web(text);
        
        return (new Mug(color,name,cost,price));
        
    }

    /**
     * returns color of the Mug
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * overrides toString method and returns a string
     * @return
     */
    @Override
    public String toString() {
        return "Tims Product { Name:" + super.getName() + ", Cost:$"+ super.getProductionCost() + ", Price:$"+ super.getRetailPrice() +"}\n"
                +"Type: Mug [Color: "+getColor()+"]";
    }
    
    
}
