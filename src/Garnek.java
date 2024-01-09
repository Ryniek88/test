public class Garnek {

        int high;
        int width;
        String color;

       public Garnek(int high,int width){
           this.high=high;
           this.width=width;
       }
       public Garnek (int high, int width, String color){
            this.high = high;
            this.width = width;
            this.color = color;
        }

        public String gotuj (){
           return "Gotowanie w trakcie";
        }
        public String gotuj (boolean czydodalessol){
           if (czydodalessol){
               return "Gotowanie z sola";
           } else {
               return "Gototowanie bez soli";
           }
        }

}
