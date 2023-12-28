public class switchexercoise {
    public static void main(String[] args) {
    System.out.println(nato("C"));
    }

    public static String nato (String litera){
        return switch (litera) {
            case "A" -> "Able";
            case "B" -> "Baker";
            default -> "Zła liczba";

        };
    }
}
