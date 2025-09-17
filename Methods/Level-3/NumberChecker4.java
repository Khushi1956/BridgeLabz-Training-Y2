class NumberChecker4 {
    static boolean prime(int n){ if(n<2)return false; for(int i=2;i*i<=n;i++) if(n%i==0) return false; return true; }
    static boolean neon(int n){ int s=0,m=n*n; while(m>0){s+=m%10;m/=10;} return s==n; }
    static boolean spy(int n){ int s=0,p=1,m=n; while(m>0){int d=m%10;s+=d;p*=d;m/=10;} return s==p; }
    static boolean auto(int n){ return (n*n+"").endsWith(n+""); }
    static boolean buzz(int n){ return n%7==0||n%10==7; }
    public static void main(String[] args){
        int n=7;
        System.out.println("Prime? "+prime(n));
        System.out.println("Neon? "+neon(n));
        System.out.println("Spy? "+spy(n));
        System.out.println("Automorphic? "+auto(n));
        System.out.println("Buzz? "+buzz(n));
    }
}
