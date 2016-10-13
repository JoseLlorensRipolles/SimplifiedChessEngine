import Model.Board;
import Model.Piece;
import Model.Position;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by JoseLlorens on 13/10/2016.
 */
public class SimplifiedChessEngineTest {

    @Test
    public void should_print_yes(){
        Board board = new Board();
        board.insertPiece("Q B 4 B");
        board.insertPiece("R D 1 B");
        board.insertPiece("Q A 4 W");
        board.insertPiece("R A 1 W");
        Position pos = new Position(board, Piece.WHITE,0,6);
        assertThat(pos.isWinForWhite(),is(true));
    }
}
