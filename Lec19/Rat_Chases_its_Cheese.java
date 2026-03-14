package Lec19;

import java.util.Scanner;

public class Rat_Chases_its_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {// row
			String s = sc.next();
			for (int j = 0; j < maze[0].length; j++) {// col
				maze[i][j] = s.charAt(j);

			}

		}
		int[][] ans = new int[n][m];
		print(maze, 0, 0, ans);
		if (ans[ans.length - 1][ans[0].length - 1] == 0) {
			System.out.println("NO PATH FOUND");
		}

	}

	public static void print(char[][] maze, int cr, int cc, int[][] ans) {
		// TODO Auto-generated method stub
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ans[cr][cc] = 1;
			Display(ans);
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		for (int i = 0; i < c.length; i++) {
			print(maze, cr + r[i], cc + c[i], ans);
		}
//		print(maze, cr - 1, cc, ans);// up
//		print(maze, cr, cc - 1, ans);// left
//		print(maze, cr + 1, cc, ans);// down
//		print(maze, cr, cc + 1, ans);// right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
