public class ryniu {
    public static void main(String[] args) {
        int newScore = calculateSdcore("Adam", 50);
        System.out.println ("New score is " + newScore);

        calculateSdcore(75);
           }


        public static int calculateSdcore (String name, int score) {
        System.out.println (name + " score is " + score);
        return score * 1000;
    }
    public static int calculateSdcore (int score) {
        System.out.println (" score is " + score);
        return score * 1000;
    }
}
