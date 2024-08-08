package laptop;

public class laptop {
    private String brand;
    private int storage;
    private String opSystem;
    private String model;
    private int ram;

    @Override
    public String toString() {
        return "laptop{" +
                "brand='" + brand + '\'' +
                ", storage=" + storage +
                ", opSystem='" + opSystem + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setOpSystem(String opSystem) {
        this.opSystem = opSystem;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOpSystem() {
        return opSystem;
    }




    public laptop(String brand, String model, int ram, int storage, String opSystem) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.opSystem = opSystem;
    }
}


