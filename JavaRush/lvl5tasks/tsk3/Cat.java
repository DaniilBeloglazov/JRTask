package JavaRush.lvl5tasks.tsk3;

class Cat {
    static int catCount;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.print("Cat was destroyed");
    }
}
