package JavaRush.lvl5tasks.tsk2;

class Cat {
    static int catCount;
    {catCount++;}
    protected void finalize() throws Throwable {
        catCount -= 1;
        System.out.println("Cat was destroyed");
    }
}
