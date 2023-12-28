public class ćwiczenia {
    public static void main(String[] args) {
    System.out.println (area(5));
    System.out.println(area(-1));
    System.out.println(area(5,4));
    }
    public static String area (double radius){
      if (radius < 0){
          return "-1.0";}
      return "area = " + Math.PI*radius*radius;
    }

    public static String area (double x, double y){
        if (x <0 || y<0){
            return "-1.0";
        }
        return "area prostokątu wynosi " + x*y;
    }
}
