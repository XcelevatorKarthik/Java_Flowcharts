

import java.util.Scanner;
  
     public class Fcp003{
         public static void main(String[]args){
            Scanner kk=new Scanner(System.in);
            int a=kk.nextInt();
            int b=kk.nextInt();
            Swap(a,b);
             


}
public static  void Swap(int x,int y){
            int c=x;
              x=y;
              y=c;
           System.out.println(x);
           System.out.println(y);
}
}