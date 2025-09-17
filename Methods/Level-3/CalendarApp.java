import java.util.*;

class CalendarApp {
    static String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    static boolean leap(int y){ return (y%400==0)||(y%4==0&&y%100!=0); }
    static int firstDay(int m,int y){
        int d=1; // 1st of month
        if(m<3){ m+=12; y--; }
        int k=y%100,j=y/100;
        return (d+(13*(m+1))/5+k+k/4+j/4+5*j)%7; // Zeller’s
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month(1-12) and year: ");
        int m=sc.nextInt(), y=sc.nextInt();
        int d=days[m-1]; if(m==2&&leap(y)) d=29;
        int start=firstDay(m,y);
        System.out.println("\n   "+months[m-1]+" "+y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for(int i=0;i<start;i++) System.out.print("   ");
        for(int i=1;i<=d;i++){
            System.out.printf("%2d ",i);
            if((i+start)%7==0) System.out.println();
        }
    }
}
