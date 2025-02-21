package A;


public class MyClass {

    // staticフィールド
    public static  int myStaticField = 10;
    public static String myStaticString = "Hello, Static World!";

    // staticメソッド
    public static void myStaticMethod() {
        System.out.println("My static method is called.");
        System.out.println("myStaticField: " + myStaticField); // staticフィールドにアクセス
        System.out.println("myStaticString: " + myStaticString); // staticフィールドにアクセス
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // staticフィールドへのアクセス
        System.out.println("MyClass.myStaticField: " + MyClass.myStaticField);
        System.out.println("MyClass.myStaticString: " + MyClass.myStaticString);

        // staticメソッドの呼び出し
        MyClass.myStaticMethod();

        int sum = MyClass.add(5, 3);
        System.out.println("5 + 3 = " + sum);
    }
}