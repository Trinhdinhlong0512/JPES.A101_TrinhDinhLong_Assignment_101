package fa.fsoft.main;

public class CarManagent {
    public static void main(String[] args){
        car ford = new car("White", "Ford", 1000, "2017");
        car audi = new car("Black", "Audi");
        System.out.println(ford);
        System.out.println(audi);
    }
}
