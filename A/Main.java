package A;

class Animal {
    String name = "Unknown"; // Animalクラスのフィールド

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    String name = "犬";

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main { // クラス名をMainに変更 (慣習に従う)
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.name); // "Unknown"が出力
        animal.makeSound(); // "Woof"が出力

        Dog dog = new Dog();
        System.out.println(dog.name); // "犬"が出力
        dog.makeSound(); // "Woof"が出力
    }
}