package kata.pkg2;
import java.util.HashMap;

public class Histo {
    
    private final int[] Vector;

    public Histo(int[]Vector){
    this.Vector=Vector;

    }
    public int []getElvector(){
        return Vector;
    }
    public HashMap<Integer,Integer> getHisto(){
        HashMap<Integer,Integer> histogram=new HashMap<>();
        for(int i=0;i<Vector.length;i++){
         if(!histogram.containsKey(Vector[i])){
             histogram.put(Vector[i],1);
          }else{
            histogram.put(Vector[i],Vector[i]+1);
         }
        }
        return histogram;
    }  
}
