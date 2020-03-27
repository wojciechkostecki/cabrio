public class CarTest {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio();
        cabrio.brand = "BMW";
        cabrio.model = "M850i";
        cabrio.carIsMoving = true;
        cabrio.openRoof = false;

        Cabrio.openingOrClosingTheRoof(false, false);
    }
}
