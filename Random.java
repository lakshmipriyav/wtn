import java.util.*;
class RandomHelper 
{
static int rand;
static Double rand1;
static void randint()
{
Scanner sc= new Scanner(System.in);
int p=sc.nextInt();
int q=sc.nextInt();
rand = (int)(Math.random() * (q-p)) +p;

}
static void randdouble(int c,int d)
{
rand1 = (Math.random() * (d-c)) +c;

}
void display()
{
System.out.println("random int is:"+rand);
}
void display1()
{
System.out.println("random double is:"+rand1);
}
}

public class MyClass{
public static void main(String [] args)
{
RandomHelper r=new RandomHelper();
RandomHelper.randint();
RandomHelper.randdouble(7,10);
r.display();
r.display1();

} 

}
