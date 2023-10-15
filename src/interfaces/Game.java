/**
 * Game.java
 * Oct 12, 2023 6:01:55 PM
 */
package interfaces;

import dtos.PlayerPickTileDTO;
import exceptions.GameException;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public interface Game {

    void pickTileOfPool(PlayerPickTileDTO playerDTO) throws GameException;
}
