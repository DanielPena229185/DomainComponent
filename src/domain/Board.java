/**
 * Board.java
 * Oct 12, 2023 5:59:50 PM
 */
package domain;

import interfaces.Game;
import java.util.LinkedList;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class Board extends GameElement {

    public Board(Game game) {
        super(game);
        this.tiles = new LinkedList();
    }

    public void addTileBeginning(Tile tile) {
        if (this.tiles.isEmpty()) {
            this.tiles.add(tile);
            return;
        }
        Tile firstTile = tiles.getFirst();
        if (firstTile.isMule()) {
            if (tile.getOrientation() != firstTile.getOrientation()) {
                FaceTile rightFace = tile.getRightFace();
                FaceTile firstTileLeftFace = firstTile.getFirstFace();
                if (rightFace.getValue() == firstTileLeftFace.getValue()) {
                    tiles.addFirst(tile);
                }

            }
        } else {
            if (tile.getOrientation() == firstTile.getOrientation()) {
                FaceTile rightFace = tile.getRightFace();
                FaceTile firstTileLeftFace = firstTile.getLeftFace();
                if (rightFace.getValue() == firstTileLeftFace.getValue()) {
                    tiles.addFirst(tile);
                }
            }
        }

    }

    public void addTileEnd(Tile tile) {
        if (this.tiles.isEmpty()) {
            this.tiles.add(tile);
            return;
        }
        Tile lastTile = tiles.getLast();
        if (lastTile.isMule()) {
            if (tile.getOrientation() != lastTile.getOrientation()) {
                FaceTile leftFace = tile.getLeftFace();
                FaceTile firstTileLeftFace = lastTile.getFirstFace();
                if (leftFace.getValue() == firstTileLeftFace.getValue()) {
                    tiles.addLast(tile);
                }

            }
        } else {
            if (tile.getOrientation() == lastTile.getOrientation()) {
                FaceTile leftFace = tile.getLeftFace();
                FaceTile firstTileLeftFace = lastTile.getRightFace();
                if (leftFace.getValue() == firstTileLeftFace.getValue()) {
                    tiles.addLast(tile);
                }
            }
        }
    }
}

/**
 *
 */
