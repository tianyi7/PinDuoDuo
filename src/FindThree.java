/**
 * Author: tianyi
 * Time: 2017/8/1
 * Question:已知一个无序数组，由正数、复数、0组成，找出三个数使得乘积最大。
 * Source:pinduoduo
 */
import java.util.*;
public class FindThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0;
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
        }
        if(n<=2){
            System.out.println(0);
        }
        Arrays.sort(a);
        if(n>=3){
            max=(a[n-3]*a[n-2]*a[n-1])>(a[0]*a[1]*a[n-1])?(a[n-3]*a[n-2]*a[n-1]):(a[0]*a[1]*a[n-1]);
            System.out.println(max);
        }

    }

}
