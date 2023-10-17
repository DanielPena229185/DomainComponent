/*
* NewMain.java
* Oct 14, 2023 9:10:46 PM
 */
package domain;

import enums.Side;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player1 = new Player("Daniel");
        Player player2 = new Player("Juan");
        Player player3 = new Player("Peddro");
        Player player4 = new Player("Alejandro");

        Player players[] = {player1, player2, player3};
        Board board = new Board();
        Pool pool = new Pool();

        Match match = new Match(players, board, pool);

        FaceTile faceTile1 = new FaceTile(Side.TOP, 1);
        FaceTile faceTile2 = new FaceTile(Side.TOP, 2);
        FaceTile faceTile3 = new FaceTile(Side.TOP, 3);
        FaceTile faceTile4 = new FaceTile(Side.TOP, 4);
        FaceTile faceTile5 = new FaceTile(Side.TOP, 5);
        FaceTile faceTile6 = new FaceTile(Side.TOP, 6);
        FaceTile faceTile0 = new FaceTile(Side.TOP, 0);
    }

}
