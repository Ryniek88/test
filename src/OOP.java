public class OOP {
    public static void main(String[] args) {

        Garnek garnek = new Garnek(4, 5);

        Garnek garnek1 = new Garnek(6, 4, "black");
        String wiadomosc = garnek.gotuj();
        String sol = garnek.gotuj(false);

        System.out.println(garnek.color);
        System.out.println(garnek1.color);
        System.out.println(wiadomosc);
        System.out.println(sol);
    }
}
