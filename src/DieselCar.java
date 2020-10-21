public class DieselCar extends Car {
    boolean hasParticleFilter;
    float kmPerL;

    public DieselCar(String reg, String brand, String model, int year, int doors,
                     float kmPerL, boolean hasParticleFilter) {
        setReg(reg);
        setBrand(brand);
        setModel(model);
        setYear(year);
        setDoors(doors);
        setKmPerL(kmPerL);
        setHasParticleFilter(hasParticleFilter);
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "hasParticleFilter=" + hasParticleFilter +
                ", kmPerL=" + kmPerL +
                ", reg='" + reg + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                '}';
    }

    @Override
    public double calcGreenTax() {
        double noFilterTax = 0;
        if (isHasParticleFilter());
        noFilterTax += 1000;
        if (getKmPerL() <= 50) {
            if (getKmPerL() > 20) return 330 + 130 + noFilterTax;
            else if (getKmPerL() > 15) return 1050 + 1390 + noFilterTax;
            else if (getKmPerL() > 10) return 2340 + 1850 + noFilterTax;
            else if (getKmPerL() > 5) return 5500 + 2770 + noFilterTax;
            else return 10470 + 15260 + noFilterTax;
        }
        return 0;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public float getKmPerL() {
        return kmPerL;
    }

    public void setKmPerL(float kmPerL) {
        this.kmPerL = kmPerL;
    }
}
