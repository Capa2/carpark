public class ElectricCar extends Car {
    float whPerKm;
    int batteryCapacity;
    int maxKm;

    public ElectricCar(String reg, String brand, String model, int year, int doors,
                       float whPerKm, int maxKm, int batteryCapacity) {
        setReg(reg);
        setBrand(brand);
        setModel(model);
        setYear(year);
        setDoors(doors);
        setWhPerKm(whPerKm);
        setMaxKm(maxKm);
        setBatteryCapacity(batteryCapacity);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "whPerKm=" + whPerKm +
                ", batteryCapacity=" + batteryCapacity +
                ", maxKm=" + maxKm +
                ", reg='" + reg + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                '}';
    }

    @Override
    public double calcGreenTax() {
        if (getKmPerL() <= 50) {
            if (getKmPerL() > 20) return 330;
            else if (getKmPerL() > 15) return 1050;
            else if (getKmPerL() > 10) return 2340;
            else if (getKmPerL() > 5) return 5500;
            else return 10470;
        }
        return 0;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public float getWhPerKm() {
        return whPerKm;
    }

    public void setWhPerKm(float whPerKm) {
        this.whPerKm = whPerKm;
    }

    public float getKmPerL() {
        return (float) (100 / (getWhPerKm() / 91.25));
    }

}
