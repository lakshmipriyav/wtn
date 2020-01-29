class Person{  
String name;  
}  
class Employee extends Person{
    double salary;
    String insur;
int start_year;
Employee(String n,double sal,int y,String ins)
{
    super.name=n;
    salary=sal;
    start_year=y;
    insur=ins;
}
void print(){  
System.out.println(super.name+" "+salary+" "+start_year+" "+insur);  
}  
}  
public class TestEmployee{  
public static void main(String args[]){  
Employee e=new Employee("ravi",3000.0,2019,"jdnjdh");  
e.print();  
}}  
