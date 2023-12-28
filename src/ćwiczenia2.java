public class ćwiczenia2 {
    public static void main(String[] args) {
        printEqual(-4, 3, 4);

    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        }
            if (a==b&&b==c)  {
                System.out.println("All numbers are equal");
            }

        }


    }

