//author: Sara Russert 
//date: 1/5/24
//file: ArithmeticOperators.java
//File to give students; code has bugs
/*
   Lab1
   Declare variables of Java primitive data types
   Implement and display results of arithmetic operators
   Demonstrate combined assignment operators
   Demonstrate the error message that results from narrowing conversion
   Demonstrate boolean data type variables
*/

public class ArithmeticOperators
{
    public static void main(String[] args)
   {
      //declare variables of various data types
      int intNumber1 = 19, intNumber2 = 9, intNumber3 = 2;
      float fltNumber = 19.0f; //don't forget to add the f to make a literal float
      double dblNumber = 9.0;
      boolean flag = true;
      int intResult;
      double dblResult;
      float fltResult;
      char letter = 'A'; //don't forget a literal char surrounded by single quotes
      
      //perform and display results of various arithmetic operators
      System.out.println("Add two ints:");
      intResult = intNumber1 + intNumber2; //adds the two int values
      System.out.println(intNumber1 + " + " + intNumber2 + " == " + intResult);
      
      System.out.println("Subtract two ints:");
      intResult = intNumber1 - intNumber2; //subtracts the two int values  
      System.out.println(intNumber1 + " - " + intNumber2 + " == " + intResult);
      
      System.out.println("Multiply two ints:");
      intResult = intNumber1 * intNumber2; //multiplies the ints
      System.out.println(intNumber1 + " * " + intNumber2 + " == " + intResult);

      
      //implement integer division
      System.out.println("Divide two ints and store result in an int:");
      intResult = intNumber1 / intNumber2; //divides the two int values
      System.out.println(intNumber1 + " / " + intNumber2 + " == " + intResult);
      
      System.out.println("Divide an int by an int and store result in a double:");    
      dblResult = intNumber1 / intNumber2; //divides the two int values; assign to double
      System.out.println(intNumber1 + " / " + intNumber2 + " == " + dblResult);
      
      System.out.println("Divide an int by a double and store in an int:" + " ERROR!");
      //generates a narrowing conversion error message, so comment it out
      // intResult = intNumber1 / dblNumber; 
        
      System.out.println("Divide an int by a double and store in a double:");
      dblResult = intNumber1 / dblNumber; //divide an int by a double; store in a double
      System.out.println(intNumber1 + " / " + dblNumber + " == " + dblResult);
      
      System.out.println("Add a float and a double and store in a float:" + "  ERROR!");
      // fltResult = fltNumber + dblNumber;
      
      System.out.println("Add a float and a double and store in a double:");
      dblResult = fltNumber + dblNumber;
      System.out.println(fltNumber + " + " + dblNumber + " == " + dblResult);
      
      System.out.println("Find remainder after dividing two ints:");
      intResult = intNumber1 % intNumber2;
      System.out.println(intNumber1 + " % " + intNumber2 + " == " + intResult);
      intResult = intNumber2 % intNumber1;
      System.out.println(intNumber2 + " % " + intNumber1 + " == " + intResult);
      
      
      //raise an int to an int data type power and store in an int
      System.out.println("Raise an int to an int data type power and store in an int:" + " ERROR!");
      // intResult = Math.pow(intNumber2, intNumber3);
      
      //raise an int to an int data type power and store in a double
      System.out.println("Raise an int to an int data type power and store in a double:");
      dblResult = Math.pow(intNumber2, intNumber3);
      System.out.println(intNumber2 + " ^ " + intNumber3 + " == " + dblResult);

      //implement combined assignment operators to perform arithmetic operations
      System.out.println("Demonstrate combined assignment operators to perform arithmetic operations:");
      //addition
      System.out.println("Addition:");
      System.out.print(intNumber1 + " incremented by " + intNumber2 + " == ");
      intNumber1 += intNumber2; //increments intNumber1 by intNumber2
      System.out.println(intNumber1);
      //since intNumber1 has changed, reset to 19
      intNumber1 = 19;
      
      //subtraction
      System.out.println("Subtraction:");
      System.out.print(intNumber1 + " decremented by " + intNumber2 + " == ");
      intNumber1 -= intNumber2; //decrements intNumber1 by intNumber2
      System.out.println(intNumber1);
      //since intNumber1 has changed, reset to 19
      intNumber1 = 19;
      
      //multiply
      System.out.println("Multiplication:");
      System.out.print(intNumber1 + " *= " + intNumber2 + " == ");
      intNumber1 *= intNumber2; //multiplies the two int values
      System.out.println(intNumber1);
      //since intNumber1 has changed, reset to 19
      intNumber1 = 19;
      
      //integer division
      System.out.println("Integer division:");
      System.out.print(intNumber1 + " /= " + intNumber2 + " == ");
      intNumber1 /= intNumber2; //integer divides the two int values
      System.out.println(intNumber1);
      //since intNumber1 has changed, reset to 19
      
      
      //modulus
      System.out.println("Modulus:");
      System.out.print(intNumber1 + " %= " + intNumber2 + " == ");
      intNumber1 %= intNumber2; //integer divides the two int values
      System.out.println(intNumber1);
      //since intNumber1 has changed, reset to 19
      intNumber1 = 19;
     
      //demonstrate boolean data type variable
      System.out.println("Display a boolean variable:");
      System.out.println("flag evaluates to: " + flag);
      System.out.println("Flip flag from true to false:");
      flag = false;
      System.out.println("after being flipped, flag now evaluates to: " + flag); 
      
      //demonstrate char data type
      System.out.println("The char variable was initialized with: " + letter);
      //overwrite the 'A' with 'a'
      letter = 'a';
      System.out.println("It now contains: " + letter);
             
   }
}