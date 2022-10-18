package javaFunctionsOrMethodDay1Shub;

import java.util.Scanner;

public class CalculateAreas {
    int areaofRectangle(int l, int b){
        int area = l * b;
        return area;
    }
      double areaOfTriangle(double l , double b){
        double area = 0.5 * l * b;
         return area;
     }

     double piValue(){
        return 3.14;
     }
      double areaCircle(double r){
        double pi = piValue();
          double area= pi * r * r;
          return area;
      }




    public static void main(String[] args) {
        CalculateAreas calculate = new CalculateAreas();    ///  created object of a class  // CalculateAreaOfRectangle() RHS is also called constructor

        Scanner  sc = new Scanner(System.in);                 // obj of scanner class creation   // for user input we created scanner obj  with sc reference variable

        System.out.println("enter value of Length =  ");
        int l = sc.nextInt();                                     // taking user input in this line

        System.out.println("enter the value of breadth =  ");
        int b = sc.nextInt();                                     // taking user input in this line


       // int areaofRect = calculate.areaofRectangle(4,2);
        int areaofRect = calculate.areaofRectangle(l,b);       // calling function   and assining variable
        System.out.println("area of rectangle =  "+areaofRect);

        double  areaOFTrianglee = calculate.areaOfTriangle(l,b);
        System.out.println("area of Triangle =  "+areaOFTrianglee);

        System.out.println(" enter the value of radius =  ");
        int r =sc.nextInt();


      //  double areaofCircle = calculate.areaCircle(r);
        //  System.out.println("area of circle = "+areaofCircle);
        System.out.println(" area of circle = "+ calculate.areaCircle(r));





    }

}

