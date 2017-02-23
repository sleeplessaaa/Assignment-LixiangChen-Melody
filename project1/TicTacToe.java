package project1;

public class TicTacToe {
	
	int grid;
	char[][] board;
	char currentPlayerMark;
	 
	
	public TicTacToe(int n){
		grid = n;
		board = new char[n][n];
		currentPlayerMark = 'x';
		initializeBoard();
	}
	
	//set/Reset the board back to all empty values.
	public void initializeBoard(){
		for(int i = 0; i<grid; i++){
			for(int j = 0; j<grid; j++){
				board[i][j] = '-';
			}
		}
	}

	
	//Print the current board 
	public void printBoard(){
		System.out.println("-----------");
		
		for(int i = 0; i<grid; i++){
			System.out.print("|");
			for(int j = 0; j<grid; j++){
				System.out.print(board[i][j] + "|");
			}
			System.out.println( );
			System.out.println("------------");
		}
	}
	
	
	//Check if the board is full.
	public boolean isBoardFull(){
		boolean isFull = true;
		
		for(int i = 0; i<grid; i++){
			for(int j = 0; j<grid; j++){
				if(board[i][j] == '-'){
					isFull = false;
				}
			}
		}
		return isFull;
	}
	
	//Return true if there is a win, otherwise false.
	public boolean checkForWin(int row, int col, int len){
		boolean hori = true, verti = true, diag1 = true, diag2 = true;
		//check horizontal
		for(int i = 0; i<grid-1; i++){
			if(board[row][i] != board[row][i+1]){
				hori = false;
			}
		}
		
		//check vertical
		for(int j = 0; j<grid-1; j++){
			if(board[j][col] != board[j+1][col]){
				verti = false;
			}
		}
		
		
		//check diagnoals.
		if(row == col){
			for(int i = 0; i<grid-1; i++){
				if(board[i][i] != board[i+1][i+1]){
					diag1 = false;
				}
			}
		}else{
			diag1 = true;
		}
		
		if(row + col == grid -1){
			for(int i = 0; i<grid-1; i++){
				if(board[i][grid-1-i] != board[i+1][grid-2-i] || board[i][grid-1-i]=='-'){
					diag2 = false;
				}
			}
		}else{
			diag2 = true;
		}
		if( hori|| verti|| diag1||diag2){
			System.out.println("Game over");
			return true;
		}else{
			return false;
		}
	}
	
	
	 // Change player marks back and forth.
	    public void changePlayer() {
	        if (currentPlayerMark == 'x') {
	            currentPlayerMark = 'o';
	        }
	        else {
	            currentPlayerMark = 'x';
	        }
	    }
	    

	   //Place the mark of the current player.
	   public boolean placeMark(int row, int col){
		   
		   if((row >= 0)&&(row <= grid)){
			   if((col >= 0)&&(col <= grid)){
				   if(board[row][col] == '-'){
					   board[row][col] = currentPlayerMark;
					   return true;
				   }
			   }
		   }
		   
		   return false;
	   }
	    
	    public char[][] getBoard(){
	    	return board;
	    }

}