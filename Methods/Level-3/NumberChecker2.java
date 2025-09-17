import java.util.*;

class NumberChecker2 {
    static int[] digits(int n){ return Integer.toString(n).chars().map(c->c-'0').toArray(); }
    static int sum(int[] d){ int s=0; for(int x:d)s+=x; return s; }
    static int sumSquares(int[] d){ int s=0; for(int x:d)s+=x*x; return s; }
    static boolean harshad(int n){ return n%sum(digits(n))==0; }
    static void freq(int n){
        int[] f=new int[10]; for(int x:digits(n)) f[x]++;
        for(int i=0;i<10;i++) if(f[i]>0) System.out.println(i+":"+f[i]);
    }
    public static void main(String[] args){
        int n=21;
        System.out.println("Sum:"+sum(digits(n)));
        System.out.println("Squares Sum:"+sumSquares(digits(n)));
        System.out.println("Harshad? "+harshad(n));
        freq(n);
    }
}
