import java.util.Arrays;
import java.util.List;

class reduce{
    public static void main(String args[]){
        List<Integer> lred= Arrays.asList(1,3,5,7,9);
        System.out.println(lred.stream().reduce(0,(i,j)->i+j));
       // System.out.print(lred.stream().mapToInt(Integer::intValue).sum());

    }
}