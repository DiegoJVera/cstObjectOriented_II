
public class Color extends Main {
    private String purple = "purple";
    private String green = "green";
    private String orange = "orange";

    public colors(String blue, String yellow, String red){
        super (String blue, String yellow, String red)

        System.out.println("The three primary colors are " blue + "\n" + yellow "\n" + red);
    }

    public static void mixer(String blue, String yellow, String red, String purple, String green, String orange) {
        System.out.println(red + " & " + blue " = " + purple);
        System.out.println(red + " & " + yellow " = " + orange);
        System.out.println(yellow + " & " + blue " = " + green);
    }
}