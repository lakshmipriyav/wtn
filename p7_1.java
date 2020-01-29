class Poly{
    public void Pol(char ch[])
    {
       for(int i=0;i<ch.length;i++)
       {
           System.out.print(ch[i]+" ");
       }
       System.out.println();
    }
    public void Pol(int a[])
    {
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
       System.out.println();
    }
   public void Pol(double b[])
    {
       for(int i=0;i<b.length;i++)
       {
           System.out.print(b[i]+" ");
       }
       System.out.println();
    }
} 
public class Test{  
public static void main(String args[]){  
    char[] ch={'a','b','c'};  
    int [] a={0,1,2,3,4,5,6,7};
    double []b={1.32,123.21,432.4,33.5};
Poly p=new Poly();
p.Pol(ch);
p.Pol(a);
p.Pol(b);
}}  
