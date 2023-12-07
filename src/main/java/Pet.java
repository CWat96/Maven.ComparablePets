public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Makes sound");
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("Meow");
        }
    }

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("Ruff");
    }
}

class Parrot extends Pet {
    public Parrot(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("Stretch");
    }
}
