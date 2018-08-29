import java.util.Scanner;
import java.util.Random;


public class Game {

    public static void main(String[] args){
        User user = new User();
        GameEngine game = new GameEngine();
        System.out.println("What is your name?");
        user.SetUser();
        game.GamePlay();
           // game works by adding user name, user gives input and computer gives input then program determines if draw or win.
    }
}
