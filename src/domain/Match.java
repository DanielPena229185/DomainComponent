/**
 * Match.java
 * Oct 12, 2023 5:59:39 PM
 */
package domain;

import interfaces.Game;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class Match implements Game{

    /**
     * An array of Player objects representing the participants in the match.
     */
    private Player[] players;

    /**
     * The game board where the match takes place.
     */
    private Board board;

    /**
     * The pool of game pieces or tiles used in the match.
     */
    private Pool pool;

    /**
     * Initializes a new Match with the specified players, board, and pool.
     *
     * @param players An array of Player objects representing the participants
     * in the match.
     * @param board The game board where the match takes place.
     * @param pool The pool of game pieces or tiles used in the match.
     */
    public Match(Player[] players, Board board, Pool pool) {
        this.players = players;
        this.board = board;
        this.pool = pool;
    }

}
