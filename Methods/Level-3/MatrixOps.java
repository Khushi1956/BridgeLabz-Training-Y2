import java.util.*;

class MatrixOps {
    static int[][] randomMatrix(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=(int)(Math.random()*10);
        return m;
    }
    static int[][] add(int[][] a,int[][] b){
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    static int[][] sub(int[][] a,int[][] b){
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    static int[][] mul(int[][] a,int[][] b){
        int r=a.length,c=b[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) for(int k=0;k<b.length;k++)
            res[i][j]+=a[i][k]*b[k][j];
        return res;
    }
    static void print(int[][] m){
        for(int[] row:m){ for(int x:row) System.out.print(x+" "); System.out.println(); }
    }
    public static void main(String[] args){
        int[][] a=randomMatrix(2,2), b=randomMatrix(2,2);
        System.out.println("Matrix A:"); print(a);
        System.out.println("Matrix B:"); print(b);
        System.out.println("A+B:"); print(add(a,b));
        System.out.println("A-B:"); print(sub(a,b));
        System.out.println("A*B:"); print(mul(a,b));
    }
}
