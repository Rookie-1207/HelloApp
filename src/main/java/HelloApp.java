public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder result = new StringBuilder();

            for (String name : args) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(name);
            }

            System.out.println("Hello, " + result + "!");
        }
    }
}
