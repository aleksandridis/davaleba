public class Car {
    private String Model;
    private String transmission;
    private String wheel;
    private String interiorColor;

    public Car(String model, String transmission, String wheel,  String interiorColor) {
        Model = model;
        this.transmission = transmission;
        this.wheel = wheel;

        this.interiorColor = interiorColor;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }
    public String toString() {
        return  this.getModel() + " "+ this.getTransmission()+ " "+ this.getWheel()+ " "+ this.getInteriorColor();
    }
}
