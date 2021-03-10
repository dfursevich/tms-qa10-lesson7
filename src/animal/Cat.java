package animal;

public class Cat extends Animal {
    private String instagrammPage;
    private boolean catchMouse;

    public Cat(String name, int age, String instagrammPage, boolean catchMouse) {
        super(name, age);
        this.instagrammPage = instagrammPage;
        this.catchMouse = catchMouse;
    }

    public String getInstagrammPage() {
        return instagrammPage;
    }

    public boolean isCatchMouse() {
        return catchMouse;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("instagrammPage = " + instagrammPage);
        System.out.println("catchMouse = " + catchMouse);
    }

    public void greet() {
        System.out.println("Meow");
    }
}
