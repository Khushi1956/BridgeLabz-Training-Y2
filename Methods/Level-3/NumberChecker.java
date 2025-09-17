import java.util.*;

class NumberChecker {
    static int[] digits(int n){ return Integer.toString(n).chars().map(c->c-'0').toArray(); }
    static boolean duck(int n){ for(int d:digits(n)) if(d==0) return true; return false; }
    static boolean armstrong(int n){ int[] d=digits(n), arr=d; int p=d.length,s=0; for(int x:d) s+=Math.pow(x,p); return s==n; }
    static void largestSmallest(int n){
        int[] d=digits(n); int l=Integer.MIN_VALUE,sl=l,s=Integer.MAX_VALUE,ss=s;
        for(int x:d){ if(x>l){sl=l;l=x;} else if(x>sl&&x!=l) sl=x;
                       if(x<s){ss=s;s=x;} else if(x<ss&&x!=s) ss=x; }
        System.out.println("Largest:"+l+" Second:"+sl+" Smallest:"+s+" Second:"+ss);
    }
    public static void main(String[] args){
        int n=153;
        System.out.println("Duck? "+duck(n));
        System.out.println("Armstrong? "+armstrong(n));
        largestSmallest(n);
    }
}
