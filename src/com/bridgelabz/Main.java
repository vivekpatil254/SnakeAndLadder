/*Program for snake and ladder */

package com.bridgelabz;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int dice, Player1Score = 0, Player2Score = 0, Counter1 = 0, Counter2 = 0, Choice, Flag = 0;

        Random rd = new Random();
        System.out.println("Player1 dice value       Player1 Score     Player2 dice value       Player2 Score");
        for (int i = 0; Player1Score != 100 && Player2Score != 100; i++) {
            if (Flag == 0) {
                dice = rd.nextInt(6);
                dice++;
                Choice = rd.nextInt(3);
                switch (Choice) {

                    case 0:
                        System.out.println("                 No Play");
                        Flag = 1;
                        continue;
                    case 1:
                        Counter1++;
                        Flag = 1;
                        if (dice == 6) {
                            Flag = 0;
                        }
                        if ((dice + Player1Score) > 100) {
                            System.out.println("Player 2 Score Above 100");
                            continue;
                        }

                        Player1Score = Player1Score + dice;
                        System.out.println("         " + dice + "                    " + Player1Score + "     ");
                        break;
                    case 2:
                        Counter1++;
                        Flag = 1;
                        Player1Score = Player1Score - dice;
                        if (Player1Score < 0) {
                            Player1Score = 0;
                        }
                        if (dice == 6) {
                            Flag = 0;
                        }
                        System.out.println("       ******Snake*******");
                        System.out.println("         " + dice + "                    " + Player1Score + "     ");
                }
            }


            if (Flag == 1) {
                dice = rd.nextInt(6);
                dice++;
                Choice = rd.nextInt(3);
                switch (Choice) {

                    case 0:
                        System.out.println("                                                      No Play");
                        Flag = 0;
                        continue;
                    case 1:
                        Counter2++;
                        Flag = 0;
                        if ((dice + Player2Score) > 100) {
                            System.out.println("                                                  Player 2 Score Above 100 ");
                            if (dice == 6)
                                Flag = 1;
                            continue;
                        }
                        Player2Score = Player2Score + dice;
                        System.out.println("                                                  " + dice + "                     " + Player2Score);
                        break;
                    case 2:
                        Flag = 0;
                        Counter2++;
                        Player2Score = Player2Score - dice;
                        if (Player2Score < 0) {
                            Player2Score = 0;
                        }
                        if (dice == 6) {
                            Flag = 1;
                        }
                        System.out.println("                                                  ******Snake*******");
                        System.out.println("                                                  " + dice + "                     " + Player2Score);
                }
            }


        }
        if (Player1Score == 100)
            System.out.println("Player 1 Won The match");
        if (Player2Score == 100)
            System.out.println("Player 2 Won The match");
        System.out.println("Number of times the dice played by Player 1: " + Counter1);
        System.out.println("Number of times the dice played by Player 2: " + Counter2);
    }

}
