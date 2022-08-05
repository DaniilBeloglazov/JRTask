package StreamAPI_Stepik._1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.forceToWork(new Worker() {
            @Override
            public void work() {
                System.out.println("Anonym start working");
            }
        });
        director.forceToWork(() -> System.out.println("Lambda start working"));
    }
}
