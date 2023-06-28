public class Phone {
    private String model;
    private int batery;
    private boolean powerBy;

    public Phone(String model, int batery, boolean power) {
        this.model = model;
        this.batery = batery;
        this.powerBy = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }

    public boolean getPowerBy() {
        return powerBy;
    }

    public void setPowerBy(boolean powerBy) {
        this.powerBy = powerBy;
    }
}
