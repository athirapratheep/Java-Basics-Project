import java.util.HashSet;
import java.util.Scanner;

public class SudokuTool {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sudoku board (row by row, 9 numbers per row, use 0 for empty cells):");
        int[][] board = new int[9][9];
        for(int i=0;i<9;i++)
        {
            System.out.println("Enter row"+(i+1)+"(seperate numbers with spaces)");
            for(int j=0;j<9;j++)
            {
                board[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\nInitial Board:");
        printboard(board);
        if(validateBoard(board)){
            System.out.println("\nValid Board");
            if(solveSudoku(board)){
                System.out.println("\nSolved Board:");
                printboard(board);
            }
            else{
                System.out.println("\nNo solution exists");
            }
        }
        else{
            System.out.println("\nInvalid Board");
        }
        sc.close();
    }
    public static void printboard(int[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean validateBoard(int[][] board)
    {
        for(int i=0;i<9;i++)
        {
            if(!isValidRow(board,i)||!isValidCol(board,i)||!isValidSubgrid(board,i))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidRow(int[][] board,int row)
    {
        HashSet<Integer> seenNum=new HashSet<>();
        for(int num:board[row])
        {
            if(num<0 || num>9)
            {
                return false;
            }
            if(num!=0 && !seenNum.add(num))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidCol(int[][] board, int col)
    {
        HashSet<Integer> seenNum=new HashSet<>();
        for(int num:board[col])
        {
            if(num<0 || num>9)
            {
                return false;
            }
            if(num!=0 && !seenNum.add(num))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidSubgrid(int[][] board, int index)
    {
        HashSet<Integer> seenNum=new HashSet<>();
        int startRow = (index/3)*3;
        int startCol = (index%3)*3;
        for(int i=startRow;i<startRow+3;i++)
        {
            for(int j=startCol;j<startCol+3;j++)
            {
                int num=board[i][j];
                if(num<0 || num>9)
                {
                    return false;
                }
                if(num!=0 && !seenNum.add(num))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solveSudoku(int[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]==0)
                {
                    for(int num=1;num<=9;num++)
                    {
                        if(isSafe(board,i,j,num))
                        {
                            board[i][j]=num;
                            if(solveSudoku(board))
                            {
                                return true;
                            }
                            board[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSafe(int[][] board, int row, int col, int num)
    {
        for(int i=0;i<9;i++){
            if(board[row][i]==num||board[i][col]==num)
            {
                return false;
            }
        }
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int i=startRow;i<startRow+3;i++)
        {
            for(int j=startCol;j<startCol+3;j++)
            {
                if(board[i][j]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

