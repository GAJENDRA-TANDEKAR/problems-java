package stringsInJava;

import java.util.Scanner;

public class RemoveVowelsFromStringScanner {
    public static void main(String[] args)
    {
        String str, strRes, vowels;
        char ch;
        int i, count, k;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        str = scan.nextLine();

        strRes="";
        vowels = "aeiouAEIOU";      ///  you can also use scanner class in this line like
                                    //   System.out.println(" remove enter ");
                                    //   vowels = scan.nextLine();
        for(i=0; i<str.length(); i++)
        {
            count=0;
            ch = str.charAt(i);
            for(k=0; k<vowels.length(); k++)
            {
                if(ch==vowels.charAt(k))
                    count++;
            }
            if(count==0)
                strRes = strRes + ch;
        }

        System.out.println("String without Vowels = " +strRes);
    }
}



/*

 public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the String: ");
      String str = scan.nextLine();

      str = str.replaceAll("[aeiouAEIOU]", "");                              using direct replaceAll("")   method
      System.out.println("\nString without Vowels = " +str);
   }

 */