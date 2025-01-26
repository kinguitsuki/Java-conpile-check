package practice;

//継承応用の講義です。
// 親クラス
public class Item {
    // クラス内変数
    static String name;
    int price;

    // コンストラクタ（名前のみ指定）
    public Item(String name) {
        this.name = name;
        this.price = 0; // デフォルト値を0に設定
    }

    // コンストラクタ（名前と価格を指定）
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

// 子クラス
class Weapon extends Item {
    // 子クラスのコンストラクタ
    public Weapon(String name, int price) {
        super(name, price); // 親クラスのコンストラクタを呼び出す
    }
}

// メインクラス
class Main {
    public static void main(String[] args) {
        // Weaponインスタンスの生成
        Weapon weapon = new Weapon("Excalibur", 1000);
        
        // 情報を表示
        System.out.println("Weapon Name: " + weapon.name);
        System.out.println("Weapon Price: " + weapon.price);
    }
}

