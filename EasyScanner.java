import java.util.*; // Import Java Utility

public class EasyScanner {
    // Integer
    public static int nextInt() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }

    // Double
    public static double nextDouble() {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        return d;
    }

    // String
    public static String nextString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    
    // Char
    public static char nextChar() {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        return c;
    }
}