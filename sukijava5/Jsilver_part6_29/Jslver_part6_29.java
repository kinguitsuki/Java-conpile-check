package sukijava5.Jsilver_part6_29;

public class Jslver_part6_29 {
    public static void main(String[] args) {
        Jsilver_part6_29_2 a = new Jsilver_part6_29_2(10);
        atai_modify(a.num);
        System.out.println(a.num);

        sansyo_modify(a);
        System.out.println(a.num);

    }
    //値渡し(オブジェクトから値だけを取り出して渡している)
    private static void atai_modify(int num){
        num *= 2;
    }

        //参照渡し（オブジェクトごと渡して、そのオブジェクトの値ごと変更している）
        private static void sansyo_modify(Jsilver_part6_29_2 obj){
            obj.num *= 2;
        }

}
