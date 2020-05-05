import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class theButton extends JButton implements MouseListener {
private Boolean isClicked;
private char TEXT;
private int row;
private int col;

    public theButton(int Row,int Col){
        Font font = new Font("Arial", Font.BOLD, 64);
        this.setFont(font);

        this.isClicked=false;
        this.addMouseListener(this);
        this.row=Row;
        this.col=Col;
    }



    //getter and setters
    public Boolean getClicked() {
        return isClicked;
    }
    public char getTEXT() {
        return TEXT;
    }
    public void setClicked(Boolean clicked) {
        isClicked = clicked;
    }
    public void setTEXT(char text) {
        this.TEXT = text;
        this.setText(this.getTEXT()+"");
    }
    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public void setRow(int row) {
        this.row = row;
    }

    //the mouseListeners
    @Override
    public void mouseClicked(MouseEvent e) {
            if (!this.isClicked)
        {
            Main.tideCheck++;
            if(Main.xTurn)
                this.setTEXT('x');
            else
                this.setTEXT('O');
            Main.xTurn=!Main.xTurn;

            this.setClicked(true);
        }
        char theWinner=check.theWinner(this.row,this.col);
        if (theWinner!='-')
            Main.stopTheGame(theWinner);
        else
            if (Main.tideCheck==9)
              Main.tide();
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
}

