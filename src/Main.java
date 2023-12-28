public class Main {
    public static void main(String[] args) {
        int value = 3;
        // if (value == 1) {
        //     System.out.println("Value was 1");
        //}
        //else if (value == 2){
        //   System.out.println("Value was 2");
        //}
        //else {
        //   System.out.println("Value was not 1 or 2");
        //}
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Value was " + value);
            }
            default -> System.out.println("Value was not 1 ,2,3,4,5");
        }

        System.out.println(getQuarter("styczen"));
        System.out.println(getQuarter("grudzień"));
    }



        public static String getQuarter (String month){
            return switch (month) {
                case "styczen" -> "Pierwszy kwartał";
                case "grudzień" -> "Czwarty kwaqrtał";
                default -> "bad";
            };
        }
    }
