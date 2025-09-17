import java.util.*;

class OTP {
    static int generate(){ return (int)(100000+Math.random()*900000); }
    static boolean unique(int[] a){
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i]==a[j]) return false;
        return true;
    }
    public static void main(String[] args){
        int[] otp=new int[10];
        for(int i=0;i<10;i++) otp[i]=generate();
        System.out.println("OTPs: "+Arrays.toString(otp));
        System.out.println("All Unique? "+unique(otp));
    }
}
