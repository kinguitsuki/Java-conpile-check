package JavaSilver;

class A {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends A {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

}

class Cat extends A {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class polimofizm {
    public static void main(String[] args) {
        A animal1 = new Dog(); // アップキャスト 
        A animal2 = new Cat(); // アップキャスト

        animal1.makeSound(); // "Woof" が出力される
        animal2.makeSound(); // "Meow" が出力される
    }
}