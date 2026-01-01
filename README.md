# N-Queens
This is the strategic approach to solve N-Queens problem.

# N-Queens Problem 

##  Introduction
The **N-Queens problem** is a classic backtracking challenge in computer science.  
It asks: *How can we place N queens on an N×N chessboard so that no two queens attack each other?*  
This project provides a strategic approach to solving the problem using recursion and backtracking.

---

##  Strategic Approach
1. **Backtracking Algorithm**
   - Place queens row by row.
   - At each step, check if the position is safe (no queen in the same column, or diagonals).
   - If safe → place queen → move to next row.
   - If not safe → backtrack and try another column.

2. **Safety Checks**
   - **Column check**: Ensure no queen exists in the same column.
   - **Diagonal checks**: Ensure no queen exists on upper-left and upper-right diagonals.

3. **Recursive Exploration**
   - Continue until all rows are filled.
   - Each valid configuration is printed as a solution.

---

