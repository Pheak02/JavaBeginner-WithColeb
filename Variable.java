public class Variable {
    public static void main(String[] args) {
        // one way

        String string = new String("This is a string");
        System.out.println(string + ":)");
        // string + ":)" known as the expression
        // String easier = "Wow, that was easy!" + ":)";
        String easier = "Wow, that was easy!" + string;
        System.out.println(easier);

    }

}