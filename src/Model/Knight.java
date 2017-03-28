package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class Knight extends Piece {

    public Knight(int x, int y,int color){
        name= "Knight";
        value=3;
        this.x=x;
        this.y=y;
        this.color = color;
    }

    @Override
    public List<Board> posMov(Board board) {
        int turn;
        if(board.getTurn() == Piece.WHITE){
            turn = Piece.BLACK;
        }else{
            turn = Piece.WHITE;
        }
        List<Board> res = new ArrayList<>();
        if(x-2>=0 && y-1>=0){
            if(board.getBoard()[x-2][y-1] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x-2][y-1] = new Knight(x-2,y-1,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x-2][y-1].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-2][y-1] = new Knight(x-2,y-1,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }
        if(x-1>=0 && y-2>=0){
            if(board.getBoard()[x-1][y-2] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x-1][y-2] = new Knight(x-1,y-2,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x-1][y-2].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-1][y-2] = new Knight(x-1,y-2,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }

        if(x+2<4 && y+1<4){
            if(board.getBoard()[x+2][y+1] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x+2][y+1] = new Knight(x+2,y+1,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x+2][y+1].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+2][y+1] = new Knight(x+2,y+1,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }
        if(x+1<4 && y+2<4){
            if(board.getBoard()[x+1][y+2] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x+1][y+2] = new Knight(x+1,y+2,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x+1][y+2].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+1][y+2] = new Knight(x+1,y+2,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }

        if(x+2<4 && y-1>=0){
            if(board.getBoard()[x+2][y-1] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x+2][y-1] = new Knight(x+2,y-1,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x+2][y-1].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+2][y-1] = new Knight(x+2,y-1,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }
        if(x+1<4 && y-2>=0){
            if(board.getBoard()[x+1][y-2] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x+1][y-2] = new Knight(x+1,y-2,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x+1][y-2].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+1][y-2] = new Knight(x+1,y-2,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }
        if(x-2>=0 && y+1<4){
            if(board.getBoard()[x-2][y+1] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x-2][y+1] = new Knight(x-2,y+1,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x-2][y+1].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-2][y+1] = new Knight(x-2,y+1,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }
        if(x-1>=0 && y+2<4){
            if(board.getBoard()[x-1][y+2] == null){
                Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                Piece[][] table = copyBoard(board.getBoard());
                table[this.x][this.y]=null;
                table[x-1][y+2] = new Knight(x-1,y+2,this.color);
                newBoard.setBoard(table);
                res.add(newBoard);

            }else {
                if (board.getBoard()[x-1][y+2].getColor() != this.color) {
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-1][y+2] = new Knight(x-1,y+2,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }
            }
        }
        return res;
    }

    private Piece[][] copyBoard(Piece[][] board) {
        Piece[][] res = new Piece[4][4];
        for(int i = 0; i<4;i++){
            for(int j = 0; j<4;j++){
                res[i][j] = board[i][j];
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "N"+color;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Knight){

            Knight q = (Knight) o;
            if(this.x == q.getX() && this.y ==q.getY() && this.color == q.getColor()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
