public class Cabrio {
    public static String model;
    public static String brand;
    public static boolean isRoofOpen;

    public static void toggleRoof(boolean isCarMoving) {
        if (isCarMoving) {
            System.out.println("Nie można otworzyć/zamknąć dachu");
        } else if (isRoofOpen) {
            isRoofOpen = false;
            System.out.println("zamknięto dach");
        } else {
            isRoofOpen = true;
            System.out.println("otworzono dach");
        }
    }
}
