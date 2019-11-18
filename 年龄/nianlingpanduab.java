import java.util.Scanner;
public class nianlingpanduab{
 
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("请输入你的年龄：");
     int age = sc.nextInt();
  
     if(age<=18){
         System.out.println("少年");
     }else if(19<=age&&age<=28){
         System.out.println("青年");
}else if(29<=age&&age<=55){
    System.out.println("中年");
}else{
    System.out.println("老年");
}
 }
 }
 