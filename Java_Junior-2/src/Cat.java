import java.lang.reflect.Method;

class Cat extends Animal {
    private boolean isSassy;

    public Cat(String name, int age, boolean isSassy) {
        super(name, age);
        this.isSassy = isSassy;
    }

    public void meow() {
        System.out.println("Meow!");
    }
}