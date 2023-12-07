public class Pet {

    void speak() {
        System.out.println("Makes sound");
    }

    void name() {
        System.out.println("Name");
    }

    static class Cat extends Pet {
        @Override
        void speak() {
            System.out.println("Meow");
        }
    }

    static class Dog extends Pet {
        @Override
        void speak() {
            System.out.println("Ruff");
        }
    }

    static class Parrot extends Pet {
        @Override
        void speak() {
            System.out.println("Scretch");
        }
    }
}
