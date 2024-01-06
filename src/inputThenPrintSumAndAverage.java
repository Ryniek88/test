import java.util.Scanner;

public class inputThenPrintSumAndAverage {
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage (){

        int suma = 0;
        int count =0;


        while (true){
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("podaj liczbę");
                String liczba1 = scanner.nextLine();
                int liczba2= Integer.parseInt(liczba1);
                suma+= liczba2;
                count++;} catch (NumberFormatException nfe) {
                break;
            }
            scanner.close();
            }

        int avg = suma/count;
        if (count==0){
            System.out.println("SUM = 0 AVG = 0");
        }
        System.out.println("SUM = " + suma + " AVG = " + avg);
    }
}
