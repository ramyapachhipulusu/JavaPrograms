import java.util.HashMap;
import java.util.Map;

class inventorySystem{

    Map<String,Integer> inventory =new HashMap<>();

    public void addOrUpdateStock(String inv,int quantity){
        inventory.put(inv,inventory.getOrDefault(inv, 0)+quantity);
       /*if (!inventory.containsKey(inv)) 
        inventory.put(inv,quantity); 
        else
        inventory.put(inv,inventory.get(inv)+quantity);*/
    }
    public int getStock(String inv){
        return inventory.get(inv);
    }
    public  void printInventory(){
        inventory.forEach((item,quantity)->System.out.println("Item: "+item+" Qunatity: "+quantity));
    }
    
    public static void main(String args[]){
        inventorySystem inv=new inventorySystem();
        inv.addOrUpdateStock("Pencil",3);
        inv.addOrUpdateStock("Marker", 4);
        inv.addOrUpdateStock("Pen", 10);
        inv.addOrUpdateStock("Pencil", 6);

        inv.getStock("Pencil");
        inv.printInventory();
        
    }
}