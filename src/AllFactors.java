public class AllFactors {
    public static void main(String[] args) {
    printFactors(6);
    }
    public static void printFactors(int number){
        if (number<1) {
            System.out.println("Invalid Value");
            return;
        }
        int a=0;
        while (a<=number){
            a++;
            if (number%a==0){
                System.out.println(a);
            }
        }

        }

    }

