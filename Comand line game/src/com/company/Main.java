package com.company;
import java.util.Scanner;

public class Main {

    //This is the grid array that will be used in the game to store all of the grids info.
    //0 = Not Taken, 1 = White Occupation, 2 = Black Occupation.
    private static int[][] Grid = new int[8][8];

    public static void main(String[] args) {
        //This section of the code reads the user's choice as to the name of player 1
        String SPlayer1Name = ReadUser("Name of Player 1: ");

        //This is where the method that will run the secret bot training program will hide.
        if(SPlayer1Name == "Botsfordayz"){

        }

        //This section of the code reads the user's choice as to the name of player 2
        String SPlayer2Name = ReadUser("Name of Player 2 (Make the prefix to the name 'AI:' should you want an AI to play against): ");

        //This then checks if the user made the player 2 an AI.
        Boolean BPlayer2IsAI = false;
        if(SPlayer2Name.charAt(0) == 'A' && SPlayer2Name.charAt(1) == 'I' && SPlayer2Name.charAt(2) == ':'){
            BPlayer2IsAI = true;
            SPlayer2Name = SPlayer2Name.replace("AI:", "");
        }

        //This section initilises the game section.
        if(BPlayer2IsAI == true){

        }

    }
    private static String ReadUser(String Message){
        //This is the function that reads all of the user's inputs.
        System.out.print(Message);
        Scanner UserInput = new Scanner(System.in);
        String UserChoice = UserInput.nextLine();
        return UserChoice;
    }
    //This function is responsible for printing the grid during a game.
    public static void PrintTable(String SPlayer1, String SPlayer2){
        //Prints out the player's names.
        System.out.println("Player 1: " + SPlayer1);
        System.out.println("Player 2: " + SPlayer2);

        //This prints a + followed by the numbers 0 to 7 at the top row of the grid.
        System.out.print("+" + '\t');
        for(int i = 0; i < 8; i++){
            System.out.print(i + '\t');
        }
        System.out.println("");

        //This prins out the grid with the numbers along the left vertical column.
        for(int i = 0; i < 8; i++){
            System.out.print(i + '\t');
            for(int j = 0; j < 8; j++){
                System.out.print(Grid[i][j]);
            }
            System.out.println("");
        }
    }
    private static void AIVSUserGame(String SPlayer1, String SPlayer2){
        String SAiDifficulty = ReadUser("Select AI difficulty(Easy, Medium or Impossible): ");

    }
}
