package JavaRush.lvl5tasks.tsk3;
class Dog {
    static int dogCount;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.print("Dog was destroyed");
    }
}
