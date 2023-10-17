/**
 * FaceTile.java Oct 12, 2023 6:00:14 PM
 */
package domain;

import enums.Side;

/**
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class FaceTile{

    /**
     * Side of the face (TOP, BOTTOM, RIGHT, LEFT)
     */
    private Side side;

    /**
     * Value of the face
     */
    private int value;

    /**
     * Default Constructor
     */
    public FaceTile() {
    }

    /**
     *
     * Constructs a FaceTile with the specified side and value.
     *
     * @param value The value associated with the tile.
     */
    public FaceTile(int value) {
        this.value = value;
    }

    /**
     * Get the side of the face
     *
     * @return Side of the face (TOP, BOTTOM, RIGHT, LEFT)
     */
    public Side getSide() {
        return side;
    }

    /**
     * Set the side of the face
     *
     * @param side Side of the face (TOP, BOTTOM, RIGHT, LEFT)
     */
    public void setSide(Side side) {
        this.side = side;
    }

    /**
     * Get the value of the face
     *
     * @return Value of the face
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the value of the tile face
     *
     * @param value Value of the face
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Rotates the current side to the right in a circular sequence. If the
     * current side is at the end of the sequence, it wraps around to the
     * beginning.
     */
    public void turnSide() {
        if (null != this.side) {
            switch (this.side) {
                case TOP ->
                    this.side = Side.LEFT;
                case LEFT ->
                    this.side = Side.BOTTOM;
                case BOTTOM ->
                    this.side = Side.RIGHT;
                case RIGHT ->
                    this.side = Side.TOP;
            }
        }
    }

}
