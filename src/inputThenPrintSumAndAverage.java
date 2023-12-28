import java.util.Scanner;

public class inputThenPrintSumAndAverage {
    public static void main(String[] args) {

        System.out.println(inputThenPrintSumAndAverage(7));
    }
    public static int inputThenPrintSumAndAverage (int n){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int count =0;
        int avg = suma/count;

        while (true){
            String liczba1 = scanner.nextLine();
            int liczba2= Integer.parseInt(liczba1);
            suma+= liczba2;
            count++;
        }
        //System.out.println("SUM = " + suma + " AVG = " + avg);
    }
}
