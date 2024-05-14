package Hybrid;

public class samsung extends Tv{

    int price;
    String color;

    public samsung(String type, int price) {
        super(type);
        this.price = price;
    }

    public samsung(String type, String color) {
        super(type);
        this.color = color;
    }

    void displaycolor(){

        System.out.println("Color"+color);
        System.out.println("Type"+type);
    }





}
