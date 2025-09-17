import java.util.*;

class NumberChecker3 {
    static int[] digits(int n){ return Integer.toString(n).chars().map(c->c-'0').toArray(); }
    static int[] reverse(int[] d){ int[] r=new int[d.length]; for(int i=0;i<d.length;i++) r[i]=d[d.length-1-i]; return r; }
    static boolean equal(int[] a,int[] b){ return Arrays.equals(a,b); }
    static boolean palindrome(int n){ return equal(digits(n),reverse(digits(n))); }
    static boolean duck(int n){ for(int x:digits(n)) if(x==0) return true; return false; }
    public static void main(String[] args){
        int n=121;
        System.out.println("Palindrome? "+palindrome(n));
        System.out.println("Duck? "+duck(n));
    }
}
