public class NullPointerDemo {
    // Method that generates exception
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Causes NullPointerException
    }

    // Method that handles exception
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // will crash

        handleException(); // safe handling
    }
}
