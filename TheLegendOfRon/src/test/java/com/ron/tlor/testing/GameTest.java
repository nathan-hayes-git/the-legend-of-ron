package com.ron.tlor.testing;

import com.ron.tlor.Board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameTest {
    @Test
    public void testCreateBoard(){
        // int xCoordinates, int yCoordinates
        Board b1 = new Board(3,3);
        int getXSize = b1.getBoardXSize();
        int getYSize = b1.getBoardYSize();
        assertEquals(3, getYSize);
        assertEquals(3, getXSize);

    }
}
