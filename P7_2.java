class Fruit{
    String name,taste;
    double size=20.6;
   
}
class Apple extends Fruit{
     public void eat()
    {
          super.name="apple";
        System.out.println(name +" "+"sweet"+" "+size);
    }
}

class Orange extends Fruit{
     public void eat()
    {
          super.name="orange";
        System.out.println(name +" "+"Sour"+" "+size);
    }
}
public class TestEmployee{  
public static void main(String args[]){  
    Apple a=new Apple();
    a.eat();
    Orange o=new Orange();
    o.eat();
}}  
