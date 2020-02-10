/**
 * @Date 2020/2/9 14:21
 * @Author Wang
 */


package isPowerOfTwo;


import java.util.Scanner;


public class pof
{
    public static void main(String[] args){
        System.out.println("输入");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
    if(n<=0){
        a=0;}
    else if(n == 1) {
            a = 1;
        }
    else{
        if(n%2==0){
            a=1;
        }else{
            a=0;
        }
    }
if(a==0){
    System.out.println("不是");
}
else {
    System.out.println("是");
}
   return;
    }

}

