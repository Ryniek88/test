public class numberoftheworld {
    public static void main(String[] args) {
    System.out.println(getDaysInMonth(7,2000));
    }

    public static boolean isLeapYear (int year){
        if (year<1 || year >9999)
            return false;
        if (year %4 == 0){
            if (year % 100 != 0){
            return true;}
            else if (year % 400 == 0){
                return true;}
            else return false;
        }
        else return false;
    }

    public static int getDaysInMonth (int month, int year){
        if (month<1 || month >12){
            return -1;
        }
        if (year<1 || year >9999) {
            return -1;
        }
        return switch(month){
            case 1,3,5,7,8,10,12 ->31;
            case 2 -> isLeapYear(year) ? 29:28;
            default -> -1;
        };
    }
}
