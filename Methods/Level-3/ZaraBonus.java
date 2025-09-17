import java.util.*;

class ZaraBonus {
    static int[][] getData(){
        int[][] arr=new int[10][2]; // salary, years
        for(int i=0;i<10;i++){
            arr[i][0]=10000+(int)(Math.random()*90000); // 5-digit salary
            arr[i][1]=(int)(Math.random()*10+1); // 1–10 years
        }
        return arr;
    }
    static double[][] newSalary(int[][] data){
        double[][] res=new double[10][2]; // new salary, bonus
        for(int i=0;i<10;i++){
            double bonus=data[i][1]>5?0.05*data[i][0]:0.02*data[i][0];
            res[i][0]=data[i][0]+bonus;
            res[i][1]=bonus;
        }
        return res;
    }
    public static void main(String[] args){
        int[][] data=getData();
        double[][] updated=newSalary(data);
        double oldSum=0,newSum=0,bonusSum=0;
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","Emp","Old","Years","New","Bonus");
        for(int i=0;i<10;i++){
            oldSum+=data[i][0]; newSum+=updated[i][0]; bonusSum+=updated[i][1];
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n",
                              i+1,data[i][0],data[i][1],updated[i][0],updated[i][1]);
        }
        System.out.println("\nTotal Old:"+oldSum+" New:"+newSum+" Bonus:"+bonusSum);
    }
}
