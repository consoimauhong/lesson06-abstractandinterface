import Animal_interface_Edible.Animal;
import Animal_interface_Edible.Chicken;
import Animal_interface_Edible.Tiger;
import edible.Edible;
import Fruit1.Fruit;
import Fruit1.Orange;
import Fruit1.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();// doi tuong
        animals[1] = new Chicken(); // doi tuong

        System.out.println("kt: "+animals[0].makeSound());

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
