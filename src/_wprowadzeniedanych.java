import java.util.Scanner;

public class _wprowadzeniedanych {
    public static void main(String[] args) {
        int currentYear = 2023;
        System.out.println(wiek(currentYear));
    }
    public static String wiek(int currentYear){
        Scanner scanner = new Scanner(System.in);
       // String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        //String dateofBird = System.console().readLine("What year did you born? ");
        System.out.println("What year did you born? ");
        String dateofBird = scanner.nextLine();
        int wiek = currentYear - Integer.parseInt(dateofBird);
        //System.out.println("So, you are " + wiek );
        return "So, you are " + wiek;
    }
}
