package sukijava_Eroor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Eroor01 {
    public static void main(String[] args) {
        try(FileInputStream is = new FileInputStream("Sample.txt")){
            throw new FileNotFoundException();
        }catch(Exception e){
            System.out.println("A");{
        }finally{
            if(is != null){
                is.close();
            }
            System.out.println("B");
        }
    }
}
}
