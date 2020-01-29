class Person{  
String name;  
}  
class Student extends Person{
   int year;}


class Teacher extends Person{
     double salary;
    String sub;
    Teacher(String n,double sal,String s)
    {
        super.name=n;
        salary=sal;
        sub=s;
    }
    void print(){  
System.out.println(super.name+" "+salary+" "+sub);  
}  
} 
class CollegeStudent extends Student{
    int year;
    String major;
    CollegeStudent(String n,int y,String m)
    {
        super.name=n;
        year=y;
        major=m;
    }
     void print(){  
System.out.println(super.name+" "+year+" "+major);  
}  
}

public class TestEmployee{  
public static void main(String args[]){  
Teacher t=new Teacher("abc",30000.0,"chemistry");
t.print();
CollegeStudent cs= new CollegeStudent("qwe",2019,"cse");
cs.print();
}}  
