package lab4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class RectangleArea {
    double a, b, area;

    public void getData(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter length: ");
        a=s.nextDouble();
        System.out.print("Enter width: ");
        b=s.nextDouble();
    }

    public void computeField(){
        area=a*b;
    }

    public void fieldDisplay(){
        System.out.println("Length: "+a);
        System.out.println("Width: "+b);
        System.out.println("Area of rectangle: "+area);
    }

}
