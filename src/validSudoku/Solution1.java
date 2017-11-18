package validSudoku;

import java.util.HashSet;

public class Solution1 {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> hs = new HashSet<Character>();
		/*
		 * row check
		 */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;
				if (hs.contains(board[i][j]))
					return false;
				hs.add(board[i][j]);
			}
			hs.clear();
		}
		/*
		 * colum check
		 */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[j][i] == '.')
					continue;
				if (hs.contains(board[j][i]))
					return false;
				hs.add(board[j][i]);
			}
			hs.clear();
		}
		/*
		 * 9 spaces check i/3表示 000 111 222。。。 i%3表示 012 012 012
		 */
		for (int i = 0; i < 9; i++) {
			for (int j = i / 3 * 3; j < i / 3 * 3 + 3; j++) {
				for (int j2 = i % 3 * 3; j2 < i % 3 * 3 + 3; j2++) {
					if (board[j][j2] == '.')
						continue;
					if(hs.contains(board[j][j2])) 
						return false;
					
					hs.add(board[j][j2]);

				}
			}
			hs.clear();
		}

		return true;
	}
}
