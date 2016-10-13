import Model.Board;
import Model.Piece;
import Model.Position;

import java.util.List;
import java.util.Scanner;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class SimplifiedChessGame {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int g = kb.nextInt();
        for(int i=0; i<g ; i++){
            int nWhite = kb.nextInt();
            int nBlack = kb.nextInt();
            int nMoves = kb.nextInt();
            String trash = kb.nextLine();
            Board board = new Board();
            for(int j=0;j<nWhite;j++){
                board.insertPiece(kb.nextLine()+" W");
            }
            for(int j=0;j<nBlack;j++){
                board.insertPiece(kb.nextLine()+" B");
            }
            Position root = new Position(board,Piece.WHITE,0,6);
            if(root.isWinForWhite()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}

