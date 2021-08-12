package anima_and_interface_edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken Ò ó o";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
