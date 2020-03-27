public class Cabrio {
    String model;
    String brand;
    boolean carIsMoving;
    boolean openRoof;

    public static void openingOrClosingTheRoof(boolean carIsMoving, boolean openRoof) {
        if (carIsMoving) {
            System.out.println("Nie można otworzyć, ani zamknąć dachu w trakcie jazdy");
        } else if (openRoof) {
            openRoof = false;
            System.out.println("zamknięto dach");
        } else {
            openRoof = true;
            System.out.println("otworzono dach");
        }
    }
}
