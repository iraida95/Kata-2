package kata.pkg2;
import java.util.HashMap;

public class Histogram {
    private final int[] vector;
    
    public Histogram(int[]vector){
    this.vector=vector;
    }
    public int []getElvector(){
        return vector;
    }
    public  HashMap<Integer,Integer> getHisto(){
        HashMap<Integer,Integer> histo =new HashMap<>();
        for(int i=0;i<vector.length;i++){
            if(!histo.containsKey(vector[i])){
                histo.put(vector[i],0);
            }
            histo.put(vector[i],histo.get(i))
        }      
    }  
    return histo;
}
