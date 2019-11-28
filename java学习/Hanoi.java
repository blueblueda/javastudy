package work;
import java.util.Scanner;
public class Hanoi {
    static int i = 1;
    public static void main(String[] args){
        int n = 0;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        System.out.println("铜片数");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        hanNoi(n,'A','B','C');
    }
    public static void move(int n, char origin, char target){
        System.out.println("第"+i+"步，将"+n+"号铜片从"+origin+"——>"+target);
        i++;
        // 操作步骤
    }
    public static void hanNoi(int n,char origin, char process, char target){
        if(n == 1){
            move(1,origin,target);//只剩下一个盘子的时候，直接到目标
            return;
        }
        hanNoi(n-1,origin,target,process);//先把n-1个盘子从起始移动到过程上面
        move(n,origin,target);//然后把第n个盘子从起始移到目标
        hanNoi(n-1,process,origin,target);//最后把n-1个盘子从过程移动到目标
    }

}
