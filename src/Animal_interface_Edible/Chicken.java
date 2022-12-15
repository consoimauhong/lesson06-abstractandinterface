package Animal_interface_Edible;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken : chit chit...! ";
    }
    public String howToEat(){
        return "fry";
    };
}
