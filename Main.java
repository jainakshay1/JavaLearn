package JavaLearn;
import java.util.List;
import java.util.ArrayList;

public class Main {
  private List <Employee> emplist= new ArrayList<>();
  private void Addemp(Employee employee) {
    emplist.add(employee);
  }
  private void Removeemp(int id) {
    for(Employee employee:emplist){
        if(employee.getId()==id){
            emplist.remove(employee);
        }
    }
  }
  private void Showemplst() {
    for(Employee employee:emplist){
        System.out.println(employee.getId()+"  "+employee.getName()+" "+employee.getSalary());
    }
    
  }
    
  
public static void main(String[] args) {

    Main main =new Main();
    Employee emp1 =new Employee("akshay", 27000, 001);
    Employee emp2 =new Employee("akash", 29000, 002);
    Employee emp3 =new Employee("abhi", 24000, 003);
    Employee emp4 =new Employee("jos", 33000, 004);
    

    //adding employees
    main.Addemp(emp1);
    main.Addemp(emp2);
    main.Addemp(emp3);
    main.Addemp(emp4);

    main.Showemplst();
    main.Removeemp(2);
    

}
}
