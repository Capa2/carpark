import java.util.ArrayList;

public class CarPark {
    public ArrayList<Car> carArr;


    public CarPark() {
        carArr = new ArrayList<Car>();
    }

    @Override
    public String toString()  {
        return "CarPark{" +
                "carArr=" + carArr +
                '}';
    }

    public void addGasCar(String reg, String brand, String model, int year, int doors,
                          float kmPerL, int octaneRating) {
        carArr.add(new GasCar(reg, brand, model, year, doors, kmPerL, octaneRating));
    }

    public void addDieselCar(String reg, String brand, String model, int year, int doors,
                             float kmPerL, boolean hasParticleFilter) {
        carArr.add(new DieselCar(reg, brand, model, year, doors, kmPerL, hasParticleFilter));
    }

    public void addElectricCar(String reg, String brand, String model, int year, int doors,
                               float whPerKm, int maxKm, int batteryCapacity) {
        carArr.add(new ElectricCar(reg, brand, model, year, doors, whPerKm, maxKm, batteryCapacity));
    }


    public double calcAllGreenTax() {
        double totalTax = 0;
        for (Car c : carArr) {
            totalTax += c.calcGreenTax();
        }
        return totalTax;
    }
}
