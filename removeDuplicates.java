import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicates{
    public static void main(String args[]){
        List<Integer> l1=Arrays.asList(1,1,2,3,4,5,3,6,9,6);
        List<String> l2=Arrays.asList("next","before","after","after","later","next");
        System.out.println(l1.stream().collect(Collectors.toSet()));
        System.out.println(l2.stream().collect(Collectors.toSet()));
    }
}