class first{
    int num;
    boolean value=false;
    public synchronized void set(int num){
        while(value){
            try{wait();}
            catch(Exception e){}
        }
        System.out.println("Produced:"+num);
        this.num=num;
        value=true;
        notify();

    }
    public synchronized void get(){
        while(!value){
            try{wait();}
            catch(Exception e){}
        }
        System.out.println("Consumed:"+num);
        value=false;
        notify();

    }
}
class Producer implements Runnable{
    first f;
    public Producer(first f){
        this.f=f;
        Thread t =new Thread(this,"Producer");
        t.start();
    }
    public void run(){
        int i=0;
        while(i<5){
            f.set(i++);
        }
    }
}
class Consumer implements Runnable{
    first f;
    public Consumer(first f){
        this.f=f;
        Thread t =new Thread(this,"Consumer");
        t.start();
    }
    public void run(){
        int i=0;
        while(i<5){
            f.get();
        }
    }
}
public class proCon{
   public static void main(String args[]){
    first f=new first();
    new Producer(f);
    new Consumer(f);
   } 
}
