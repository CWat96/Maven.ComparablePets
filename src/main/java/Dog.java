public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setName("Sargent");
    }

    @Override
    public String speak() {
        return "Ruff";
    }
}
