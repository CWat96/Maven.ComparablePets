package io.zipcoder;

public class Pet implements Comparable<Pet>{
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

    public String speak() {
        System.out.println("Makes sound");
        return null;
    }

    @Override
    public int compareTo(Pet o) {
        return o.getName().compareTo(this.name);

    }
}
