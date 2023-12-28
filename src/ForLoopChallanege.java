public class ForLoopChallanege {
    public static void main(String[] args) {
        int count=0;
        int suma=0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
                suma+=i;
            }
            if (count==5){
                break;
            }
        }
        System.out.println("suma: " +suma);
}

}

