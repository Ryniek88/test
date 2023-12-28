public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 20));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (goal % (bigCount * 5) > smallCount) {
            return false;
        }
        if ((goal / (bigCount * 5) > 1) && (goal / (smallCount) > 1)) {
            return false;
        }
        if (goal > bigCount * 5 + smallCount) {
            return false;
        }

        return true;
    }
}
