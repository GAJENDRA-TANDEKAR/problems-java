package stringsInJava;

public class CountCharacterInString {

    public static void main(String[] args) {
        String string = " hello my friend.";   //      14 character (letter)  includind .(dot)
        int count = 0;


        for (int i = 0; i < string.length(); i++) {      //Counts each character except space
            if (string.charAt(i) != ' ')                  //
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println();
        System.out.println(string);
        System.out.println("Total number of characters in the string: " + count);


    }

}

