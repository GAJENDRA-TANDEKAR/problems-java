//<access_modifier> <return_type> <method_name>( list_of_parameters)
//        {
//        //body
//        }


package javaFunctionsOrMethodDay1Shub;

public class FunctionStaticMethod {

    static  void printWelcomeMessage() {      //1st Type --> function with -->  no return type no  passing parameter
        System.out.println(" welcome come back  Gajendra ");
    }

    static void  printMyName( String name , int a,int b,char cha){    // 2nd type  --->>>   no return type , with parameter ( String name )
                              //   variable declaration               //  functionName( data type + variable name , dataType variableName , dataType VariableName )
        System.out.println(" welcome gajendra " +name +" "+a +" " +b +" "+cha);    //  + for concatination  and  data variable name
    }

     static  String getTodayDay(){   // 3rd type -->   return type ,no parameters
                                                    //  here String is a return type // in place of string we use data types
        String day = "tusday";

        return day;                                 //for return we use return key word

     }

     static int getLengthOfMyName( String name){   //  4th type  --->>>   return type ,with parameters
      //  int len = getLengthOfMyName("Gajendra");

        return name.length();
     }








    public static void main(String[] args) {
        printWelcomeMessage();     //1st type    //   read 1 point of calling function

        FunctionStaticMethod obj = new FunctionStaticMethod();


        System.out.println(" direct calling");
           printMyName("gajju",9,5,'b');
        System.out.println(" call by obj creation");
       obj.printMyName("tandekar",98900,9000,'A');    //2dn type  //  ("tandekar") --->>>  value called argument   or  passing string name  // calling the function
                                                           // called by value function

        System.out.println("what is the today day = " +getTodayDay()); // 3rd type


       int len = getLengthOfMyName("GajjuGajjuGajju");         //  4th type

        System.out.println("lengt of the my name is =  "+len );

    }

}


// ststic means fixed value

//  ****     4 way write to function   *****   function name stsrt with small latter


// 1st type  --->>>   no return type  , no parameter  or no argument [  void  function name()  ]  no passing parameter
// 2nd type  --->>>   no return type , with parameter
// 3rd type  --->>>   return type ,no parameters
// 4th type  --->>>   return type ,with parameters


//    ****   there are 2 ways to calling function   ***
//
//    ****  1  but  we need to create obj (  ClassName object = new ClassName();  )   then clall by object.function name ..

 // ****  2 st   is  method should be in class  or main class  (means if function is within a class or function is within the main method )
//                       then we can directly call the function ( printWelcomeMessage() )  just like
//                       but  function should be have a ststic key word .
//      without creating obj we gate out put  just direct write like in main method ( printWelcomeMessage() )



//  Static -->>  static key word is used for to  represent as a class  member
// for ststic method -->>
// if function is in the class and it is used  ststic  modifier is use  then we do not need to creat  object of a class for calling . we can call method directly in main function
// in static method we can calling method by creating object or we can call directly
//
// but in instsnce method
// for instsnce method we not use static modifier
// we calling method by  using creating class object   like ( className ) (objectName) = new (className) .  objectName is also called reference variablr.
// calling method -->>  object.(Method Name which is present in class)