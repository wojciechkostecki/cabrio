public class Cabrio {
    public String model;
    public String brand;
    public boolean isRoofOpen;
    public boolean isCarMoving;

    public Cabrio(String model, String brand, boolean isRoofOpen, boolean isCarMoving) {
        this.model = model;
        this.brand = brand;
        this.isRoofOpen = isRoofOpen;
        this.isCarMoving = isCarMoving;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        isRoofOpen = roofOpen;
    }

    public boolean isCarMoving() {
        return isCarMoving;
    }

    public void setCarMoving(boolean carMoving) {
        isCarMoving = carMoving;
    }

    public static void toggleRoof(Cabrio cabrio) {
        if (cabrio.isCarMoving) {
            System.out.println("Nie można otworzyć/zamknąć dachu");
        } else {
            cabrio.isRoofOpen = !cabrio.isRoofOpen;
            System.out.println(cabrio.isRoofOpen ? "otworzono" : "zamknięto");
        }
    }
}
