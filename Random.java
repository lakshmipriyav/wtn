import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
 
 class RandomHelper{
    static int RandInt() {Scanner sc= new Scanner(System.in);      int x=sc.nextInt();
       int y=sc.nextInt();
	int randomInt = ThreadLocalRandom.current().nextInt(x, y+1);
	return randomInt;
	 }}
public class Random {
 
   public static void main(String[] args) {
       RandomHelper r=new RandomHelper();
	System.out.println("Random number generated is : " +r.RandInt());
   }}
   
