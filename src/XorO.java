import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class XorO extends JButton implements MouseListener {
private Boolean isClicked;
private String text;
private int row;
private int col;
    public XorO(){
        Font font = new Font("Arial", Font.BOLD, 64);
        this.setFont(font);

        this.isClicked=false;
        this.addMouseListener(this);
    }



    //getter and setters
    public Boolean getClicked() {
        return isClicked;
    }
    @Override
    public String getText() {
        return text;
    }
    public void setClicked(Boolean clicked) {
        isClicked = clicked;
    }
    @Override
    public void setText(String text) {
        this.text = text;
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
            if(Main.xTurn)
                this.setText("X");
            else
                this.setText("O");
            Main.xTurn=!Main.xTurn;

            this.setClicked(true);
        }
        check.print(this.row,this.col);
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

