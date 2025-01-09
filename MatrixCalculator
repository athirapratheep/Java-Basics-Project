import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Add matrices");
            System.out.println("2. Subtract matrices");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Transpose of a matrix");
            System.out.println("5. Symmetry of a matrix check");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                        addMatrix(sc);
                        break;
                case 2:
                        subtractMatrix(sc);
                        break;
                case 3:
                       multiplyMatrix(sc);
                        break;
                case 4:
                        transposeMatrix(sc);
                        break;
                case 5:
                        symmetryMatrix(sc);
                        break;
                case 6:
                        System.out.println("Exiting from the program...");
                        return;
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
   public static int[][] readMatrix(Scanner sc,String matrixName)
   {
    System.out.println("Enter the number of rows for the "+matrixName+" matrix:");
    int rows=sc.nextInt();
    System.out.println("Enter the number of columns for the "+matrixName+" matrix:");
    int cols=sc.nextInt();
    int[][] matrix=new int[rows][cols];
    System.out.println("Enter the elements of the "+matrixName+" matrix:");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            matrix[i][j]=sc.nextInt();
        }
    }
    return matrix;
   }
   private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
   public static void addMatrix(Scanner sc)
   {
        int[][] matrixA=readMatrix(sc, "Matrix A");
        int[][] matrixB=readMatrix(sc, "Matrix B");
        if(matrixA.length!=matrixB.length||matrixA[0].length!=matrixB[0].length)
        {
            System.out.println();
            System.out.println("Matrix addition not possible.");
            System.out.println();
            return;
        }
        int[][] result=new int[matrixA.length][matrixA[0].length];
        for(int i=0;i<matrixA.length;i++)
        {
            for(int j=0;j<matrixA[0].length;j++)
            {
                result[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        System.out.println();
        printMatrix(result);
        System.out.println();
   }
   public static void subtractMatrix(Scanner sc)
   {
        int[][] matrixA=readMatrix(sc, "Matrix A");
        int[][] matrixB=readMatrix(sc, "Matrix B");
        if(matrixA.length!=matrixB.length||matrixA[0].length!=matrixB[0].length)
            {
                System.out.println();
                System.out.println("Matrix subtraction not possible.");
                System.out.println();
                return;
            }
        int[][]result=new int[matrixA.length][matrixA[0].length];
        for(int i=0;i<matrixA.length;i++)
        {
            for(int j=0;j<matrixA[0].length;j++)
            {
                result[i][j]=matrixA[i][j]-matrixB[i][j];
            }
        }
        System.out.println();
        printMatrix(result);
        System.out.println();
   }
   public static void multiplyMatrix(Scanner sc)
   {
        int[][] matrixA=readMatrix(sc, "Matrix A");
        int[][] matrixB=readMatrix(sc, "Matrix B");
        if(matrixA[0].length!=matrixB.length)
        {
            System.out.println();
            System.out.println("Matrix multiplication not possible...");
            System.out.println();
            return;
        }
        int[][]result=new int[matrixA.length][matrixB[0].length];
        for(int i=0;i<matrixA.length;i++)
        {
            for(int j=0;j<matrixB[0].length;j++)
            {
                for(int k=0;k<matrixA[0].length;k++)
                {
                    result[i][j]+=matrixA[i][k]*matrixB[k][j];
                }
            }
        }
        System.out.println();
        printMatrix(result);
        System.out.println();
   }
   public static void transposeMatrix(Scanner sc)
   {
    int[][] matrixA=readMatrix(sc, "Matrix A");
    int[][]result=new int[matrixA[0].length][matrixA.length];
    for(int i=0;i<matrixA.length;i++)
    {
        for(int j=0;j<matrixA[0].length;j++)
        {
            result[j][i]=matrixA[i][j];
        }
    }
    System.out.println();
    printMatrix(result);
    System.out.println();
   }
   public static void symmetryMatrix(Scanner sc)
   {
        int[][] matrixA=readMatrix(sc, "Matrix A");
        if(matrixA.length!=matrixA[0].length)
        {
            System.out.println();
            System.out.println("It should be a square matrix...");
            System.out.println();
            return;
        }
        for(int i=0;i<matrixA.length;i++)
        {
            for(int j=0;j<matrixA[0].length;j++)
            {
                if(matrixA[i][j]!=matrixA[j][i])
                {
                    System.out.println("It is not a symmetric matrix...");
                    System.out.println();
                    return;
                }
            }
        }
            System.out.println("Matrix is symmetric...");
            System.out.println();
   }
}
