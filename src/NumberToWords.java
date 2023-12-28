public class NumberToWords {
    public static void main(String[] args) {
   numberToWords(1450);
   System.out.println(getDigitCount(1450));
    }
    public static void numberToWords (int number){
        if (number<0){
            System.out.println("Invalid Value");
            return;
        }
        if (number==0){
            System.out.println("Zero");
        }
        int leadingZeroes=getDigitCount(number)-getDigitCount(reverse(number));

        number=reverse(number);
        while(number!=0){
            int a=number%10;
            switch (a) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("Other");
            };
            number=number/10;
        }
        for (int i=0; i<leadingZeroes;i++){
            System.out.println("Zero");
        }

        }

    public static int reverse (int number){

    int reverse =0;

        while(number!=0){
            reverse=reverse*10 + number%10;
            number /=10;

        }

        return reverse;

    }

    public static int getDigitCount (int number){
        if (number<0){
            return -1;
        }
        if (number==0){
            return 1;
        }
        int sum=0;
        int i=1;
        while (i<=number){
            i*=10;
            sum++;
        }
        return sum;
    }

}
