/*
* NewMain.java
* Oct 14, 2023 9:10:46 PM
 */
package domain;

import enums.Side;
import java.util.List;

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
//        Player player1 = new Player("Daniel");
//        Player player2 = new Player("Juan");
//        Player player3 = new Player("Peddro");
//        Player player4 = new Player("Alejandro");
//
//        Player players[] = {player1, player2, player3};
//        Board board = Board.getInstance();
//        Pool pool = Pool.getInstance();
//
//        Match match = new Match(players, board, pool, 7);
//
//        FaceTile faceTile1 = new FaceTile(Side.TOP, 1);
//        FaceTile faceTile2 = new FaceTile(Side.TOP, 2);
//        FaceTile faceTile3 = new FaceTile(Side.TOP, 3);
//        FaceTile faceTile4 = new FaceTile(Side.TOP, 4);
//        FaceTile faceTile5 = new FaceTile(Side.TOP, 5);
//        FaceTile faceTile6 = new FaceTile(Side.TOP, 6);
//        FaceTile faceTile0 = new FaceTile(Side.TOP, 0);

        // Crea una instancia de tu generador de fichas de dominó
        Pool tileGenerator = new Pool();

        // Obtiene las 28 fichas de dominó
        List<Tile> dominoTiles = tileGenerator.createDominoTiles();

        // Imprime las fichas de dominó
        for (Tile tile : dominoTiles) {
            System.out.println("Ficha ID: " + tile.getId());
            System.out.println("Primera Cara: Valor = " + tile.getFirstFace().getValue()
                    + ", Lado = " + tile.getFirstFace().getSide()
                    + ", Orientación = " + tile.getOrientation());
            System.out.println("Segunda Cara: Valor = " + tile.getSecondFace().getValue()
                    + ", Lado = " + tile.getSecondFace().getSide());
            System.out.println("---------------------------------------");
        }
    }

}
