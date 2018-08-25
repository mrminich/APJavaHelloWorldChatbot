/**
 * HelloWorld Project
 * @author John Doe Per 2
 */

import java.util.Scanner; 
  
class Chatbot 
{ 
 
    // says a greeting
    public static void sayHello() 
    { 
        System.out.println("Bonjour"); 
    } 
    
    // returns a random integer between 1 and 100
    public static int generateRandomNumber()
    {
        return (int) (Math.random() * 100 + 1);
    }

    // returns a random decimal number between 1 and 100
    public static double generateRandomDecimalNumber()
    {
        return Math.random() * 100 + 1;
    }
   
    // says a farewell
    public static void sayGoodbye() 
    { 
        System.out.println("Au revoir"); 
    } 
    
    // returns the Chatbot's name
    public static String getName() 
    { 
        return "Fred"; 
    } 
    
    // displays an interesting computation
    public static void doMath(int num)
    {
        System.out.println("10 times " + num + " is " + (10 * num));
    }
     
}// end of Chatbot class 
  
/////////////////////////////////////////////// 
  
public class HelloWorldChatbot 
{ 
     
    public static void main(String[] args) 
    { 
        Chatbot.sayHello(); 
        System.out.println("My name is " + Chatbot.getName() + "." ); 

        System.out.print("My favorite integer is " + Chatbot.generateRandomNumber() );
        System.out.println(" & my decimal is " + Chatbot.generateRandomDecimalNumber() );

        Scanner keyboard = new Scanner(System.in); // used to obtain user input from keyboard
        
        // getting user's name
        System.out.print("What is your name? ");
        String userName = "";               // user's name
        userName = keyboard.nextLine();     // allows input of a whole phrase that includes spaces 
        
        // getting user's favorite number
        System.out.print(userName + ", what is your favorite number? ");

        int userInt = 0;                        // user's favorite integer
        userInt = keyboard.nextInt();           // allows the input of an integer
        
        String sentence = keyboard.nextLine();  // this statement should usually follow 
                                                // the use of nextInt() to "flushing the buffer"

        printBlankLines();
        
        Chatbot.doMath(userInt);
        
        Chatbot.sayGoodbye(); 
    } 
    
    // prints 3 blank lines
    public static void printBlankLines()
    {
        System.out.print("\n\n\n");
    }
     
}// end of HelloWorld class
