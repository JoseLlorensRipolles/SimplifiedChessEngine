package Model;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class Queen extends Piece{

    public Queen(int x, int y, int color){
        name= "Queen";
        value=9;
        this.x=x;
        this.y=y;
        this.color = color;
        if(x == 4){
            System.out.println("adasda");
        }
    }



    @Override
    public List<Board> posMov(Board board) {

        List<Board> res = new LinkedList<>();

        for(int i = 1;i<4;i++){
            if(x-i>=0 && y-i >=0){
                //If the destination is empty queen can go there
                if(board.getBoard()[x-i][y-i] == null){
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    if((this.x>=table[0].length || this.x<0) || (this.y>=table[0].length || this.y<0)){
                        System.out.println("sasdasda");
                    }
                    table[this.x][this.y]=null;
                    table[x-i][y-i] = new Queen(x-i,y-i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);

                }else {
                    if (board.getBoard()[x - i][y - i].getColor() != this.color) {
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x-i][y-i] = new Queen(x-i,y-i,this.color);
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
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    if(this.x<0||this.y<0){
                        System.out.println("Que merdes pasa ?");
                    }
                    table[this.x][this.y]=null;
                    table[x+i][y+i] = new Queen(x+i,y+i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else {
                    if (board.getBoard()[x + i][y + i].getColor() != this.color) {
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x+i][y+i] = new Queen(x+i,y+i,this.color);
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
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-i][y+i] = new Queen(x-i,y+i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else {
                    if (board.getBoard()[x-i][y + i].getColor() != this.color) {
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x-i][y+i] = new Queen(x-i,y+i,this.color);
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
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+i][y-i] = new Queen(x+i,y-i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else {
                    if (board.getBoard()[x+i][y-i].getColor() != this.color) {
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x+i][y-i] = new Queen(x+1,y-i,this.color);
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
        
        for(int i = 1; i<4;i++){
            if(x-i>=0){
                if(board.getBoard()[x-i][y]==null){
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x-i][y] = new Queen(x-i,y,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x-i][y].getColor()!=color){
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x-i][y] = new Queen(x-1,y,this.color);
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
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x+i][y] = new Queen(x+i,y,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x+i][y].getColor()!=color){
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x+i][y] = new Queen(x+1,y,this.color);
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
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x][y-i] = new Queen(x,y-i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x][y-i].getColor()!=color){
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x][y-i] = new Queen(x,y-i,this.color);
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
                    Board newBoard = new Board();
                    Piece[][] table = copyBoard(board.getBoard());
                    table[this.x][this.y]=null;
                    table[x][y+i] = new Queen(x,y+i,this.color);
                    newBoard.setBoard(table);
                    res.add(newBoard);
                }else{
                    if(board.getBoard()[x][y+i].getColor()!=color){
                        Board newBoard = new Board();
                        Piece[][] table = copyBoard(board.getBoard());
                        table[this.x][this.y]=null;
                        table[x][y+i] = new Queen(x,y+i,this.color);
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
        return "Q"+color;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Queen ){
            Queen q = (Queen) o;
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
