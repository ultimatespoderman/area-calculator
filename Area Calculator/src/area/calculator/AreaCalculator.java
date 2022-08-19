/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.calculator;

import java.util.Scanner;

/**
 *
 * @author Wonarche
 */
abstract class Shape {
    
    public abstract double getArea();
}
class Circle{
    
    public double radius;
    public double area;
    
    public Circle(double radius){
        radius = 0;
    }

public double getRadius(){
    return radius;
}

public void setRadius(double radius){
    this.radius = radius;
}

public double getArea(){
    return (radius * radius) * 3.14; 
}
}

class Square extends Shape {
    
    public double width;
    public double area;
    
    public Square(double width){
        width = 0;
    }

public double getWidth(){
    return width;
}

public void setWidth(double width){
    this.width = width ;
}

public double getArea(){
    return width * width;
}
}

class Rectangle extends Shape {
    public double width;
    public double height;
    public double area;
    
    public Rectangle(double width, double height){
        width = 0;
                height = 0;
    }

public double getHeight(){
    return height;
}

public void setHeight(double height){
    this.height = height;
}
public double getWidth(){
    return width;
}

public void setWidth(double width){
    this.width = width ;
}

public double getArea(){
    return height * width;
}
}

class input {

 
    
     public  String getRequiredString(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
     public  String getChoiceString2(Scanner sc, String prompt,
            String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(sc, prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
     public  String getChoiceString(Scanner sc, String prompt,
            String s1, String s2, String s3) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(sc, prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2) && !s.equalsIgnoreCase(s3)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + " ' or ' "+ s3 + " '. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
}



public class AreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 0;
          double width = 0;
    double height = 0;
    double area = 0;
    
        input output = new input();
        Rectangle r = new Rectangle(height, width);
        Square s = new Square(width);
        Circle c = new Circle(radius);
         String choice = "y";
        
        System.out.println("Welcome to the Area Calculator");
        System.out.println();
        
                  while (choice.equalsIgnoreCase("y")) { 
                      
                      choice = output.getChoiceString(sc, "Calculate area of a circle, square, or rectangle? (c/s/r): ", "c", "s", "r");
                      
                      if (choice.equalsIgnoreCase("c")){
              
              //get input from user and saves info to other class
              System.out.print("Emter radius: ");
              radius = sc.nextDouble();
              c.setRadius(radius);
              System.out.print("The area of the Circle you entered is ");
               System.out.println(c.getArea());
                      }
                      else if(choice.equalsIgnoreCase("r")) {
    //get input from user and saves info to other class
         System.out.print("Enter width: ");
              width = sc.nextDouble();
              r.setWidth(width);
              
              System.out.print("Enter height: ");
              height = sc.nextDouble();
              r.setHeight(height);
              System.out.print("The area of the Rectangle you entered is ");
               System.out.println(r.getArea());
                      }
                       else if(choice.equalsIgnoreCase("s")){
                      
              
              //get input from user and saves info to other class
              System.out.print("Emter radius: ");
              width = sc.nextDouble();
              s.setWidth(width);
                      
              System.out.print("The area of the Square you entered is ");
               System.out.println(s.getArea());
                  }
        
                      // see if the user wants to continue  
            choice = output.getChoiceString2(sc, "Continue? (y/n): ", "y", "n");
            System.out.println();
    }
    }
}     

