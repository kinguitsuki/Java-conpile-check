package sukijava5.sukijava5_2;

abstract class Sukijava5_2_abstract {
    String title;
    String adress;
    String text;


//interfaceではないため、自動でpublicは付かない
abstract void email(String title,String adress,String text);
    
}
