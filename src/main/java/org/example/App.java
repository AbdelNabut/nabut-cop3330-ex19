package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double height = 0;
        double weight = 0;
        double bmi;
        boolean isNumeric = false;
        Scanner input = new Scanner(System.in);
        while(!isNumeric) {
            try {
                System.out.print("What is your height: ");
                height = Integer.parseInt(input.next());
                isNumeric = true;
            } catch(NumberFormatException e) {
                System.out.println("Please input a number.");
                isNumeric = false;
            }
        }
        isNumeric = false;
        while(!isNumeric) {
            try {
                System.out.print("What is your weight: ");
                weight = Integer.parseInt(input.next());
                isNumeric = true;
            } catch(NumberFormatException e) {
                System.out.println("Please input a number.");
                isNumeric = false;
            }
        }
        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + bmi);
        if(bmi >= 18.5 && bmi <= 25)
            System.out.println("You are within the ideal weight range");
        else if(bmi < 18.5)
            System.out.println("You are underweight. You should see a doctor");
        else
            System.out.println("You are overweight. You should see a doctor");

    }
}
