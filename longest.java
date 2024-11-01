public class Longest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No parameters");
            return;
        }

        String longest = args[0];
        for (String arg : args) {
            if (arg.length() > longest.length()) {
                longest = arg;
            }
        }

        System.out.println("Longest parameter: " + longest);
    }
}
