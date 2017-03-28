import org.junit.Test;
import Model.*;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class BoardTest {
    @Test
    public void should_create_a_empty_board(){
        Board board = new Board(0,0,6);
        for(int i = 0; i<4;i++){
            for(int j = 0; j<4;j++){
                assert(board.getBoard()[i][j]==null);
            }
        }
    }

    @Test
    public void should_insert_pieces_correctly(){
        Board board = new Board(Piece.WHITE,0,6);
        board.insertPiece("N B 2 W");
        board.insertPiece("Q B 1 W");
        board.insertPiece(new Rook(0,3,Piece.BLACK));
        board.insertPiece("B C 4 B");
        System.out.println(board.toString());
        assertThat(board.toString(),is("R1-B1-\n----\n-N0--\n-Q0--\n"));
    }

    @Test
    public void should_return_color_pieces(){
        Board board = new Board(Piece.WHITE,0,6);
        Piece queen = new Queen(1,2,Piece.WHITE);
        Piece rook = new Rook(0,3,Piece.BLACK);
        Piece bishop = new Bishop(2,3,Piece.WHITE);
        Piece knight = new Knight(1,0,Piece.BLACK);
        List<Piece> pieces = new ArrayList<Piece>();
        pieces.add(queen);
        pieces.add(rook);
        pieces.add(bishop);
        pieces.add(knight);
        board.insertPiece(pieces);
        List<Piece> whitePieces = new ArrayList<>();
        whitePieces.add(bishop);
        whitePieces.add(queen);
        List<Piece> blackPieces = new ArrayList<>();
        blackPieces.add(knight);
        blackPieces.add(rook);
        List<Piece> randomList = new ArrayList<>();
        randomList.add(queen);
        randomList.add(bishop);
        randomList.add(rook);

        assert(equalsNoMatterOrder(board.getPiecesOfColor(Piece.WHITE),whitePieces)==true);
        assert(equalsNoMatterOrder(board.getPiecesOfColor(Piece.BLACK),blackPieces)==true);
        assert(equalsNoMatterOrder(board.getPiecesOfColor(Piece.BLACK),randomList)==false);
    }




    public boolean equalsNoMatterOrder(List l1, List l2){
        Set set1 = new HashSet<>(l1);
        Set set2 = new HashSet<>(l2);

        return set1.equals(set2);
    }
}
