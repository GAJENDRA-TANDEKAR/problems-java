package javaFunctionsOrMethodDay1Shub;

public class FunctionInstanceMethod {


         void printWelcomeMessage() {      //1st Type --> function with -->  no return type no  passing parameter
            System.out.println(" welcome come back  Gajendra ");
        }
         void  printMyName( String name , int a,int b,char cha){    // 2nd type  --->>>   no return type , with parameter ( String name )
            //   variable declaration               //  functionName( data type + variable name , dataType variableName , dataType VariableName )
            System.out.println(" welcome gajendra " +name +" "+a +" " +b +" "+cha);    //  + for concatination  and  data variable name
        }
          String getTodayDay(){   // 3rd type -->   return type ,no parameters
            //  here String is a return type // in place of string we use data types
            String day = "tusday";

            return day;                                 //for return we use return key word

        }
         int getLengthOfMyName( String name){   //  4th type  --->>>   return type ,with parameters
            // int len = getLengthOfMyName("Gajendra");

            return name.length();
        }
        public static void main(String[] args) {


            FunctionInstanceMethod a = new FunctionInstanceMethod();    // to create object of a claaa -->>  ( className ) (objectName) = new (className)
                                                                                   // calling method -->>  object.(Method Name which is present in class)

            a.printWelcomeMessage();     //1st type    //   read 1 point of calling function

            a.printMyName("tandekar",100,600,'A');    //2dn type  //  ("tandekar") --->>>  value called argument   or  passing string name  // calling the function
            // called by value function

            System.out.println("what is the today day = " +a.getTodayDay()); // 3rd type -->>  return type ,no parameters

            int len = a.getLengthOfMyName("GajjuGajju");         //  4th type  -->> return type ,with parameters

            System.out.println("lengt of the my name is =  "+len );

        }

    }
    // in no return value  we use void
    // and for return value we can use int (data types )  instance of void




// for ststic method -->>
// if function is in the class and it is used  ststic  modifier is use  then we do not need to creat  object of a class for calling . we can call method directly
//// in static method we can calling method by creating object or we can call directly
//
// but in instsnce method
// for instsnce method we not use static modifier
// we calling method by  using creating class object   like ( className ) (objectName) = new (className)
// calling method -->>  object.(Method Name which is present in class)