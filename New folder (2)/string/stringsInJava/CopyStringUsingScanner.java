package stringsInJava;

import java.util.Scanner;

public class CopyStringUsingScanner {
    public static void main(String[] args)
    {
        String strOrig;
        String strCopy;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
         strOrig= scan.nextLine();

        strCopy = strOrig;   //// copying original     we just assine value of a=b means if a = 1 then value of b also 1 like that we copying one string to another

        System.out.println("strOrig = " +strOrig);
        System.out.println("strCopy = " +strCopy);
    }
}
