import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            int cnt=0;
            //100의 자리
            if(i/100==3||i/100==6||i/100==9) cnt++;
            //10의 자리
            if((i%100)/10==3||(i%100)/10==6||(i%100)/10==9) cnt++;
            //일의 자리
            if(i%10==3||i%10==6||i%10==9) cnt++;
             
            if(cnt==0) System.out.print(i+" ");
            if(cnt==1) System.out.print("- ");
            if(cnt==2) System.out.print("-- ");
            if(cnt==3) System.out.print("--- ");
             
        }
    }//main
 
}