public class forIntLoop {
    public static void main(String[] args) {

        for (double rate = 7.5; rate<=10; rate=rate+0.25) {
            if (rate>9){
            break;}
        System.out.println(calculateIntereset(1000,rate));
        };
    }

    public static double calculateIntereset (double dollar, double rate){
        return dollar * rate/100;
    }

}
