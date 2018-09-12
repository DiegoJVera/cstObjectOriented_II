/***************************************************************************
 *               Diego Vera
 *         Class Project 1.02
 *        --Current Changes--
 * I've added a couple of methods to the mix.
 * Overloading the 'response' method with another that only
 *  works with a string type.
 * The 'countdown' method is supposed to be the recursive method.
 * It is supposed to either count from 10->1 or 1->10, stil playing with it.
 *
 ***************************************************************************/

import java.util.Scanner;
import java.util.Date;

public class Main 
{
    public static void main(String[] args)   
    {
        hello(decision);
        
        response(decision);

        intro(true);

    }

    public static String hello(String pulledWord) 
    {
        Scanner input = new Scanner (System.in);

        pulledWord = sendBack;

        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println("  Hello, and Welcome!");
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println();
        System.out.println();
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println("  Are you a returning player?");
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println("             true/nope             ");
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        String sendBack = input.next();
            if (sendBack = true) 
            {
                boolean sendBackBoolean=Boolean.parseBoolean(sendBack);  
                return sendBackBoolean;
            }
            
            return sendBack;
            
    }
    public static void intro(boolean answer) 
    {
        if (answer = true)
        {
            System.out.println(epilogue);
        } else;
        {
            break;
        }

        String epilogue = "In a world, where ideas aren't easy to come up with. There is no man, or women capable of coming up with a good one";
    }

    public static void response(boolean answer)
    {
        System.out.println("Good to see you again, so where did we leave off?");
    }
    
    public static void response(String answer) 
    {

        System.out.println("Welcome New Player, I Hope You Enjoy!");
        System.out.println("  ~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println("  ~-~-^-~-^-^-^-~-^-~-^-^-^-^-^-~-~");
        System.out.println("  ~-~-~-^-~-^-^-~^~^~-^-^-~-^-~-~-~");
        System.out.println("  ~-~-~-^-~-^-^-^-~-^-^-^-~-^-~-~-~");
        System.out.println("  ~-~-~-~-~-~-~^~-~-~^~-~-~-~-~-~-~");
        System.out.println("  ~-~-~-~-~-~-^-~-~-~-^-~-~-~-~-~-~");
        System.out.println("  ~-~-~-~-~-~^~-^-^-^-~^~-~-~-~-~-~");
        System.out.println("  ~-~-~-~-~-^-^-~^^^~-^-^-~-~-~-~-~");
        System.out.println("  ~-~-~-~-~^~-~-^-^-^-~-~^~-~-~-~-~");
        System.out.println("  ~-~-~-~-^-~-~-~-~-~-~-~-^-~-~-~-~");
        System.out.println("  ~-~-~-~^~-~-~-~-~-~-~-~-~^~-~-~-~");
        System.out.println("  ~-~-~-^-~-~-~-~-~-~-~-~-~-^-~-~-~");
        System.out.println("  ~-~-~^~^~^~^~^~^~^~^~^~^~^~^~-~-~");
        System.out.println("  ~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        
    }

    public static int response(boolean answer) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Where did you leave off?");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("  Just Type the Number");
        System.out.println("Scene-1, Scene-2, Scene-3");

        int reply = input.nextInt();

        countdown();

        return reply;

    }

    public static int countdown(int reply)
    {
        System.out.println("Loading...");
        if (reply = 10, reply > 0) {
            countdown(reply--)
        }
        System.out.println(reply);
        Thread.sleep(5000);
    }
}


/*****************************************************************************
 *            --------------------To DO LIST-----------------------
 *              -   -   -   -   -   -   -   -   -   -   -   -   -
 * 1. Comments Comments Comments, and Check if everything is properly spaced.
 * 2. Make a tree for questions and answers. Maybe incorporate a number
 *     system to determine what question is pulled
 *      and what the next question will be.
 * 3. Look into how multiple classes may help this take shape.
 * 4. Add some story, and not just functionality.
******************************************************************************/
