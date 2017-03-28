import Model.Board;
import Model.Piece;

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
            Board root = new Board(Piece.WHITE,0,nMoves);
            for(int j=0;j<nWhite;j++){
                root.insertPiece(kb.nextLine()+" W");
            }
            for(int j=0;j<nBlack;j++){
                root.insertPiece(kb.nextLine()+" B");
            }

            if(root.isWinForWhite()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}

