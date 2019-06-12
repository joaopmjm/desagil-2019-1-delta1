package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    public void move() {
        Random rnd = new Random();
        int r = rnd.nextInt(4);
        int alt = board.getNumRows();
        int larg = board.getNumCols();

        if (r == 0 && !(this.row - 1 < 0)) {
            if (!board.isWall(this.row - 1, this.col)) {
                this.row--;
            }
        }
        if (r == 1 && !(this.col + 1 > larg - 1)) {
            if (!board.isWall(this.row, this.col + 1)) {
                this.col++;
            }
        }
        if (r == 2 && !(this.row + 1 > alt - 1)) {
            if (!board.isWall(this.row + 1, this.col)) {
                this.row++;
            }
        }
        if (r == 3 && !(this.col - 1 <= 0)) {
            if (!board.isWall(this.row, this.col - 1)) {
                this.col--;
            }
        }
    }
}
