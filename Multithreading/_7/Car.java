package Multithreading._7;

public class Car {
    private final String carName;

    Car(String carName) {
        this.carName = carName;
    }

    public void prepare() {
        System.out.println(carName + " start preparing.");
        long forSleep = (long) (Math.random() * 5000 + 1000);
        try {
            Thread.sleep(forSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(carName + " finished preparing");
    }

    public void rideRoad() {
        System.out.println(carName + " starts riding the road.");
        long forSleep = (long) (Math.random() * 5000 + 1000);
        try {
            Thread.sleep(forSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(carName + " finished riding the road.");
    }

    public void rideTunnel() {
        System.out.println(carName + " starts riding the tunnel.");
        long forSleep = (long) (Math.random() * 5000 + 1000);
        try {
            Thread.sleep(forSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(carName + " finished riding the tunnel.");
    }

    public String getCarName() {
        return carName;
    }
}
