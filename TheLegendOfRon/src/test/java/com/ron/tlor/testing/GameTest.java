package com.ron.tlor.testing;

import com.ron.tlor.Board;
import com.ron.tlor.Creature;
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
    @Test
    public void testCreatureMove(){
        int xSize = 3, ySize = 3;
        Board b1 = new Board(xSize, ySize);
        Creature c1 = new Creature();
        c1.setXCoordinate = 1;
        c1.setYCoordinate = 1;
        int xMove = 1, yMove = 2; //move by how much
        c1.moveX(xMove);
        c1.moveY(yMove);
        assertEquals(1+xMove, c1.getXCoordinate);
        assertEquals(1+yMove, c1.getYCoordinate);
    }
}
