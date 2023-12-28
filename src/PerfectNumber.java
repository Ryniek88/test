public class PerfectNumber {
    public static void main(String[] args) {
    System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber (int number){
        if (number<1){
            return false;
        }
        int i=0;
        int sum=0;
        while (i<number){
            i++;
            if(i==number-1){
                break;
            }
            if (number%i==0){
                sum+=i;
            }

        }
        return sum==number;
    }
}
