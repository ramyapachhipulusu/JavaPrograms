import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class scoreCard{
    Map<String,Integer> stu= new TreeMap<>();
    public void addStudent(String name,int marks){
        
        stu.put(name,stu.getOrDefault(name, 0)+marks);      

    }
    public void printScore(){
            stu.entrySet()
            .stream()
            .sorted(Comparator.comparing(Map.Entry::getKey))
            .forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
            // stu.stream().sorted()
            //stu.stream.sorted(Map.Entry.comparingByKey);
    }

    public static void main(String args[]){
        scoreCard sc=new scoreCard();
        sc.addStudent("One", 67);
        sc.addStudent("Two", 71);
        sc.addStudent("Third",61);
        sc.addStudent("AA",61);
        sc.addStudent("One", 10);
        sc.addStudent("Third",15);

        sc.printScore();
    }
    
}