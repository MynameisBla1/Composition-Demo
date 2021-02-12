public class Monitor {
    //normal fields to create a normal class
    private String model;
    private String manufacturer;
    private int size;
    //composition, notice that Resolution is a class that composes Monitor
    private Resolution nativeResolution;

    //in this constructor we are passing resolution nativeResolution as if it is a normal field, but it is an object.
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
