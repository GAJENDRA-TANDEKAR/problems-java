package stringsInJava;

import java.util.Scanner;

public class ConcatenateTwoSrtingScanner {
    public static void main(String[] args)
    {
        String a;
        String b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First String: ");
        a = scan.nextLine();
        System.out.print("Enter the Second String: ");
        b = scan.nextLine();

        a = a.concat ( b);      ///  concat method
        System.out.println("First string after concatenation: " +a);
    }
}
