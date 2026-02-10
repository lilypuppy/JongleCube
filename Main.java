import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.loadLetters();
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to jongle cube!");
        System.out.println("This is a mock up of the larger project 'Joggle Cube' for CS22120");
        main.userChoice();
    }

    public void userChoice() throws IOException {
        String choice = "";
        System.out.println("New game.");
        System.out.println("Load game.");
        System.out.println("Enter choice (enter new/load): ");
        Scanner input = new Scanner(System.in);
        choice = input.nextLine();
        switch (choice.toLowerCase()) {
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

    public void newGame() throws IOException {
        String[][] square1;
        String[][] square2;
        String[][] square3;

        square1 = new String[3][3];
        square2 = new String[3][3];
        square3 = new String[3][3];

        ArrayList lp = letterPool();
        randomLetter(square1,square2,square3);

    }

    public void loadGame() {
        System.out.println("Enter game to load from: ");
    }

    public void loadLetters() {
        String lettersFile = "letters.txt";
        try (Scanner scanner = new Scanner(lettersFile);) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error in opening file.");
        }
    }
    public ArrayList letterPool() throws IOException {
        String fn = "letters.txt";
        ArrayList allLetters = new ArrayList();
        try (Scanner letterRead = new Scanner(fn)){
            while (letterRead.hasNextLine()){
                String line = letterRead.nextLine();
                String[] thisLine = line.split(",");
                String letter = thisLine[0];
                int num = Integer.parseInt(thisLine[1]);
                for (int i = 1; i <= num; i++){
                    allLetters.add(letter);
                }
            }
            System.out.println(allLetters);
        }
        return allLetters;
    }
    public String randomLetter(String[][] s1, String[][] s2, String[][] s3) {
        String letter = "";
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "qu", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < 27; i++) {
            Random n = new Random();
            int num = n.nextInt(1, 27);
            String l = alphabet[num];
        }
        return letter;
    }
}


