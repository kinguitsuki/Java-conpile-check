package sukijava5.Jsilver_00;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("A", 100));
        list.add(new Item("B", 200));
        list.add(new Item("C", 300));
        list.add(new Item("A", 100));
        list.remove(new Item("A",500));
        for(Item item:list){
            //Item item  new Item*(A 100);
            // new Item*(B 200);
            // new Item*(C 300);
            // new Item*(A 100);
            // remove Item*(A 500);
            System.out.println(item.getName());
        }
    }

}
