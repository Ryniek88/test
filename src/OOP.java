public class OOP {
    public static void main(String[] args) {
      Pot pot = new Pot(7, 5, "black");
        System.out.println(pot.high);
        System.out.println(pot.width);
        System.out.println(pot.color);
        User user = new User (7,"Adam");
        if (user.ifcanbuyalcohol()){
            System.out.println("Can buy");
        } else System.out.println("Can't buy");
    }

}
