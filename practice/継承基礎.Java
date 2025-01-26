package practice;

public class Item{
    //クラス内変数
    String name;
    int price;

    public Item(String name){
        //nameはクラス内変数に関与。priceは引数が無いので強制的に0をクラス内変数に代入する。
        this.name = name;
        this.price = 0;
    }

    public Item(String name, int price){
        //nameもpriceもクラス内変数に関与
        this.name = name;
        this.price = price;
    }

    //別クラスの内容
    public class Weapon extends Item{
        //暗黙的にsuper()は追加される。他の親クラスコンストラクタを呼び出したかったら、明示的に記述しなければならない
        //super();
    }

    //更に別クラスの内容
    public class Main{
        public static void main(String[]args){
            Weapon w = new Weapon();
        }
    }
}

