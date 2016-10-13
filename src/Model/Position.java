package Model;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by JoseLlorens on 13/10/2016.
 */
public class Position {
    Board board;
    int turn,level,maxLevel;

    public Position(Board b, int t,int l, int ml){
        this.board=b;
        this.turn = t;
        this.level = l;
        this.maxLevel = ml;
    }

    public boolean isWinForWhite(){

        if(this.level>this.maxLevel){
            return false;
        }

        if(board.haveWhiteWinned()){
            return true;
        }
        if(board.haveWhiteLoosed()){
            return false;
        }

        if(turn == Piece.WHITE){
            List<Piece> whitepieces = board.getPiecesOfColor(Piece.WHITE);
            List<Position> posPositions = new LinkedList<>();
            for(Piece p : whitepieces){
                for(Board b: p.posMov(board)){
                    posPositions.add(new Position(b,Piece.BLACK,this.level+1,this.maxLevel));
                }
            }

            for(Position p: posPositions){
                if(p.isWinForWhite()){
                    return true;
                }
            }
            return false;
        }else{
            List<Piece> blackpieces = board.getPiecesOfColor(Piece.BLACK);
            List<Position> posPositions = new LinkedList<>();
            for(Piece p : blackpieces){
                for(Board b: p.posMov(board)){
                    posPositions.add(new Position(b,Piece.WHITE,this.level+1,this.maxLevel));
                }
            }

            for(Position p: posPositions){
                if(!p.isWinForWhite()){
                    return false;
                }
            }
            return true;

        }
    }
}
