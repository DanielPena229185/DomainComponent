/**
 * Tile.java
 * Oct 12, 2023 6:00:01 PM
 */
package domain;

import enums.Orientation;
import enums.Side;
import java.util.Objects;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class Tile {

    /**
     * First face of the tile
     */
    private FaceTile firstFace;

    /**
     * Second face of the tile
     */
    private FaceTile secondFace;

    /**
     * Orientation of the tile (HORIZONTAL, VERTICAL)
     */
    private Orientation orientation;

    /**
     *
     */
    private GameElement gameElement;

    /**
     * Default constructor
     */
    public Tile() {
    }

    /**
     * Constructor with the first and second face with a default orientation
     * "Vertical" and the first face is on TOP and the second face is on Bottom
     *
     * @param firstFace First face of the tile, with default side "TOP"
     * @param secondFace First face of the tile, with default side "BOTTOM"
     */
    public Tile(FaceTile firstFace, FaceTile secondFace) {

        //Default side values
        firstFace.setSide(Side.TOP);
        secondFace.setSide(Side.BOTTOM);

        this.firstFace = firstFace;
        this.secondFace = secondFace;
        this.orientation = Orientation.VERTICAL;
    }

    /**
     * Constructor with the faces and an orientation
     *
     * @param firstFace First face of the tile
     * @param secondFace Second face of the tile
     * @param orientation Orientation of the tile (HORIZONTAL, VERTICAL)
     */
    public Tile(FaceTile firstFace, FaceTile secondFace, Orientation orientation) {
        this.firstFace = firstFace;
        this.secondFace = secondFace;
        this.orientation = orientation;
    }

    /**
     * Get the first face of the tile
     *
     * @return First face of the tile
     */
    public FaceTile getFirstFace() {
        return firstFace;
    }

    /**
     * Set the first face of the tile
     *
     * @param firstFace The first face of the tile
     */
    public void setFirstFace(FaceTile firstFace) {
        this.firstFace = firstFace;
    }

    /**
     * Get the second face of the tile
     *
     * @return Second face of the tile
     */
    public FaceTile getSecondFace() {
        return secondFace;
    }

    /**
     * Set the second face of the tile
     *
     * @param secondFace Second face of the tile
     */
    public void setSecondFace(FaceTile secondFace) {
        this.secondFace = secondFace;
    }

    /**
     * Get the orientation of the Tile
     *
     * @return Orientation of the tile (HORIZONTAL, VERTICAL)
     */
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     * Set the orientaion
     *
     * @param orientation
     */
    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    /**
     *
     * @return
     */
    public GameElement getGameElement() {
        return gameElement;
    }

    /**
     *
     * @param gameElement
     */
    public void setGameElement(GameElement gameElement) {
        this.gameElement = gameElement;
    }

    /**
     * Rotates the FaceTile by turning both of its faces and changing its
     * orientation.
     */
    public void rotate() {
        this.firstFace.turnSide();
        this.secondFace.turnSide();
        this.changeOrientation();
    }

    /**
     * Changes the orientation of the FaceTile. If the current orientation is
     * HORIZONTAL, it will be changed to VERTICAL, and vice versa. This method
     * is private and is typically called internally when rotating the tile.
     */
    private void changeOrientation() {
        if (this.orientation == Orientation.HORIZONTAL) {
            this.orientation = Orientation.VERTICAL;
        } else {
            this.orientation = Orientation.HORIZONTAL;
        }
    }

    /**
     * Checks if the values of both faces are equal. Returns true if they have
     * the same value, false otherwise.
     *
     * @return true if the values of both faces are equal, false otherwise
     */
    public boolean isMule() {
        return firstFace.getValue() == secondFace.getValue();
    }

    public FaceTile getRightFace() {
        if (orientation == Orientation.HORIZONTAL) {
            if (this.firstFace.getSide() == Side.RIGHT) {
                return firstFace;
            } else {
                return secondFace;
            }
        }
                return null;
    }

    public FaceTile getLeftFace() {
        if (orientation == Orientation.HORIZONTAL) {
            if (this.firstFace.getSide() == Side.LEFT) {
                return firstFace;
            } else {
                return secondFace;
            }
        }
                return null;
    }
    
    public FaceTile getTopFace() {
        if (orientation == Orientation.VERTICAL) {
            if (this.firstFace.getSide() == Side.TOP) {
                return firstFace;
            } else {
                return secondFace;
            }
        }
                return null;
    }
    
    public FaceTile getBottomFace() {
        if (orientation == Orientation.VERTICAL) {
            if (this.firstFace.getSide() == Side.BOTTOM) {
                return firstFace;
            } else {
                return secondFace;
            }
        }
                return null;
    }
    /**
     * Computes the hash code value for this Tile object based on its
     * attributes. The hash code is calculated using the objects first face,
     * second face, and orientation.
     *
     * @return The computed hash code for this Tile.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.firstFace);
        hash = 71 * hash + Objects.hashCode(this.secondFace);
        hash = 71 * hash + Objects.hashCode(this.orientation);
        return hash;
    }

    /**
     * Indicates whether some other object is "equal to" this Tile. Two Tile
     * objects are considered equal if they have the same first face, second
     * face, and orientation values.
     *
     * @param obj The object to compare with this Tile for equality.
     * @return True if this Tile is equal to the specified object; false
     * otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Tile other = (Tile) obj;
        if (!Objects.equals(this.firstFace, other.firstFace)
                || !Objects.equals(this.secondFace, other.secondFace)
                || this.orientation != other.orientation) {
            return false;
        }
        return true;
    }
}
