import java.util.Scanner;

public class readinguserinput {
    public static void main(String[] args) {
        System.out.println(number(5));
    }

    public static double number (int number){
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int liczba = 1;

        while (liczba<=5){
            System.out.println("Enter number #" + liczba);
            String liczba1 = scanner.nextLine();
            try {
                double liczba2 = Double.parseDouble(liczba1);
                suma += liczba2;
                liczba++;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
       }
        return suma;
    }
}
