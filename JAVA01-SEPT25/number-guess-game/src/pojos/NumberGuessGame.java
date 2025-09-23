package pojos;

public class NumberGuessGame {

    // public int magicNumber;
    public int numGuess;
  //  public boolean over;

    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int MAX_GUESSES = 7;

    public int magicNumber = (int) (Math.random() * MAX) + MIN;
    public int getNumGuess;
    public boolean over;

    public String guess(int number){
        numGuess++;
        String message = null;
        if (number == magicNumber){
            over = true;
            message = "Winner!";}
            else if (number > magicNumber) {message = "Too high";}
                else {message = "Too Low";}
                if (numGuess == MAX_GUESSES && !over) {
                    over = true;
                    message += "\nToo many goes";
                }
                    return message;
        }
    }

