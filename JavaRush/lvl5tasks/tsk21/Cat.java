package JavaRush.lvl5tasks.tsk21;

class Cat {
    private String name;
    private Cat parentMother;
    private Cat parentFather;

    Cat(String name) {
        this.name = name;
    }

    Cat(String name, Cat parentMother, Cat parentFather) {
        this.name = name;
        this.parentMother = parentMother;
        this.parentFather = parentFather;
    }

    @Override
    public String toString() {
        if (parentMother == null && parentFather == null)
            return "Cat name is " + name + ", no mother, no father";
        else if (parentMother == null)
            return "Cat name is " + name + ", no mother, father is " + parentFather.name;
        else if (parentFather == null)
            return "Cat name is " + name + ", mother is " + parentMother.name + ", no father";
        else
            return "Cat name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
    }
}
