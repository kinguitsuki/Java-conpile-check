package JavaSilver;

class Animal{
    void speak(){
        System.out.println("鳴く");
    }
}

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("わんわん");
    }
}

class Ant extends Animal{
    @Override
    void speak(){
    }

    void work(){
        System.err.println("餌を運ぶ");
    }
}

public class Main{
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.speak();

        Animal ant = new Ant();
        ant.speak();
        //ant.work();

    }
}
