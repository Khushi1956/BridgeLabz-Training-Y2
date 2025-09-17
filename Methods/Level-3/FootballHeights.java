import java.util.*;

class FootballHeights {
    static int sum(int[] arr){ int s=0; for(int x:arr) s+=x; return s; }
    static double mean(int[] arr){ return sum(arr)/(double)arr.length; }
    static int min(int[] arr){ return Arrays.stream(arr).min().getAsInt(); }
    static int max(int[] arr){ return Arrays.stream(arr).max().getAsInt(); }

    public static void main(String[] args){
        Random r=new Random();
        int[] h=new int[11];
        for(int i=0;i<11;i++) h[i]=150+r.nextInt(101); //150–250
        System.out.println("Heights: "+Arrays.toString(h));
        System.out.println("Shortest: "+min(h));
        System.out.println("Tallest: "+max(h));
        System.out.println("Mean: "+mean(h));
    }
}
