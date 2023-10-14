/**
 * Player.java
 * Oct 12, 2023 5:59:56 PM
 */
package domain;

import exceptions.PlayerException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class Player extends GameElement {

    /**
     * Name of the player
     */
    private String name;

    /**
     * Indicates whether it is currently this player's turn.
     */
    private boolean turn;

    /**
     * Constructs a Player with the specified name
     *
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
        this.tiles = new LinkedList<>();
    }

    /**
     * Retrieves the name associated with this game element.
     *
     * @return The name of the game element.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name for this game element.
     *
     * @param name The name to associate with the game element.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks whether it is currently the turn of this player.
     *
     * @return True if it's this player's turn; otherwise, false.
     */
    public boolean isTurn() {
        return turn;
    }

    /**
     * Sets the turn status for this player.
     *
     * @param turn True to indicate it's this player's turn, false otherwise.
     */
    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    /**
     * Adds a Tile object to the player's collection of tiles.
     *
     * @param tile The Tile object to be added to the player's collection.
     * @throws PlayerException if the player's tile collection is null.
     */
    public void addTile(Tile tile) throws PlayerException {
        if (this.tiles == null) {
            throw new PlayerException("Player's tile collection is null.");
        }
        this.tiles.add(tile);
    }

    /**
     * Adds a list of Tile objects to the player's collection of tiles.
     *
     * @param tiles The list of Tile objects to be added to the player's
     * collection.
     * @throws PlayerException if the player's tile collection is null.
     */
    public void addTiles(List<Tile> tiles) throws PlayerException {
        if (this.tiles == null) {
            throw new PlayerException("Player's tile collection is null.");
        }
        this.tiles.addAll(tiles);
    }

}
