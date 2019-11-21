import java.util.Scanner;
public class zw {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=jiecheng(n);
        System.out.println("结果："+x);
    }
    public static int jiecheng(int n){
        if(n==1){
            return 1;
        }
        int x=n*jiecheng(n-1);
        return x;
    }
}