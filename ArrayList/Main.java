package JavaLearn.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    ArrayList <String> lst = new ArrayList<>();
    ArrayList <Student> list = new ArrayList<>();
    public void addstd(Student std) {
        
    }
    public void searchstd(int id) {
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        lst.add("akshay"); 
        lst.add("jain");
        System.out.println(lst);
        Student std1 =new Student(1, "akshay");
        Student std2 = new Student(2, "jain");
        
        list.add(std1);
        list.add(std2);
        Student newstd =new Student(0, null)
        list.get(1)

    }
    

    
}