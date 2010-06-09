package com.innovatrics.iengine.ansiiso;

/**
 * Represents a RAW image data.
 * @author Martin Vysny
 */
public class RawImage {
    /**
     * Creates a RAW image data.
     * @param width Contains the width of converted image, in pixels.
     * @param height Contains the height of converted image, in pixels.
     * @param raw the raw image data.
     */
    public RawImage(int width, int height, byte[] raw) {
        this.width = width;
        this.height = height;
        this.raw = raw;
    }
    /**
     * Contains the width of converted image, in pixels.
     */
    public final int width;
    /**
     * Contains the height of converted image, in pixels.
     */
    public final int height;
    /**
     * The raw image data.
     */
    public final byte[] raw;
}
