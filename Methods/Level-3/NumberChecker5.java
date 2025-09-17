class NumberChecker5 {
    static int divSum(int n){ int s=1; for(int i=2;i<=n/2;i++) if(n%i==0) s+=i; return n==1?0:s; }
    static boolean perfect(int n){ return divSum(n)==n; }
    static boolean abundant(int n){ return divSum(n)>n; }
    static boolean deficient(int n){ return divSum(n)<n; }
    static boolean strong(int n){ int m=n,s=0; while(m>0){int d=m%10,f=1;for(int i=1;i<=d;i++)f*=i;s+=f;m/=10;} return s==n; }
    public static void main(String[] args){
        int n=145;
        System.out.println("Perfect? "+perfect(n));
        System.out.println("Abundant? "+abundant(n));
        System.out.println("Deficient? "+deficient(n));
        System.out.println("Strong? "+strong(n));
    }
}
