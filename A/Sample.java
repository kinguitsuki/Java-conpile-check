package A;

public class Sample {
    //メンバ変数
    public String field; // publicフィールド
    public static String field2; // staticフィールド
    public final String field3; // finalフィールド
    //public abstract String field10; // abstractフィールド(abstractはメソッドにしか使えません)

    Sample(String field3) {
        this.field3 = field3;
    }

    public void sample() {
        // ローカル変数にはアクセス修飾子を付与できない
        String field4; // OK
        // public String field4; // コンパイルエラー

        // ローカル変数にはstatic修飾子を付与できない
        // static String field5; // コンパイルエラー

        // ローカル変数にはfinal修飾子を付与できる
        final String field6; // OK

        // ローカル変数にはabstract修飾子を付与できない
        // abstract String field7; // コンパイルエラー

        // ローカル変数にはstatic修飾子を付与できない
        // static String field8; // コンパイルエラー

        //定数化していないフィ-ルドに触れるとエラーが起こる
        //System.out.println(field6);
    }
}