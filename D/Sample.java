package D;

public class Sample {
    int x;

    public void setX(int x) {
        x = x; // ローカル変数xにローカル変数xの値を代入 (何もしない)
    }

    public void setX2(int x) {
        this.x = x; // フィールド変数xにローカル変数xの値を代入
    }

    public int getX() {
        return x; // 暗黙的にthis.xと解釈される
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.setX(10); // フィールドxの値は変わらない
        System.out.println(s.getX()); // 0が出力される

        s.setX2(10); // フィールドxの値が10になる
        System.out.println(s.getX()); // 10が出力される
    }
}