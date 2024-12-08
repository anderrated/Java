public class StaticExample {
   public static void main (String[] args){
        Chimken chick1 = new Chimken();
        Chimken chick2 = new Chimken();
        Chimken chick3 = new Chimken();

        System.out.println("Number of chickens: " + chick1.numChickens);
        System.out.println("Number of chickens: " + chick2.numChickens);
        System.out.println("Number of chickens: " + chick3.numChickens);
   } 
}

class Chimken{
    int numEggs;
    String name;
    static int numChickens;

    public Chimken(){
        numChickens += 1;
        System.out.println("This is Chimken Number: " + String.valueOf(numChickens));
    }
}
