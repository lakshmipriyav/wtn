import java.util.*;
import java.lang.Math; 
class Percentage{
    String sname,ssym;
    double pprice,cprice;
    Percentage(String sname,String ssym,double pprice,double cprice)
    {
        this.sname=sname;
        this.ssym=ssym;
        this.pprice=pprice;
        this.cprice=cprice;
    }
   double getChangePercentage()
    {
        
        return (((pprice-cprice)/pprice)*100);
    }
}

public class PercentageChange {
    public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   String sname,ssym;
    double pprice,cprice;
   sname=sc.next();
   ssym=sc.next();
   pprice=sc.nextDouble();
   cprice=sc.nextDouble();
Percentage p=new Percentage(sname,ssym,pprice,cprice);
double per=p.getChangePercentage();
if(per<0)
System.out.println(Math.abs(per)+" percentage decreased ");
else
System.out.println(Math.abs(per)+" percentage increased ");

        
    }
}
