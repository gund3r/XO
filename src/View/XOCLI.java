package View;

import Model.Field;
import Model.Figure;
import Model.Game;
import Model.Player;

/**
 * Created by gun on 21/07/19.
 */
public class XOCLI {

    public static void main(final String[] args) {
        final String name1 = "Gleb";
        final String name2 = "Slava";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();

        consoleView.show(gameXO);
        while (consoleView.move(gameXO)) {
            consoleView.show(gameXO);
        }

    }
}
