package com.company;

//Imports
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Scanner;
import java.util.Random;

public class Main {

    //This is the grid array that will be used in the game to store all of the grids info.
    //0 = Not Taken, 1 = White Occupation, 2 = Black Occupation.
    private static int[][] Grid = new int[8][8];

    //This stores the last move made so that the programme can change the grid according to the move made.
    private static int[] LastMove = new int[2];

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

        //This code initialises the game section.
        if(BPlayer2IsAI == true){
            AIVSUserGame(SPlayer1Name, SPlayer2Name);
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

        //This prints out the grid with the numbers along the left vertical column.
        for(int i = 0; i < 8; i++){
            System.out.print(i + '\t');
            for(int j = 0; j < 8; j++){
                System.out.print(Grid[i][j]);
            }
            System.out.println("");
        }
    }

    private static void AIVSUserGame(String SPlayer1, String SPlayer2){

        Boolean BDifficultyChosen = false;
        int IBotDifficulty = 0;

        while(BDifficultyChosen == false) {
            //Asks the user what difficulty they would like to play on.
            String SAiDifficulty = ReadUser("Select AI difficulty(Easy, Medium or Impossible): ");
            //Sets the bots difficulty and catches any user mistakes.
            if (SAiDifficulty.toLowerCase() == "easy") {
                System.out.println("This is essentially a random number generator you are playing against so it will act very stupidly.");
                BDifficultyChosen = true;
                IBotDifficulty = 0;
            }else{
                //catches all inputs that are unaccounted for above.
                System.out.println("This mode is either non-existent or hasn't been fully implemented yet please make another choice.");
            }
        }

        //This is 0 should the player go first and 1 should the bot go first.
        Boolean BPlayerStarting;
        Boolean BStartChosen = false;

        //This code collects the users choice on who should go first.
        while(BStartChosen == false){
            String UserInput = ReadUser("Would you like to start(enter: p) or would you like the bot to start(enter: b): ");
            if(UserInput.toLowerCase() == "p"){
                BPlayerStarting = true;
            }else if(UserInput.toLowerCase() == "b"){
                BPlayerStarting = false;
                AIMove(IBotDifficulty);

            }else{
                System.out.println("This is not a valid option enter either S or P!");
            }
        }

        Boolean BGameCompleted = false;

        //Runs the game untill completion.
        while(BGameCompleted == false){
        }
    }

    public static void PostMoveModification(){
        //Works out the token of the last player.
        Integer LastPlayerToken = Grid[LastMove[0]][LastMove[1]];

        //Proceeds to find the nearest token in all directions.
        for(int i = 0; i <= 7; i++){
            Boolean BFoundEnd = false;
            int xadition = 0;
            int yadition = 0;
            if(i == 0 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }else if(i == 1 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }else if(i == 2 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }else if(i == 3 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }else if(i == 4 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }else if(i == 5 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }else if(i == 6 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }else if(i == 7 && LastMove[1] != 0){
                xadition = 0;
                yadition = 1;
            }

            while(BFoundEnd){

            }
        }
    }

    //This function checks the bots difficulty and moves accordingly.
    public static void AIMove(int IBotDifficulty){

        if(IBotDifficulty == 0){
            Boolean BBotMoveMade = false;
            while (BBotMoveMade == false) {
                //Generates random cords.
                Random RANDBotMove = new Random();
                int xcord = RANDBotMove.nextInt(7);
                Random RANDBotMove2 = new Random();
                int ycord = RANDBotMove2.nextInt(7);
                //finds out if the cords are taken and adds them to the grid.
                if(Grid[xcord][ycord] == 0){
                    Grid[xcord][ycord] = 2;
                    int [] xycords = {xcord, ycord};
                    LastMove = xycords;
                    BBotMoveMade = true;
                }
            }
        }
    }
}
