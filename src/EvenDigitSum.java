public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-123456789));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            int a = number % 10;
            if (a % 2 == 0) {
                sum += a;
            }
            number = number / 10;
        }

        return sum;
    }
}

