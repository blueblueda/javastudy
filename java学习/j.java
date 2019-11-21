import java.util.Scanner;
public class j {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=jia(n);
    System.out.println("结果:"+x);
    
}
public static int jia(int n) {
    if (n==1){
        return 1;
    }
    int x=n+jia(n-1);
    return x;
}
}