Sudoku Tool

A Java-based tool that includes both a Sudoku Validator and a Sudoku Solver. This program can:

    Validate whether a given 9x9 Sudoku grid is valid.
    Solve an incomplete Sudoku grid using backtracking.


Features

    Sudoku Validator
        Checks if the current Sudoku grid follows all the rules:
            Each row contains digits 1-9 without repetition.
            Each column contains digits 1-9 without repetition.
            Each 3x3 subgrid contains digits 1-9 without repetition.

    Sudoku Solver
        Automatically fills the empty cells (represented by 0) in the grid.
        Uses the backtracking algorithm to find a valid solution.

    Display Sudoku Board
        Prints the Sudoku board in a clean 9x9 grid format.

Output Format example:

Enter the Sudoku board (row by row, 9 numbers per row, use 0 for empty cells):
Enter row1(seperate numbers with spaces)
0 2 0 0 0 9 6 0 0

Enter row2(seperate numbers with spaces)
5 8 0 0 6 2 0 0 0

Enter row3(seperate numbers with spaces)
7 0 6 0 3 0 0 1 9

Enter row4(seperate numbers with spaces)
4 7 2 0 0 0 5 6 0

Enter row5(seperate numbers with spaces)
9 5 0 6 0 0 3 4 2

Enter row6(seperate numbers with spaces)
0 3 8 0 0 4 1 0 7

Enter row7(seperate numbers with spaces)
8 1 7 0 0 5 0 0 6

Enter row8(seperate numbers with spaces)
3 0 0 7 0 0 0 0 1

Enter row9(seperate numbers with spaces)
0 0 0 0 9 0 0 7 0 


Initial Board:
0 2 0 0 0 9 6 0 0 
5 8 0 0 6 2 0 0 0 
7 0 6 0 3 0 0 1 9 
4 7 2 0 0 0 5 6 0 
9 5 0 6 0 0 3 4 2 
0 3 8 0 0 4 1 0 7 
8 1 7 0 0 5 0 0 6 
3 0 0 7 0 0 0 0 1 
0 0 0 0 9 0 0 7 0 

Valid Board

Solved Board:
1 2 3 4 7 9 6 8 5 
5 8 9 1 6 2 7 3 4 
7 4 6 5 3 8 2 1 9 
4 7 2 9 1 3 5 6 8 
9 5 1 6 8 7 3 4 2 
6 3 8 2 5 4 1 9 7 
8 1 7 3 4 5 9 2 6 
3 9 4 7 2 6 8 5 1 
2 6 5 8 9 1 4 7 3 
