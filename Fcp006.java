import java.util.Scanner;
  public class LastDig{
     public static void main(String[]args){
      Scanner kk=new Scanner(System.in);
       int a=kk.nextInt();
       System.out.println(Last(a));

}

public static int Last(int x){
   return x%10;
}
}