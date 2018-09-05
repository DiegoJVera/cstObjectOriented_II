import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)   
    {
        hello(decision);
        
        response(sendBackBoolean | sendBack);

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
        String sendBack = input.next;
            if (sendBack = true) 
            {
                boolean sendBackBoolean=Boolean.parseBoolean(sendBack);  
                return sendBackBoolean;
            }
            else 
            {
                return sendBack;
            }
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
}