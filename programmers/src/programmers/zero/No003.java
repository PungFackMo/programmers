package programmers.zero;

import java.util.Scanner;

public class No003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String addStr="";
        for(int i=0;i<n;i++){
            addStr+=str;
        }
        System.out.print(addStr);
    }
}
