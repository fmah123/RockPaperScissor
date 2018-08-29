import java.util.ArrayList;
import java.util.List;

public class GameEngine {

    User user = new User();
    private String R = "Rock";
    private String P = "Paper";
    private String S = "Scissor";
    private String L = "Lizard";
    private String Sp = "Spock";
    private Boolean Draw = true;

    public void GamePlay() {
        //The GamePlay() method is the conditonals for a win or draw situation.

        while ( Draw == true) {
            //attempted to do print line debugging but ran out of time.

            String UserObject = user.getUser("What are you going to choose Player1? Rock, Paper, Scissor, Lizard or Spock?");
            String UserObject1 = user.getUser1("What are you going to choose Player2? Rock, Paper, Scissor, Lizard or Spock?");
            String GameComp1 = user.GameComp();
            String GameComp2 = user.GameComp1();

            if (UserObject.equals(UserObject1) && UserObject.equals(GameComp2) && GameComp1.equals(UserObject1) && GameComp1.equals(GameComp2)) {
                 System.out.println("There's a draw");
                Draw = true;
            }else if (UserObject.equals(P) && GameComp1.equals(P)) {
                System.out.println("There's a draw");
                Draw = true;
            }else if (UserObject.equals(S) && GameComp1.equals(S)) {
                System.out.println("There's a draw");
                Draw = true;
            }else if (UserObject.equals(R) && GameComp1.equals(S) ) {
                System.out.println("Player Wins!!");
                Draw = false;
            }else if (UserObject.equals(S) && GameComp1.equals(R)) {
                System.out.println("Computer Wins!!");
                Draw = false;
            }else if (UserObject.equals(S) && GameComp1.equals(P)) {
                System.out.println("Player Wins!!");
                Draw = false;
            }else if (UserObject.equals(P) && GameComp1.equals(S)) {
                System.out.println("Computer Wins!!");
                Draw = false;
            }else if (UserObject.equals(P) && GameComp1.equals(R)) {
                System.out.println("Player Wins!!");
                Draw = false;
            }else if (UserObject.equals(R)&& GameComp1.equals(P)) {
                System.out.println("Computer Wins!!");
                Draw = false;
            } else {
                Draw = true;
            }


        }

    }
}