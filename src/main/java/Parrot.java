public class Parrot extends Pet {
    public Parrot(String name) {
        super(name);
        super.setName("Sargent");
    }

    @Override
    public String speak() {
        return "Stretch";
    }
}

