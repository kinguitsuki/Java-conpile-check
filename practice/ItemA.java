package practice;

// ItemAクラス
public class ItemA {
    String name;
    int price;

    public ItemA(String name) {
        this.name = name;
        this.price = 0;
    }

    public ItemA(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

// Weaponクラス（外部クラス）
class Weapon extends ItemA {
    public Weapon() {
        super("てすと", 199);
    }

    @Override
    public String toString() {
        return "Weapon{name='" + name + "', price=" + price + "}";
    }
}

// Mainクラス（エントリーポイント）
class Main {
    public static void main(String[] args) {
        var w = new Weapon();  // Weaponのインスタンスを作成
        System.out.println(w);
    }
}
