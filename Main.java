import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public Main(){
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.loadLetters();
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to jongle cube!");
        System.out.println("This is a mock up of the larger project 'Joggle Cube' for CS22120");
        main.userChoice();
    }
    public void userChoice(){
        String choice = "";
        System.out.println("New game.");
        System.out.println("Load game.");
        System.out.println("Enter choice (enter new/load): ");
        Scanner input = new Scanner(System.in);
        choice = input.nextLine();
        switch(choice.toLowerCase()){
            case "new":
                System.out.println("New game loading...");
                newGame();
                break;

            case "load":
                System.out.println("Load old game...");
                loadGame();
                break;
            default:
                break;
        }
    }
    public void newGame(){
        String[][] square1;
        String[][] square2;
        String[][] square3;

        square1 = new String[5][5];
        square2 = new String[5][5];
        square3 = new String[5][5];

        for (int x=1;x < 6; x++){
            for (int y = 1; y < 6; y++)
                if (x % 2 == 0){
                    square1[x][y] = "|";
                    square2[x][y] = "|";
                    square3[x][y] = "|";
                }
        }
        System.out.println(square1);
        System.out.println();
        System.out.println(square2);
        System.out.println();
        System.out.println(square3);
    }
    public void loadGame(){

    }
    public void loadLetters(){
        String letters = "letters.txt";
        try(Scanner scanner = new Scanner(letters);){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println("Error in opening file.");
        }
    }
}