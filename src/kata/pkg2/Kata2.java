package kata.pkg2;
import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        Integer []array={1,4,7,1,1,8,4,1,4,9};
        String [] array1 ={"Ana","Juan","Pedro","Ana","Juan"};
        
        Histogram histo=new Histogram(array1);
        HashMap <String,Integer> histogram = histo.getHisto();
       
        for(Object key:histogram.keySet()){
            System.out.println( key+":"+ histogram.get(key));
        }
    }
}
