public class main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        addCars(carPark);
        printAll(carPark);
    }

    public static void addCars(CarPark cp) {
        // GasCar(reg, brand, model, year, doors, kmPerL, OctaneRating)
        // DieselCar(reg, brand, model, year, doors, kmPerL, hasParticleFilter)
        // ElectricCar(reg, brand, model, year, doors, whPerKm, maxKm, batteryCapacity)
        cp.addGasCar("5020FG", "BMW", "Beatle", 1996, 4, 14, 66);
        cp.addDieselCar("60FF21", "BMW", "Beatle", 1996, 4, 49, true);
        cp.addDieselCar("5ABD32", "Weezer", "Bogcat", 2001, 6, 11, false);
        cp.addElectricCar("12001G", "qCar", "Fister", 1985, 2, 5, 27000, 105500);
    }

    public static void printAll(CarPark cp) {
        System.out.println(cp);
        System.out.println("Total Green Tax: " + cp.calcAllGreenTax());
    }

}
