public class methodoverload {
    public static void main(String[] args) {
    System.out.println("Heigh inch w cm wynosi: " + converToCentimeters(100));
    System.out.println("5 ft 8 inch wynosi " + converToCentimeters(0,68));
    }
    public static double converToCentimeters (int heighInInches){
        return heighInInches*2.54;
    }

    public static double converToCentimeters (int heighInFeet, int heighInInches){
        return converToCentimeters(heighInFeet*12 + heighInInches);


    }
}




