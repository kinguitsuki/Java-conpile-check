package sukijava5.sukijava5_2;

import java.util.Scanner;

public class Sukijava5_2 extends Sukijava5_2_abstract {

    @Override
    protected void email(String title, String adress, String text) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("タイトルを入力して下さい");
        super.title = title;  // 親クラスのフィールドを設定

        System.out.println("アドレスを入力して下さい");
        super.adress = adress;  // 親クラスのフィールドを設定

        System.out.println("テキストを入力して下さい");
        super.text = text;  // 親クラスのフィールドを設定

        // 必要であれば scanner.close() をここで呼び出す
        scanner.close();
    }

    public static void main(String[] args) {
        Sukijava5_2 person = new Sukijava5_2();
        
        // メールの内容を入力(ここにフロント側からの変数が入るようにする)
        person.email("重要なお知らせ", "someone@example.com", "本文の内容");
        
        // メールの内容を確認
        System.out.println("タイトル: " + person.title);
        System.out.println("アドレス: " + person.adress);
        System.out.println("テキスト: " + person.text);
    }
}
