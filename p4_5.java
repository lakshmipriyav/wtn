import java.util.*;
class Patient{
    String name;
    double weight,height;
    Patient(String name,  double weight,double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
        }
        public double bmi(double weight,double height)
        {
            return ( weight / ( height*height ) ) * 703;
        }
}
class Patients{
    Patients(){
    Scanner sc= new Scanner(System.in);
    String[][] s = new String[10][3];
      for(int i = 0; i < 10; i++){
          s[i][0]=sc.next();
           s[i][1]=sc.next();
           s[i][2]=sc.next();
           double weight=Double.parseDouble(s[i][1]);
            double height=Double.parseDouble(s[i][2]);
            Patient p=new Patient(s[i][0],weight,height);
            if(p.bmi(weight,height)>25)
            {
                System.out.println("name: "+s[i][0]);
            }
            }}
}
public class MyClass {
    public static void main(String args[]) {
     
     Patient p=new Patient("Abc",59.0,5.6);
     System.out.println(p.bmi(59.0,5.6));
     Patients ps=new Patients();
    }
}
