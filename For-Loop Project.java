/******************************************************
 *          Diego Vera 
 *      Third Code Submission
 *          For-Loops
 *  Basically a demonstration on how I'm able to
 *  make a for each loop to the class specifacations
 * 
 * Simple task manager, input tasks search
 * tasks that have specified simularities.
 *****************************************************/
 import java.util.Scanner;
 import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
    //I'm creating an ArrayList outside of the method that I will be adding thing to it.
        System.out.println("TASK MANAGER");
        System.out.print("Would you like to look at your list? If not, you'll be directed to the task \"add-er\"")/
        System.out.println("true/no");
        tasker(input.nextLine(), list);
    //Method overloading to make it easier to decide what you'd want.
    //Either add thing to it or look at it and then look at any specifics.
    }
    //This method will pull the String answer 'no' and the arrayArrayList
    //pre-defined in the 'main' method. Then it'll allow you to add to it.
    //Looping the method until you input 'STOP'.
    public static void tasker(String a, ArrayList b) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input tasks line by line, type STOP on its own line to save work");
            String variable = input.nextLine();
    
            if(String variable = "STOP") {
                System.out.println("This is the new list");
                System.out.println("********************");
                System.out.println(ArrayList b);
            }
            return();
            } else{
                store.add(variable);
                tasker(ArrayList b);  
            }
        }
    }
    //This method will pull a boolean 'true' and the ArrayList pre-defined
    //in the 'main' method. Then it'll allow you to look at the full list.
    //After ask you whether you wish to check out specific in the ArrayList.
    public static void tasker(boolean a, ArrayList b) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is your list.");
        System.out.println("******************");
        System.out.println(ArrayList b);
        System.out.println("**");
        System.out.println("****");
        System.out.println("******");
        System.out.println("********");
        System.out.println("Would you like to look for something more specific?");
        System.out.println("yes/no");
        String decision = input.nextLine();
    //This will check the list for specifically for anything matching what you type in.
        if (String decision = "yes") {
            System.out.println("Input what your looking for.");
            for (String e: ArrayList b) {
                if (e.indexOf(input.nextLine()) != -1)
                System.out.println("This is the search result.");
                System.out.println("******************");
                System.out.println(e);
            }
        }
        return(ArrayList b)
    }
}