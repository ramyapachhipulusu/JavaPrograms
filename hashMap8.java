import java.util.HashMap;
import java.util.Map;


public class hashMap8{


public Map<Integer,Integer> countFreq(int[] i){
        Map<Integer,Integer> freq=new HashMap<>();

        for (int j : i) {
            
            freq.put(j, freq.getOrDefault(j, 0) + 1);
            //freq.merge(i,1,Integer::sum);
        }
        return freq;
}
public static void main(String args[]){

    int[] input= {12,16,18,19,13,13,14,16,15,12,13,14};
    hashMap8 h=new hashMap8();
    Map<Integer, Integer> freq = h.countFreq(input);
    freq.forEach((i, num)->System.out.println(i+","+num));

}
}