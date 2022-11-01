package game;

import java.security.PublicKey;
import java.util.Scanner;

public abstract class IO {
    private final Scanner userInput;

    /**
     * Constructor (google this) to create a an obejct
     */
    protected IO(){
        //This object is used to scan user input from command line
        userInput = new Scanner(System.in);
    }

    /**
     * Function to create command line propts for what the user should do
     * @param message A line to tell the user what input is being looked for
     * @return The value that the user inputs
     */
    protected String prompt(String message){
        System.out.printf("%s >> ", message);
        return userInput.nextLine();
    }

    /**
     * Function that calls {@link #prompt(String)} then converts the return to an {@link Integer}
     * @param msg A line to tell the user what input is being looked for
     * @return The value that the user inputs as an {@link Integer}
     * @throws NumberFormatException When user provides invalid response will be dealt with when called
     */
    protected int intPrompt(String msg) throws NumberFormatException{
        return Integer.parseInt(prompt(msg));
    }
}
