package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class Board {
    public Piece[][] getBoard() {
        return board;
    }

    Piece[][] board;
    int turn, level, maxLevel;
    public Board(int turn, int level, int maxLevel){
        board = new Piece[4][4];
        for(int i = 0; i<4;i++){
            for(int j = 0; j<4;j++){
                board[i][j]=null;
            }
        }
        this.turn= turn;
        this.level =level;
        this.maxLevel =maxLevel;
    }

    public boolean insertPiece(String data){
        char type = data.charAt(0);
        int x = data.charAt(2)-65;
        int y = Character.getNumericValue(data.charAt(4))-1;
        char color = data.charAt(6);
        int c = 0;
        switch (color){
            case 'W': c = Piece.WHITE; break;
            case 'B': c= Piece.BLACK; break;
        }
        switch (type){
            case 'Q':
                Piece queen = new Queen(x, y, c);
                board[x][y] = queen;
                break;
            case 'N':
                Piece knight = new Knight(x, y, c);
                board[x][y] = knight;
                break;
            case 'R':
                Piece rook = new Rook(x, y, c);
                board[x][y] = rook;
                break;
            case 'B':
                Piece bishop = new Bishop(x, y, c);
                board[x][y] = bishop;
                break;
        }
        return false;
    }

    public void insertPiece(Piece p){
        board[p.getX()][p.getY()]=p;
    }

    public void insertPiece(List<Piece> pieces){
        for(Piece elem : pieces){
            this.insertPiece(elem);
        }
    }

    public void setBoard(Piece[][] board){
        this.board=board;
    }

    public String toString(){
        String res="";
        for(int i = 3; i>=0;i--){
            for(int j = 0; j<4;j++){
                if(board[j][i]==null){
                    res+="-";
                }else{
                    res+= board[j][i].toString();
                }
            }
            res+="\n";
        }
        return res;
    }

    public List<Piece> getPiecesOfColor(int color){
        List<Piece> pieces = new ArrayList<>();
        for(int i = 0 ; i<4 ;i ++){
            for (int j = 0 ; j<4;j++){
                if(board[i][j] != null){
                    if (board[i][j].getColor() == color) {
                        pieces.add(board[i][j]);
                    }
                }
            }
        }
        return pieces;
    }

    public boolean haveWhiteWinned(){
        for(Piece p:this.getPiecesOfColor(Piece.BLACK)){
            if(p.getName().equals("Queen")){
                return false;
            }
        }
        return true;
    }

    public boolean haveWhiteLoosed(){
        for(Piece p:this.getPiecesOfColor(Piece.WHITE)){
            if(p.getName().equals("Queen")){
                return false;
            }
        }
        return true;
    }

    public int getTurn() {
        return turn;
    }

    public boolean isWinForWhite() {
        if(this.level==this.maxLevel){
            return this.haveWhiteWinned();
        }

        if(this.haveWhiteWinned()){
            return true;
        }
        if(this.haveWhiteLoosed()){
            return false;
        }

        if(turn == Piece.WHITE){
            List<Piece> whitepieces = this.getPiecesOfColor(Piece.WHITE);
            List<Board> posPositions = new ArrayList<>();
            for(Piece p : whitepieces){
                for(Board b: p.posMov(this)){
                    posPositions.add(b);
                }
            }
            for(Board b: posPositions){
                if(b.haveWhiteWinned()){
                    return true;
                }
            }
            for(Board b: posPositions){
                if(b.isWinForWhite()){
                    return true;
                }
            }
            return false;
        }else{
            List<Piece> blackpieces = this.getPiecesOfColor(Piece.BLACK);
            List<Board> posPositions = new ArrayList<>();
            for(Piece p : blackpieces){
                for(Board b: p.posMov(this)){
                    posPositions.add(b);
                }
            }

            for(Board b: posPositions){
                if(b.haveWhiteLoosed()){
                    return false;
                }
            }

            for(Board b: posPositions){
                if(!b.isWinForWhite()){
                    return false;
                }
            }

            return true;

        }
    }
}
