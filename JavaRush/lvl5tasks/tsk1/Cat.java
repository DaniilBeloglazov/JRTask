package JavaRush.lvl5tasks.tsk1;

class Cat {
    static int catCount;
    {
        catCount += 1;
    }
    protected void finalize() throws Throwable {
        catCount -= 1;
    }
}
