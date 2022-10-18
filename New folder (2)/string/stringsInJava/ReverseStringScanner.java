package stringsInJava;

import java.util.Scanner;

public class ReverseStringScanner {
    public static void main(String[] args)
    {
        String str;
        String strReverse="";
        int  i;
        char ch;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        str = s.nextLine();
        for(i=str.length() - 1; i>=0; i--)
        {
            ch = str.charAt(i);                   //  charAt()   method
            strReverse = strReverse + ch;
        }

        System.out.println("Reverse = " +strReverse);
    }
}


 //while loop
//  len = str.length();
//          i = (len-1);
//          while(i>=0)
//          {
//          ch = str.charAt(i);
//          strReverse = strReverse + ch;
//          i--;
//          }
