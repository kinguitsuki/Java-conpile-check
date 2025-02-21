package sukijava5.sukijava_chap_12;

public class Hero {
    private int hp;
    private int mp;

    // ⭐ コンストラクタを public に変更（外部からインスタンス化できるようにする）
    public Hero() {
        this.hp = 100;
        this.mp = 50;
    }

    public Hero(int hp) {
        this.hp = hp;
        this.mp = 50;
    }

    public Hero(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }

    // ⭐ getter（カプセル化）
    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    // ⭐ setter（カプセル化）
    public void setHp(int hp) {
        if (hp >= 0) { // 負のHPを防ぐ
            this.hp = hp;
        }
    }

    public void setMp(int mp) {
        if (mp >= 0) { // 負のMPを防ぐ
            this.mp = mp;
        }
    }
}
