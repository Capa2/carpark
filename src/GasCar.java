public class GasCar extends Car {
    float kmPerL;
    int octaneRating;

    public GasCar(String reg, String brand, String model, int year, int doors,
                  float kmPerL, int octaneRating) {
        setReg(reg);
        setBrand(brand);
        setModel(model);
        setYear(year);
        setDoors(doors);
        setKmPerL(kmPerL);
        setOctaneRating(octaneRating);
    }

    @Override
    public String toString() {
        return "GasCar{" +
                "kmPerL=" + kmPerL +
                ", octaneRating=" + octaneRating +
                ", reg='" + reg + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                '}';
    }
    /*
    @Override
    public String toString() {
        return year + " " + doors + "D" + model + brand + ", REG: " + reg + ", " + kmPerL + " KM/L, " + octaneRating + "OCT RATING. \n";
    }
    */
    public double calcGreenTax() {
        if (getKmPerL() <= 50) {
            if (getKmPerL() > 20) return 330;
            if (getKmPerL() > 15) return 1050;
            if (getKmPerL() > 10) return 2340;
            if (getKmPerL() > 5) return 5500;
            return 10470;
        }
        return 0;
    }

    public float getKmPerL() {
        return kmPerL;
    }

    public void setKmPerL(float kmPerL) {
        this.kmPerL = kmPerL;
    }

    public int getOctaneRating() {
        return octaneRating;
    }

    public void setOctaneRating(int octaneRating) {
        octaneRating = octaneRating;
    }
}
