package com.shafiya.java;

public class Walls {
    private int width;
    private int height;
    private int depth;
    private String wallColor;

    public Walls(int width, int height, int depth, String wallColor) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.wallColor = wallColor;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public String getWallColor() {
        return wallColor;
    }
}
