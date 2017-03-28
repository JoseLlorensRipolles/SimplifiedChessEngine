package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class Rook extends Piece {

    public Rook(int x, int y, int color) {
        name = "Rook";
        value = 5;
        this.x = x;
        this.y = y;
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
        for(int i = 1; i<4;i++){
            if(x-i>=0){
                if(board.getBoard()[x-i][y]==null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-i][y] = new Rook(x-i,y,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x-i][y].getColor()!=color){
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x-i][y] = new Rook(x-1,y,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }else{
                        break;
                    }
                }
            }
        }
        for(int i = 1; i<4;i++){
            if(x+i<4){
                if(board.getBoard()[x+i][y]==null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+i][y] = new Rook(x+i,y,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x+i][y].getColor()!=color){
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x+i][y] = new Rook(x+1,y,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }else{
                        break;
                    }
                }
            }
        }

        for(int i = 1; i<4;i++){
            if(y-i>=0){
                if(board.getBoard()[x][y-i]==null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x][y-i] = new Rook(x,y-i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x][y-i].getColor()!=color){
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x][y-i] = new Rook(x,y-i,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }else{
                        break;
                    }
                }
            }
        }
        for(int i = 1; i<4;i++){
            if(y+i<4){
                if(board.getBoard()[x][y+i]==null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x][y+i] = new Rook(x,y+i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x][y+i].getColor()!=color){
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x][y+i] = new Rook(x,y+i,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }else{
                        break;
                    }
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
        return "R"+color;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Rook){

            Rook q = (Rook) o;
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

