/**
 * Board.java
 * Oct 12, 2023 5:59:50 PM
 */
package domain;

import exceptions.BoardException;
import java.util.LinkedList;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class Board extends GameElement {

    public Board() {
        this.tiles = new LinkedList();
    }

    /**
     * Adds a tile to the beginning of the list of tiles, taking into account
     * the type of the first tile and its compatibility with the new tile.
     *
     * @param newTile The tile to be added to the beginning.
     */
    public void addTileBeginning(Tile newTile) throws BoardException {

        if (newTile == null) {
            throw new BoardException("Cannot add a null tile to the board.");
        }

        if (this.tiles.isEmpty() && !newTile.isMule()) {
            throw new BoardException("Cannot add a non-mule tile.");
        }

        if (this.tiles.isEmpty() && newTile.isMule()) {
            this.tiles.add(newTile);
            return;
        }

        Tile firstTile = tiles.getFirst();

        if (firstTile.isMule()) {
            addTileBeginningForMule(newTile, firstTile);
        } else {
            addTileBeginningForNonMule(newTile, firstTile);
        }
    }

    /**
     * Adds a tile to the beginning of the list when the first tile is a mule.
     *
     * @param newTile The tile to be added to the beginning.
     * @param firstTile The first tile in the list.
     */
    private void addTileBeginningForMule(Tile newTile, Tile firstTile) throws BoardException {

        if (newTile.getOrientation() != firstTile.getOrientation()) {
            FaceTile newTileRightFace = newTile.getRightFace();
            FaceTile firstTileFace = firstTile.getFirstFace();

            if (newTileRightFace.getValue() == firstTileFace.getValue()) {
                tiles.addFirst(newTile);
            } else {
                throw new BoardException("The right face must be equal to the mule's values.");
            }
        } else {
            throw new BoardException("The orientation must be perpendicular to the mule.");
        }
    }

    /**
     * Adds a tile to the beginning of the list when the first tile is not a
     * mule.
     *
     * @param newTile The tile to be added to the beginning.
     * @param firstTile The first tile in the list.
     */
    private void addTileBeginningForNonMule(Tile newTile, Tile firstTile) throws BoardException {

        if (newTile.getOrientation() == firstTile.getOrientation()) {
            FaceTile newTileRightFace = newTile.getRightFace();
            FaceTile firstTileLeftFace = firstTile.getLeftFace();

            if (newTileRightFace.getValue() == firstTileLeftFace.getValue()) {
                tiles.addFirst(newTile);
            } else {
                throw new BoardException("The right face must be equal to the tile's left face value.");
            }
        } else {
            throw new BoardException("The orientation must be equal to the tile.");
        }
    }

    /**
     * Adds a tile to the end of the list of tiles, taking into account the type
     * of the last tile and its compatibility with the new tile.newTile@param
     * tile The tile to be added to the end.
     */
    public void addTileEnd(Tile newTile) throws BoardException {

        if (newTile == null) {
            throw new BoardException("Cannot add a null tile to the board.");
        }

        if (this.tiles.isEmpty() && !newTile.isMule()) {
            throw new BoardException("Cannot add a non-mule tile.");
        }

        if (this.tiles.isEmpty() && newTile.isMule()) {
            this.tiles.add(newTile);
            return;
        }

        Tile lastTile = tiles.getLast();

        if (lastTile.isMule()) {
            addTileEndForMule(newTile, lastTile);
        } else {
            addTileEndForNonMule(newTile, lastTile);
        }
    }

    /**
     * Adds a tile to the end of the list when the last tile is a mule.
     *
     * @param newTile The tile to be added to the end.
     * @param lastTile The last tile in the list.
     * @throws BoardException If the left face is not equal to the tile's left
     * face value or if the orientation is not different from the last tile's
     * orientation.
     */
    private void addTileEndForMule(Tile newTile, Tile lastTile) throws BoardException {
        if (newTile.getOrientation() != lastTile.getOrientation()) {
            FaceTile newTileLeftFace = newTile.getLeftFace();
            FaceTile lastTileFace = lastTile.getFirstFace();
            if (newTileLeftFace.getValue() == lastTileFace.getValue()) {
                tiles.addLast(newTile);
            } else {
                throw new BoardException("The left face must be equal to the mule's values.");
            }
        } else {
            throw new BoardException("The orientation must be perpendicular to the mule.");
        }
    }

    /**
     * Adds a tile to the end of the list when the last tile is not a mule.
     *
     * @param newTile The tile to be added to the end.
     * @param lastTile The last tile in the list.
     * @throws BoardException If the left face is not equal to the tile's left
     * face value or if the orientation is not different from the last tile's
     * orientation.
     */
    private void addTileEndForNonMule(Tile newTile, Tile lastTile) throws BoardException {
        if (newTile.getOrientation() == lastTile.getOrientation()) {
            FaceTile newTileLeftFace = newTile.getLeftFace();
            FaceTile lastTileRightFace = lastTile.getRightFace();
            if (newTileLeftFace.getValue() == lastTileRightFace.getValue()) {
                tiles.addLast(newTile);
            } else {
                throw new BoardException("The left face must be equal to the tile's right face value.");
            }
        } else {
            throw new BoardException("The orientation must be different from the last tile's orientation.");
        }
    }

}
