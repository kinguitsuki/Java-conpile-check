package sukijava5.sukijava5_1;

import java.util.Scanner;

public class Sukijava5_1 {

    String  name;
    int age;
    double height;
    char eto;

    public void introduceOneself(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("名前を入力して下さい");
        this.name = scanner.nextLine();

        System.out.println("年齢を入力して下さい");
        this.age = scanner.nextInt();

        System.out.println("身長を入力して下さい");
        this.height = scanner.nextDouble();

        System.out.println("干支を入力して下さい");
        this.eto = scanner.next().charAt(0);
        scanner.close();

         // 入力結果を表示
        System.out.println("===== 自己紹介 =====");
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");
        System.out.println("干支: " + eto);
    }

    public static void main(String[]args){
        Sukijava5_1 person = new Sukijava5_1();
        person.introduceOneself();

    }

}
