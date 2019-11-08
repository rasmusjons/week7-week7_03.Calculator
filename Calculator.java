
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Calculator {

    private Reader reader;

    private int calculations;

    public Calculator() {
        reader = new Reader();

    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum(){
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
  

        System.out.println("Sum of the values: " + (value1 + value2));
        calculations++;

    }

    private void difference() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
      

        
        System.out.println("Difference of the values: " + (value1 - value2));
        calculations++;
    }

    private void product() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();

        System.out.println("Product of the values: " +  value1 * value2);
        calculations++;
    }

    private void statistics() {
        System.out.println("Calculations done" + calculations); 

    }

   

}
