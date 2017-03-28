package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class Bishop extends Piece{

    public Bishop(int x, int y, int color){
        name= "Bishop";
        value=3;
        this.x=x;
        this.y=y;
        this.color = color;
    }

    @Override
    public List<Board> posMov(Board board) {
        List<Board> res = new ArrayList<>();
        int turn;
        if(board.getTurn() == Piece.WHITE){
            turn = Piece.BLACK;
        }else{
            turn = Piece.WHITE;
        }

        for(int i = 1;i<4;i++){
            if(x-i>=0 && y-i >=0){
                //If the destination is empty Bishop can go there
                if(board.getBoard()[x-i][y-i] == null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-i][y-i] = new Bishop(x-i,y-i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);

                }else {
                    if (board.getBoard()[x - i][y - i].getColor() != this.color) {
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x-i][y-i] = new Bishop(x-i,y-i,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }
                    if (board.getBoard()[x - i][y - i].getColor() == this.color) {
                        break;
                    }
                }
            }
        }

        for(int i = 1;i<4;i++){
            if(x+i<4 && y+i <4){
                if(board.getBoard()[x+i][y+i] == null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+i][y+i] = new Bishop(x+i,y+i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else {
                    if (board.getBoard()[x + i][y + i].getColor() != this.color) {
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x+i][y+i] = new Bishop(x+i,y+i,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }
                    if (board.getBoard()[x+i][y+i].getColor() == this.color) {
                        break;
                    }
                }
            }
        }
        for(int i = 1;i<4;i++){
            if(x-i>=0 && y+i <4){
                if(board.getBoard()[x-i][y+i] == null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-i][y+i] = new Bishop(x-i,y+i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else {
                    if (board.getBoard()[x-i][y + i].getColor() != this.color) {
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x-i][y+i] = new Bishop(x-i,y+i,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }
                    if (board.getBoard()[x-i][y+i].getColor() == this.color) {
                        break;
                    }
                }
            }
        }

        for(int i = 1;i<4;i++){
            if(x+i<4 && y-i>=0){
                if(board.getBoard()[x+i][y-i] == null){
                    Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+i][y-i] = new Bishop(x+i,y-i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else {
                    if (board.getBoard()[x+i][y-i].getColor() != this.color) {
                        Board newBoard = new Board(turn,board.level+1,board.maxLevel);
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x+i][y-i] = new Bishop(x+1,y-i,this.color);
                        newBoard.setBoard(table);
                        res.add(newBoard);
                        break;
                    }
                    if (board.getBoard()[x+i][y-i].getColor() == this.color) {
                        break;
                    }
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "B"+color;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Bishop){

            Bishop q = (Bishop) o;
            if(this.x == q.getX() && this.y ==q.getY() && this.color == q.getColor()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
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
}