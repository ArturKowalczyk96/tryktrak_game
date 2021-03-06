package com.ak.tryktrak;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
    private Piece piece;

    // Check if there is a piece on tile
    public boolean hasPiece(){
        return piece != null;
    }

    //getter
    public Piece getPiece() {
        return piece;
    }

    //setter
    public void setPiece(Piece piece) {
        this.piece = piece;

    }

    public Tile(boolean red, int x, int y){
        setWidth(TryktrakApp.TILE_SIZE);
        setHeight(TryktrakApp.TILE_SIZE);

        relocate(x * TryktrakApp.TILE_SIZE, y * TryktrakApp.TILE_SIZE);

        setStroke(Color.BLACK);
        setStrokeWidth(0.03 * TryktrakApp.TILE_SIZE);
        setFill(red ? Color.valueOf("#c0392b") : Color.valueOf("#ecf0f1"));
    }
}
