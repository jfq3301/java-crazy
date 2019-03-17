/**
 * @brief Gobang console
 * @date 20190314
 */


public class Gobang
{
	private static int BOARD_SIZE = 15;
	private String[][] board;

	public void initBoard()
	{
		board = new String[BOARD_SIZE][BOARD_SIZE];

		for (int i = 0; i < BOARD_SIZE; i++)
		{
			for (int j = 0; j < BOARD_SIZE; j++)
			{
				board[i][j] = "+";
				// System.out.println()
			}
		}
	}

	public void printBoard()
	{
		// board = new String[BOARD_SIZE][BOARD_SIZE];

		for (int i = 0; i < BOARD_SIZE; i++)
		{
			for (int j = 0; j < BOARD_SIZE; j++)
			{
				// board[i][j] = '+';
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) throws Exception
	{
		Gobang gb = new Gobang();
		gb.initBoard();
		gb.printBoard();
	}


}

