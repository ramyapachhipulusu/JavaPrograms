import java.util.*;
import java.util.ArrayList;

class Employee{
    int employeeId;
     int salary;

    public Employee(int employeeId,int salary){
        this.employeeId=employeeId;
        this.salary=salary;
          
    }
}

public class sortList{
    public static void main(String args[]){

        //Comparator<Employee> com=(e1,e2)->(e1.salary>e2.salary)? 1:-1;

        List<Employee> emp =new ArrayList<>();
          emp.add(new Employee(1,6000));
          emp.add(new Employee(2,5130));
          emp.add(new Employee(3,6020));

         Collections.sort(emp,(e1,e2)->Integer.compare(e1.salary,e2.salary));
         for(Employee e:emp){
            System.out.println(e.salary);
         }


    }
}