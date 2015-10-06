package kata.pkg2;
import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        int[]array={1,4,7,1,1,8,4,1,4,9};
        
        Histogram histo=new Histogram(array);
        int [] array 
        HashMap <Integer,Integer> histogram = histo.getHisto();
       
        for(Integer key:histogram.keySet()){
            System.out.println( key+":"+ histogram.get(key));
        }
    }
}
