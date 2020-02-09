/**
 * @Date 2020/2/8 15:46
 * @Author Wang
 */


package cp;

import java.util.Scanner;

public class zs {
    public static void main(String[] args) {
        Solution So = new Solution();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(So.countPrimes( n));
    }
}
class Solution{
    public int countPrimes(int n){
        int [] qiu= new int[n];
        int count=1;
        for(int i=3;i<n;i+=2){
            for(int j=3;j<i;j+=2){
                if(i%j ==0)
                    return count;
                else count++;
            }
        }
        return count;
    }
}

