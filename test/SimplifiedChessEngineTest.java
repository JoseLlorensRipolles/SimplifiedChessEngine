import Model.Board;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by JoseLlorens on 13/10/2016.
 */
public class SimplifiedChessEngineTest {

    @Test
    public void should_print_yes(){
        Board board = new Board(0, 0, 6);
        board.insertPiece("Q B 4 B");
        board.insertPiece("R D 1 B");
        board.insertPiece("Q A 4 W");
        board.insertPiece("R A 1 W");
        assertThat(board.isWinForWhite(),is(true));
    }
}
