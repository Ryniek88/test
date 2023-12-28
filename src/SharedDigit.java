public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(13,23));
    }
    public static boolean hasSharedDigit(int number1,int number2){
        if (number1<10||number1>99){
            return false;
        }
        if (number2<10 ||number2>99){
            return false;
        }
        int a =number1%10;
        int b =number1/10;
        int c=number2%10;
        int d= number2/10;

        return (a==c||a==d)||(b==c||b==d);

    }
}
