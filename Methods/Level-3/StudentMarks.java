import java.util.*;

class StudentMarks {
    static int[][] generateScores(int n){
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                scores[i][j]=10+(int)(Math.random()*90); // 2-digit marks
        return scores;
    }
    static double[][] calcResults(int[][] s){
        int n=s.length; double[][] res=new double[n][3]; // total, avg, perc
        for(int i=0;i<n;i++){
            int total=s[i][0]+s[i][1]+s[i][2];
            double avg=total/3.0, perc=total/300.0*100;
            res[i][0]=total;
            res[i][1]=Math.round(avg*100.0)/100.0;
            res[i][2]=Math.round(perc*100.0)/100.0;
        }
        return res;
    }
    static void display(int[][] s,double[][] r){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc");
        for(int i=0;i<s.length;i++)
            System.out.println(s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t"+(int)r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int n=sc.nextInt();
        int[][] scores=generateScores(n);
        double[][] results=calcResults(scores);
        display(scores,results);
    }
}
