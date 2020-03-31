public class Cabrio {
    public static String model;
    public static String brand;
    public static boolean isRoofOpen;
    public static boolean isCarMoving;

    public static void toggleRoof() {
        if (isCarMoving) {
            System.out.println("Nie można otworzyć/zamknąć dachu");
        } else {
            isRoofOpen = !isRoofOpen;
            System.out.println(isRoofOpen ? "otworzono" : "zamknięto");
        }
    }
}
