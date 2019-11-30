package work;

import java.awt.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        char[] s = str.toCharArray();
        char[] s2 = new char[10];
        int i = 0;
        int j = 0;
        for (i = 0; i < s.length; i++) {
            if (judgeRetition(s[i],s2)){
                ;
            }
            else{
                s2[j] = s[i];
                j++;
            }
        }
        System.out.println(s2);
    }
    public static boolean judgeRetition(char a,char[] s){
        int length = s.length;
        for(int i=0; i<length; i++){
            if(a == s[i]){
                return true;
            }
        }
        return false;
    }
}