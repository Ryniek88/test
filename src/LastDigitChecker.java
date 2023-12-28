public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12,12,99));

    }
    public static boolean hasSameLastDigit (int a, int b, int c){
       if (!isValid(a)||!isValid(b)||!isValid(c)){
           return false;
       }


        int d=a%10;
        int e=b%10;
        int f=c%10;

        return (d==e||d==f)||(e==d||e==f);
    }
    public static boolean isValid(int number) {
        return (number>=10&&number<=1000);
    }
}
