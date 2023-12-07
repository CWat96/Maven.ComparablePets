public class Cat extends Pet {

    public Cat(String name) {
        super(name);
        super.setName("Thomas");
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}
