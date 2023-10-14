/**
 * GameElement.java
 * Oct 12, 2023 6:01:41 PM
 */
package domain;

import interfaces.Game;
import java.util.List;

/**
 * @author Daniel Armando Pe�a Garcia ID:229185
 * @author Santiago Boj�rquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class GameElement {

    /**
     * Set of tiles as contained in the game elements
     */
    protected List<Tile> tiles;

    /**
     * Interface through which game calls are made
     */
    protected Game game;

    /**
     * Constructs a GameElement with a reference to the game it belongs to.
     *
     * @param game The game this element belongs to.
     */
    public GameElement(Game game) {
        this.game = game;
    }

    /**
     * Retrieves the list of tiles associated with this Game.
     *
     * @return The list of tiles in the game.
     */
    public List<Tile> getTiles() {
        return tiles;
    }

    /**
     * Sets the list of tiles for this Game.
     *
     * @param tiles The list of tiles to associate with the game.
     */
    public void setTiles(List<Tile> tiles) {
        this.tiles = tiles;
    }

    /**
     * Retrieves the Game instance associated with these tiles.
     *
     * @return The Game instance to which these tiles belong.
     */
    public Game getGame() {
        return game;
    }

    /**
     * Associates the provided Game instance with these tiles.
     *
     * @param game The Game instance to associate with these tiles.
     */
    public void setGame(Game game) {
        this.game = game;
    }
}
