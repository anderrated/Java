public class ChickenTest {
    String name = "Duckhess";
    int numEggs = 0;

    public static void main(String[] args) {
        ChickenTest chick = new ChickenTest();
        System.out.println("Setting field: " + chick.name);
        System.out.println("Number of eggs: " + chick.numEggs);
    }

    public ChickenTest() {
        name = "Chimmy";
        numEggs = 2;
    }
}