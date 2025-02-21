public class Sample {
    int a;
    int b;
    int c;
    int d;

    void setA(int a) {
        a = a; // これはローカル変数aに値を代入しているだけで、フィールドaには影響しない
    }

    void setB() {
        this.b = b; // フィールドbにローカル変数bの値を代入しようとしているが、ローカル変数bは宣言されていないため、コンパイルエラーになる
    }

    int setC() {
        return c; // フィールドcの値を返すが、フィールドcは初期化されていないため、0が返る
    }

    int setD(int num) {
        d = num; // フィールドdにnumの値を代入
        return d; // フィールドdの値を返す
    }

    void setAll(int x) {
        a = b = c = setD(x); // setDに値を入れて、結果として、this.d =10;が返ってくる。それをcの参照にもbの参照にも入れている。
    }

    @Override
    public String toString(){
        return "Sample [a=" + a + ", b=" + b + ", C=" + c + ", d=" + d +"]";
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.setAll(10);
        System.out.println(s);
    }
}