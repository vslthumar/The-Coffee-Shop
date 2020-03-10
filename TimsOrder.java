
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class is to prepare Tims Order, stores in into an array, associated with
 * TimsProduct class.
 *
 * @author Vishal Thumar
 */
public class TimsOrder {

    /**
     * declaration of size field
     */
    private int size;

    /**
     * declaration of name field
     */
    private String name;

    /**
     * declaration of an object of TimsProduct class as an array
     */
    private TimsProduct[] t;

    /**
     * scanner class to take user input
     */
    private static Scanner sc = new Scanner(System.in);

    /**
     * constructor of the class with proper parameters passing and also process
     * an order for the user
     *
     * @param size
     * @param name
     */
    private TimsOrder(int size, String name) {
        this.size = size;
        this.name = name;
        t = new TimsProduct[size]; //defines object array size
        for (int i = 0; i < size; i++) { //for loop to store user orders in the array with switch case conditions 

            System.out.println("Which type of product number " + (i + 1) + ", do you want?: Enter 1 for Mug, 2 for Donut,3 for Tumbler & 4 for IcedCoffee: ");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    t[i] = Mug.create();
                    break;
                case 2:
                    t[i] = Donut.create();
                    break;
                case 3:
                    t[i] = Tumbler.create();
                    break;
                case 4:
                    t[i] = IcedCoffee.create();
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;
            }
        }

    }

    /**
     * creates TimsOrder by taking user input and calls/returns the private
     * constructor.
     *
     * @return
     */
    public static TimsOrder create() {

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("How many products you want:  ");
        int size = sc.nextInt();
        return (new TimsOrder(size, name));
    }

    /**
     * calculates total price of the orders and returns total amount payable
     *
     * @return
     */
    public double getAmountDue() {
        double amountDue = 0;
        for (int i = 0; i < size; i++) {
            amountDue += t[i].getRetailPrice();
        }
        return amountDue;
    }

    /**
     * override toString method, which returns a proper output of all orders
     *
     * @return
     */
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output = output + "\n" + t[i].toString() + "\n";
        };
        return "\nOrder for:" + name + "\n" + output;
    }

}
