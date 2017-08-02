/**
 * Author: tianyi
 * Time: 2017/8/1
 * Question:大数乘法
 * Source:拼多多
 */
import java.util.*;
public class BigInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String str3="";
        int a[]=new int[str1.length()];
        int b[]=new int[str2.length()];
        int c[]=new int[str1.length()+str2.length()];
        getint(str1,a);
        getint(str2,b);
        for (int i = 0; i <str1.length() ; i++) {
            for (int j = 0; j <str2.length() ; j++) {
                c[i+j]+=a[i]*b[j];
            }
        }
        for (int i = 0; i <str1.length()+str2.length()-1 ; i++) {
            c[i+1]+=c[i]/10;
            c[i]=c[i]%10;
        }
        int r=str1.length()+str2.length()-1;
        while(c[r]==0){
            if(r==0){
                System.out.println("0");
            }
            r--;
        }
        for (int i = r; i >=0 ; i--) {
            str3+=c[i];
        }
        str3.trim();
        System.out.println(str3);

    }
    public static void getint(String s,int[]m){
        int length=s.length();
        for (int i = 0; i <length ; i++) {
            m[length-1-i]=s.charAt(i)-'0';
        }
    }


}
