public class LiczbyPierwsze {
    public static void main(String[] args) {

            int count=0;
            int a=0;
            for (int i = 1; i < 7; i++) {
                if (isPrimeMetod(i)) {
                    System.out.println(("number " + i + " is a prime number"));
                    count++;
                    a=i;
               }
                if (count==10){
                    break;
                }
            }

            System.out.println(count);
            System.out.println(a);
        }

    public static boolean isPrimeMetod (int number) {
        if (number<2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
