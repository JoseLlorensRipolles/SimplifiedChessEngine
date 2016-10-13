import Model.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by JoseLlorens on 13/10/2016.
 */
public class PositionTest {

    @Test
    public void should_return_true_to_withe_win(){
        Board board = new Board();
        board.insertPiece(new Knight(1,1, Piece.WHITE));
        board.insertPiece(new Queen(1,0,Piece.WHITE));
        board.insertPiece(new Queen(0,3,Piece.BLACK));
        System.out.println(board);
        Position pos = new Position(board,Piece.WHITE,0,6);
        assertThat(pos.isWinForWhite(),is(true));
    }
}
