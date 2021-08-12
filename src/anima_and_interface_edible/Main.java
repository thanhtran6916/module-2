package anima_and_interface_edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal value : animals) {
            System.out.println(value.makeSound());
            if (value instanceof Chicken) {
                Edible edible = (Chicken) value;
                System.out.println(edible.howToEat());
            }
        }
    }
}
