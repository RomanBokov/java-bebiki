package org.example.api.models;

public class Unicorm {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Unicorm(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Unicorm{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String toJson(){
        return "{\n" +
                "  \"name\" : \""+  name +"\" ,\n" +
                "  \"color\" : \"" + color +"\"\n" +
                "}";
    }
}

