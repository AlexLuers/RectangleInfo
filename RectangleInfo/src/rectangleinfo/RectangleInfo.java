/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangleinfo;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class RectangleInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double sideOne = 0;
        double sideTwo = 0;
        double hypotenuse;
        double area;
        double perimeter;
        
        System.out.println("What is length of the rectangel?");
        if (in.hasNextDouble())
        {
            sideOne = in.nextDouble();
        }
        else
        {
            System.out.println("That is not a valid input. Please try again! ");
        }
        System.out.println("What is the width of the rectangle?");
        if (in.hasNextDouble())
        {
            sideTwo = in.nextDouble();
        }
        else
        {
            System.out.println("That is not a valid input. Please try again! ");
        }
        area = sideOne * sideTwo;
        System.out.println("The area of the rectangle is " + area);
        perimeter = sideOne + sideTwo;
        perimeter = perimeter * 2;
        System.out.println("The perimeter of the rectangle is " + perimeter);
        
    }
    
}
