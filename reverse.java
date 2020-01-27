public class MyClass {
    public static void main(String args[]) {
   
if(args.length<4)
{
   System.out.println("Please enter 4 integer numbers");
}
else

{
    System.out.println("The given array is : ");
    for(int i=0;i<args.length;i++)  
{
if(i==2)
{
    System.out.println("");
}
  System.out.print(args[i]+" "); 
}

 System.out.println("");
 System.out.println("The reverse of the array is : ");
    for(int i=args.length-1;i>=0;i--)  
{
if(i==1)
{
    System.out.println("");
}
  System.out.print(args[i]+" "); 
}


}
        
    }
}
