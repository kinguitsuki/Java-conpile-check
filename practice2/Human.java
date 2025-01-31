package practice2;

//全メソッドに対して暗黙的publicが付けられている
interface  Human{
    //自動的にpublic static finalが設定されている状態
    String language = "言語"; 

    public static String getLanguage() {
        return language;
    }
    
    //自動的にメソッドはpublic abstractになるので、記述してもしなくても良い
    public abstract String eat();

    abstract String sleep();

    String drink();

}
