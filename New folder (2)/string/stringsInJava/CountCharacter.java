package stringsInJava;

public class CountCharacter {
    public static void main(String[] args) {
        String string = "The best of both worlds";  //
        int count = 0;
        char len = string.charAt(0);

        //Counts each character except space
        for(int i = 0; i < string.length(); i++) {  // in this for loop i=0 means in string  0 position in T so i=0=T , i=1=h ,i=2=e, i=3=space ,i=4=b and so on ..... // i < string.length() for tis condition value of i is less then string length
            if(string.charAt(i) != ' ')   //   in this line   charAt()  method call  wew dont wont spece count so ( string.charAt(i) != ' '  ) we assine charAt position  is not equle to space charactor
                count++;                  //  storing value of string except space
        }

        //Displays the total number of characters present in the given string
        System.out.println(string);
        System.out.println(len);
        System.out.println("Total number of characters in a string: " + count);
    }
}
