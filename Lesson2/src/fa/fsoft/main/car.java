package fa.fsoft.main;
public class car {
    String color;
    String brand;
    double weight;
    String model;
    public car(){}
    public car(String color, String brand){
        this.color = color;
        this.brand = brand;
    }
    public car(String color, String brand, double weight, String model){
        this.color = color;
        this.brand = brand;
        this.weight = weight;
        this.model = model;
    }
    @Override
    public String toString(){
         return "Car [color = " + color + ", brand = " + brand
                 + ", weight = " + weight + ", model = " + model + "]";
    }
}

