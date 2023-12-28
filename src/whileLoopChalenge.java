public class whileLoopChalenge {
    public static void main(String[] args) {
    int j =3;
    int evencount=0;
    int oddcount=0;
    while (true){
        j++;
        if (j>20){
            break;
        }
        if (!isEvenNumber(j)){
            oddcount++;
            continue;
        }
        System.out.println(j+" is "+isEvenNumber(j));
        evencount++;
        if (evencount==5){
            break;
        }
    }
    System.out.println(evencount);
    System.out.println(oddcount);
    }

    public static boolean isEvenNumber (int number){
    if (number % 2 ==0){
        return true;
    } else {
        return false;
    }
    }


}
