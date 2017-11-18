package validSudoku;

import java.util.*;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> hs = new HashSet<Character>();

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
		for (int k = 0; k < 9; k++) {
			for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
				for (int j = k % 3 * 3; j < k % 3 * 3 + 3; j++) {
					if (board[i][j] == '.')
						continue;
					if (hs.contains(board[i][j]))
						return false;

					hs.add(board[i][j]);

				}
			}
			hs.clear();
		}

		return true;
	}
}
