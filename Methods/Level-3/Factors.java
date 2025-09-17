import java.util.*;

class Factors {
    static int[] getFactors(int n){
        int count=0; for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] f=new int[count]; int k=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[k++]=i;
        return f;
    }
    static int greatest(int[] f){ return f[f.length-1]; }
    static int sum(int[] f){ int s=0; for(int x:f)s+=x; return s; }
    static long product(int[] f){ long p=1; for(int x:f)p*=x; return p; }
    static double cubeProduct(int[] f){ double p=1; for(int x:f)p*=Math.pow(x,3); return p; }

    public static void main(String[] args){
        int n=12; int[] f=getFactors(n);
        System.out.println("Factors: "+Arrays.toString(f));
        System.out.println("Greatest: "+greatest(f));
        System.out.println("Sum: "+sum(f));
        System.out.println("Product: "+product(f));
        System.out.println("Cube Product: "+cubeProduct(f));
    }
}
