package E;

class Parent {
int i = 10;

void returnPlus(int i){
    this.i = i;
}

}

class Child extends Parent {   
int i = 20;

@Override
void returnPlus(int i){
    this.i = i;
}

public class Main {
public static void main(String[] args) {
    
Parent parent = new Child(); // アップキャスト
parent.returnPlus(100);//childクラスのメソッドを実行しに行っている
System.out.println(parent.i); // 10 (Parentクラスのフィールド)

Child child = (Child)parent;
System.out.println(child.i);//よって100が出る

    }
}
}