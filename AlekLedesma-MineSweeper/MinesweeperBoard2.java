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

public class MinesweeperBoard2
{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard2(int row, int col)
    {
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[rows * columns];
        
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addBombs(int bombs) throws Exception
    {
        for(int i = 0; i < bombs; i++)
        {
            double rand = Math.random() * (rows * columns);
            int random = (int) rand;
            if (board[random].getValue() == -9)
            {
                i--;
            }
            if (board[random].getValue() != -9)
            {
                board[random].changeValue(-9);
            }
        }
    }

    public void addNums()
    {
        int number = 0;
        for(int i = 0; i < rows * columns; i++)
        {
            if(!board[i].isBomb())
            {
                if(i - rows >= 0 && i % columns > 0)
                {
                
                }
                
            }
        }
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard()
    {
       int p = 0;
        for(int i = 0; i < rows; i++)
       {
           for(int o = 0; o < columns; o++)
           {
               if(board[p].isBomb())
               {
                   System.out.print("X ");
               }else
               {
                System.out.print(board[p].value + " ");
               }
               p++;
           }
           System.out.println();
       } 
    }
    public JPanel addCells()
    {
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++)
        {
                board[i]= new Cell();
                panel.add(board[i].getButton());
        }
        return panel;
    }
    
}
