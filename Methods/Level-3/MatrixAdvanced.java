import java.util.*;

class MatrixAdvanced {
    static int[][] randomMatrix(int n){
        int[][] m=new int[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    static int[][] transpose(int[][] m){
        int n=m.length; int[][] t=new int[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) t[j][i]=m[i][j];
        return t;
    }
    static int det2x2(int[][] m){ return m[0][0]*m[1][1]-m[0][1]*m[1][0]; }
    static int det3x3(int[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    static double[][] inv2x2(int[][] m){
        int d=det2x2(m); double[][] inv=new double[2][2];
        inv[0][0]=m[1][1]/(double)d; inv[0][1]=-m[0][1]/(double)d;
        inv[1][0]=-m[1][0]/(double)d; inv[1][1]=m[0][0]/(double)d;
        return inv;
    }
    static double[][] inv3x3(int[][] m){
        int d=det3x3(m); double[][] inv=new double[3][3];
        for(int i=0;i<3;i++) for(int j=0;j<3;j++){
            int[][] minor=new int[2][2]; int r=0;
            for(int x=0;x<3;x++) if(x!=i){
                int c=0; for(int y=0;y<3;y++) if(y!=j) minor[r][c++]=m[x][y];
                r++;
            }
            inv[j][i]=Math.pow(-1,i+j)*det2x2(minor)/(double)d;
        }
        return inv;
    }
    static void print(int[][] m){ for(int[] row:m){ for(int x:row) System.out.print(x+" "); System.out.println(); } }
    static void print(double[][] m){ for(double[] row:m){ for(double x:row) System.out.printf("%.2f ",x); System.out.println(); } }
    public static void main(String[] args){
        int[][] m2=randomMatrix(2), m3=randomMatrix(3);
        System.out.println("2x2 Matrix:"); print(m2);
        System.out.println("Transpose:"); print(transpose(m2));
        System.out.println("Det: "+det2x2(m2)); System.out.println("Inverse:"); print(inv2x2(m2));
        System.out.println("\n3x3 Matrix:"); print(m3);
        System.out.println("Transpose:"); print(transpose(m3));
        System.out.println("Det: "+det3x3(m3)); System.out.println("Inverse:"); print(inv3x3(m3));
    }
}
