/*This program uses ANSI escape codes for colors. For eclipse please install ANSI Escape in Console from eclipse market place.*/

package com.maverick.main;

import java.util.Scanner;

class Guesser {
	int guessNum;

	public int guessNumber() {
		boolean rangeFlag = false;
		System.out.println("Guesser guess the Number (between 1 and 10): ");
		Scanner scn = new Scanner(System.in);
		while (rangeFlag == false) {
			guessNum = scn.nextInt();
			if (guessNum <= 0 || guessNum > 10)
				System.out.println("Range should be between 1 and 10. Please try again!");
			else
				rangeFlag = true;
		}
		return guessNum;
	}
}

class Player {
	int playerGuessNum;

	public int pGuessNumber(int pNum) {
		boolean rangeFlag = false;
		System.out.println("Player " + pNum + " guess the Number (between 1 and 10): ");
		Scanner scn = new Scanner(System.in);
		while (rangeFlag == false) {
			playerGuessNum = scn.nextInt();
			if (playerGuessNum <= 0 || playerGuessNum > 10)
				System.out.println("Range should be between 1 and 10. Please try again!");
			else
				rangeFlag = true;
		}
		return playerGuessNum;
	}

}

class Umpire {
	int numFromGuesser;
	int[] numFromPlayer = new int[50];
	Player[] playerArray = new Player[50];
	int numOfPlayer;

	public void getGuesserNum() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}

	public void getPlayerNum() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number of Players (between 2 and 50): ");
		while (numOfPlayer > 50 || numOfPlayer <= 1) {
			numOfPlayer = scn.nextInt();
			if (numOfPlayer > 50 || numOfPlayer <= 1)
				System.out.println("Range should be between 2 and 50. Please try again!");
		}
		for (int i = 0; i < playerArray.length; i++) { // instantiate each element
			playerArray[i] = new Player();
		}
		for (int j = 0; j < numOfPlayer; j++) {
			numFromPlayer[j] = playerArray[j].pGuessNumber(j + 1);
		}

	}

	public void compareNums() {
		int winCount = 0;
		for (int i = 0; i < numOfPlayer; i++) {
			if (numFromPlayer[i] == numFromGuesser) {
				System.out.println("\033[32mPlayer " + (i + 1) + " won.\033[0m");
				winCount++;
			}
		}
		if (winCount == numOfPlayer) {
			System.out.println("Seems like all the players won.");
			System.out.println("\033[33mGame Tied.\033[0m");
		}
		if (winCount == 0) {
			System.out.println("\033[31mGame Lost.\033[0m");
		}
	}

}

public class TheGuessGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.getGuesserNum();
		u.getPlayerNum();
		u.compareNums();

	}

}
