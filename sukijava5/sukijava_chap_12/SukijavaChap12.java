package sukijava5.sukijava_chap_12;

public class SukijavaChap12 {
    public static void main(String[] args) throws Exception{
        // Hero の配列を作成
        Hero[] heroes = new Hero[3];
        
        // Hero インスタンスを配列に代入
        heroes[0] = new Hero();       // デフォルト（HP:100, MP:50）
        heroes[1] = new Hero(120);    // HP:120, MP:50
        heroes[2] = new Hero(80, 30); // HP:80, MP:30

        // Getter を使って値を取得
        System.out.println("Hero[0] HP: " + heroes[0].getHp()); // 100
        System.out.println("Hero[1] HP: " + heroes[1].getHp()); // 120
        System.out.println("Hero[2] MP: " + heroes[2].getMp()); // 30

        for(Hero hero : heroes){
            if(hero != null){
        int oldhp = hero.getHp();
        int newhp = oldhp + 10;
        hero.setHp(newhp);
        System.out.println("HPが" + oldhp + "から" + hero.getHp() + "になりました！");
            }else{
                throw new Exception("エラーです");
            }
        }
    }
}
