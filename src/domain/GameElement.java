/**
 * GameElement.java
 * Oct 12, 2023 6:01:41 PM
 */
package domain;

import interfaces.Game;

/**
 * @author Daniel Armando Pe�a Garcia ID:229185
 * @author Santiago Boj�rquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class GameElement {

    protected Tile[] tiles;
    protected Game game;

    /**
     *
     *
     * @param game
     */
    public GameElement(Game game) {
        this.game = game;
    }
}
