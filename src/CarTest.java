public class CarTest {
    public static void main(String[] args) {
        Cabrio.brand = "BMW";
        Cabrio.model = "M850i";
        Cabrio.isRoofOpen = false;
        Cabrio.isCarMoving = false;

        Cabrio.toggleRoof();
    }
}
