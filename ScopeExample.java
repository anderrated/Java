public class ScopeExample {
   public static void main(String[] args) {
        Chicken chick = new Chicken();
        System.out.println("numEggs: " + chick.numEggs + "and numChickens: " + chick.numChickens);
   } 
}

class Chicken{
    int numEggs;
    String name;
    static int numChickens;

    public Chicken(){
        numChickens += 1;
        System.out.println("This is Chicken Number: " + numChickens);
    }

    public void LayEgg(){
        numEggs++;
    }

    public void ArbitraryMethod1(){
        int arbitraryInt1 = 10;
        arbitraryInt1 = arbitraryInt1 + numEggs;
    }

    public void ArbitraryMethod2(){
        arbitraryInt1 = arbitraryInt1 - numEggs; // Out of scope

        if(arbitraryInt1 < 0){ // Out of scope
            int arbInt2 = 20;
        }
        
        arbInt2++; // Out of scope
    }
}
