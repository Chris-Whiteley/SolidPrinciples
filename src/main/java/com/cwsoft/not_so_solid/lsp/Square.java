package com.cwsoft.not_so_solid.lsp;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // height and width are the same in a square
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // height and width are the same in a square
    }
}