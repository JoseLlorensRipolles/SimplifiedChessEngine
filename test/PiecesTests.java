import Model.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public class PiecesTests {

    @Test
    public void  should_return_false_because_non_equals(){
        Knight q1 = new Knight(1,2, Piece.BLACK);
        Knight q2 = new Knight(1,2,Piece.WHITE);
        Knight q3 = new Knight(1,3,Piece.BLACK);
        Knight q4 = new Knight(3,2,Piece.BLACK);
        assertThat(q1.equals(q2),is(false));
        assertThat(q1.equals(q3),is(false));
        assertThat(q1.equals(q4),is(false));
    }

    @Test
    public void should_return_true_when_same_piece(){
        Knight q1 = new Knight(1,2, Piece.BLACK);
        Knight q2 = new Knight(1,2,Piece.BLACK);
        Knight q3 = new Knight(3,2,Piece.WHITE);
        Knight q4 = new Knight(3,2,Piece.WHITE );
        assertThat(q1.equals(q2),is(true));
        assertThat(q4.equals(q3),is(true));
    }

    @Test
    public void should_move_correctly_the_queen(){
        Board board = new Board();
        board.insertPiece(new Queen(1,1,Piece.WHITE));
        board.insertPiece(new Rook(2,1,Piece.WHITE));
        board.insertPiece(new Bishop(2,2,Piece.BLACK));
        System.out.println(board);
        for(Board b : board.getBoard()[1][1].posMov(board)){
            System.out.println(b);
        }
    }

    @Test
    public void should_move_correctly_the_bishop(){
        Board board = new Board();
        board.insertPiece(new Bishop(1,1,Piece.WHITE));
        board.insertPiece(new Rook(2,0,Piece.WHITE));
        board.insertPiece(new Queen(2,2,Piece.BLACK));
        System.out.println(board);
        for(Board b : board.getBoard()[1][1].posMov(board)){
            System.out.println(b);
        }
    }

    @Test
    public void should_move_correctly_the_rook(){
        Board board = new Board();
        board.insertPiece(new Rook(1,1,Piece.WHITE));
        board.insertPiece(new Rook(1,2,Piece.WHITE));
        board.insertPiece(new Queen(2,1,Piece.BLACK));
        System.out.println(board);
        for(Board b : board.getBoard()[1][1].posMov(board)){
            System.out.println(b);
        }
    }

    @Test
    public void should_move_correctly_the_knight(){
        Board board = new Board();
        board.insertPiece(new Knight(1,1,Piece.WHITE));
        board.insertPiece(new Rook(1,2,Piece.WHITE));
        board.insertPiece(new Queen(2,1,Piece.WHITE));
        System.out.println(board);
        for(Board b : board.getBoard()[1][1].posMov(board)){
            System.out.println(b);
        }
    }
}
