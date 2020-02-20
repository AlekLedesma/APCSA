/**
 * Write a description of class Minesweeper here.
 * 
 * @author (Alek Ledesma) 
 * @version (10.31.19)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MineBoard
{
    Cell[][] board;
    int rows;
    int columns;
    public MineBoard(int row, int col)
    {
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[rows][columns];

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        //bruh
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addBombs(int bombs) throws Exception
    {
        for(int i = 0; i < bombs; i++)
        {
            int randRow = (int)(Math.random() * rows); 
            int randCol = (int)(Math.random() * columns);

            if (board[randRow][randCol].getValue() == -9)
            {
                i--;
            }
            if (board[randRow][randCol].getValue() != -9)
            {
                board[randRow][randCol].changeValue(-9);
            }
        }
    }

    public void addNums()
    {
        int number = 0;
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(!board[i][j].isBomb())
                {
                    //Top
                    if(i - 1 >= 0 )
                    {
                        if(board[i - 1][j].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                    //Bottom
                    if(i + 1 < board.length )
                    {
                        if(board[i + 1][j].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                    //Left
                    if (j - 1 >= 0 )
                    {
                        if(board[i][j - 1].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                    //Right
                    if (j + 1 < board[0].length )
                    {
                        if(board[i][j + 1].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                    //TopRight
                    if (i - 1 >= 0 && j + 1 < board[0].length )
                    {
                        if(board[i - 1][j + 1].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                    //TopLeft
                    if (i - 1 >= 0 && j - 1 >= 0 )
                    {
                        if(board[i - 1][j - 1].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                    //BottomRight
                    if (i + 1 < board.length && j + 1 < board[0].length )
                    {
                        if(board[i + 1][j + 1].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                    //BottomLeft
                    if (i + 1 < board.length && j - 1 >= 0 )
                    {
                        if(board[i + 1][j - 1].isBomb())
                        {
                            board[i][j].value = board[i][j].value + 1;
                        }
                    }
                }
            }
        }
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard()
    {
        
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j].isBomb())
                {
                    System.out.print("X ");
                }else
                {
                    System.out.print(board[i][j].value + " ");
                }
            }
            System.out.println();
        } 

    }
    public JPanel addCells()
    {
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                board[i][j]= new Cell();
                panel.add(board[i][j].getButton());
            }
        }
        
        return panel;
    }
}
