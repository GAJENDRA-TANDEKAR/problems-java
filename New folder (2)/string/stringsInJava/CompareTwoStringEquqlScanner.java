package stringsInJava;

import java.util.Scanner;

public class CompareTwoStringEquqlScanner {
    public static void main(String[] args)
    {
        String strOne, strTwo;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First String:= ");
        strOne = scan.nextLine();
        System.out.print("Enter the Second String:= ");
        strTwo = scan.nextLine();

        if(strOne.equals(strTwo))                            /// equals()  method  is used
            System.out.println("Both Strings are equal.");
        else
            System.out.println("Both Strings are not equal.");
    }
}
