/**
 * @brief Gobang console.
 *   Ubuntu HMI(view)is not ok, "╋".
 * @author jfq
 * @date 20190314
 */

import java.io.*;

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
				board[i][j] = "╋";
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

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;

		while ((inputStr = br.readLine()) != null)
		{
			String[] posStrArr = inputStr.split(",");
			int x = Integer.parseInt(posStrArr[0]);
			int y = Integer.parseInt(posStrArr[1]);

			gb.board[x - 1][y - 1] = "●";
			gb.printBoard();

			System.out.println("Please input x,y:");
		}
	}
}

