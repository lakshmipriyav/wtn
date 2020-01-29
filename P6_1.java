class Parent{  
int x=98;  
}  
class Child extends Parent{  
int x=10;
void print(){  
System.out.println(x);
System.out.println(super.x);  
}  
}  
public class MyClass{  
public static void main(String args[]){  
Child c=new Child();  
c.print();  
}}  
