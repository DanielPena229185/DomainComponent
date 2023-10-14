/**
 * Player.java
 * Oct 12, 2023 5:59:56 PM
 */
package domain;

import interfaces.Game;

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
     * Constructs a Player with the specified name
     *
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
    }

    public void addTiles() {

    }
}
