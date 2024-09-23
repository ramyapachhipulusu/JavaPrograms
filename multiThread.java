import java.util.HashMap;
import java.util.Map;

class A  {
    
    int availableTickets=30;
    Map<Integer,Integer> ticketMap=new HashMap<>();
    public synchronized void bookTickets(int id,int tickets){
          if(availableTickets >= tickets){
            availableTickets -= tickets;
            ticketMap.put(id, ticketMap.getOrDefault(id,0)+tickets);
            System.out.println(ticketMap.get(id)+" -Tickets booked for :" +id);
          }
          else
            System.out.println(availableTickets+" -Tickets are only available");
    }

}
public class multiThread{
    public static void main(String args[]){
    A a1=new A();

    Runnable book = ()->a1.bookTickets(1, 9);
    Runnable book1 = ()->a1.bookTickets(2, 6);
    Runnable book2 = ()->a1.bookTickets(3, 17);
    Runnable book3 = ()->a1.bookTickets(1, 10);

    Thread t1=new Thread(book);
    Thread t2=new Thread(book1);
    Thread t3=new Thread(book2);
    Thread t4=new Thread(book3);
     
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }

}