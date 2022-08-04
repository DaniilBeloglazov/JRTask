package Multithreading._2;

public class ATM {
    private int MONEY_INSIDE;
    private final Object monitor = new Object();
    public ATM(int MONEY_INSIDE) {
        this.MONEY_INSIDE = MONEY_INSIDE;
    }

    void giveMoney(String name, int moneyWant) {
        synchronized (monitor) {
            System.out.println(name + " came to ATM");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (moneyWant <= MONEY_INSIDE) {
                MONEY_INSIDE -= moneyWant;
                System.out.println(name + " received " + moneyWant + " rub. " + MONEY_INSIDE + " rub left at the ATM.");
            } else {
                System.out.println("Not enough money at the ATM for " + name);
            }
        }
    }
}
