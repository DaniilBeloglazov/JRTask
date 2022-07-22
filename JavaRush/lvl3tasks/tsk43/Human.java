package JavaRush.lvl3tasks.tsk43;

public class Human {
    private String name;
    private String birth;
    public Human(String name, int y, int m, int d){
        this.name = name;
        this.birth = d + "." + m + "." + y;
    }
    public void printNameNBirth(){
        System.out.print("Меня зовут "+ name + ".\n" +
                "Я родился " + birth);
    }
}
