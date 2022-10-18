package javaFunctionsOrMethodDay1Shub;

import java.util.Scanner;

public class CalculateAreaUsingLoop {
    int areaofRectangle(int l, int b) {
        int area = l * b;
        return area;
    }

    double areaOfTriangle(double l, double b) {
        double area = 0.5 * l * b;
        return area;
    }

    double piValue() {
        return 3.14;
    }

    double areaCircle(double r) {
        double pi = piValue();
        double area = pi * r * r;
        return area;
    }


    public static void main(String[] args) {

        CalculateAreaUsingLoop calculate = new CalculateAreaUsingLoop();    ///  created object of a class  // CalculateAreaOfRectangle() RHS is also called constructor

        Scanner sc = new Scanner(System.in);                 // obj of scanner class creation   // for user input we created scanner obj  with sc reference variable
        int l;
        int b;
        int r;
        int ch;
        do {
            System.out.println("1 ->  areaofRectangle");
            System.out.println("2 ->  areaOfTriangle");
            System.out.println("3 ->  areaofRectangle");
            System.out.println(" Enter your choices = ");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("enter value of Length =  ");
                    l = sc.nextInt();                                     // taking user input in this line

                    System.out.println("enter the value of breadth =  ");
                    b = sc.nextInt();                                     // taking user input in this line

                    int areaofRect = calculate.areaofRectangle(l, b);       // calling function   and assining variable
                    System.out.println("area of rectangle =  " + areaofRect);
                    break;

                case 2:
                    System.out.println("enter value of Length =  ");
                    l = sc.nextInt();                                     // taking user input in this line

                    System.out.println("enter the value of breadth =  ");
                    b = sc.nextInt();                                     // taking user input in this line

                    double areaOFTrianglee = calculate.areaOfTriangle(l, b);
                    System.out.println("area of Triangle =  " + areaOFTrianglee);

                    break;

                case 3:
                    System.out.println(" enter the value of radius =  ");
                    r = sc.nextInt();
                    //  double areaofCircle = calculate.areaCircle(r);
                    //  System.out.println("area of circle = "+areaofCircle);
                    System.out.println(" area of circle = " + calculate.areaCircle(r));
                    break;
                default:
                    System.out.println(" invalide choice ");
                    break;


            }
            System.out.println("do you want to continue  press 1  AND for exit 0");
            ch = sc.nextInt();

        } while (ch == 1);
    }
}



















