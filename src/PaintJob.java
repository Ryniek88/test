import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
    getBucketCount(1,2,3,4);
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket){
        if (width<=0 || height<=0 || extraBucket<0){
            return -1;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give width");
        String a = scanner.nextLine();
        width = Double.parseDouble(a);
        System.out.println("Give height");
        String b = scanner.nextLine();
        height = Double.parseDouble(b);
        System.out.println("Give area per bucket");
        String c = scanner.nextLine();
        areaPerBucket = Double.parseDouble(c);
        System.out.println("Give area extra bucket");
        String d = scanner.nextLine();
        extraBucket = Integer.parseInt(d);

        double area = width*height;
        double x = area/areaPerBucket;
        int y= (int) x;
        int z= y - extraBucket;
        System.out.println(z);
        return z;
    }
}

