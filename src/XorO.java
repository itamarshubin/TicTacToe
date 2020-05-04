import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class XorO extends JButton implements MouseListener {
private Boolean isClicked;
private String text;
    public XorO(){
        Font font = new Font("Arial", Font.BOLD, 64);
        this.setFont(font);
        this.isClicked=false;
        this.setSize(200,200);
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
    @Override
    public void mouseClicked(MouseEvent e) {
            if (!this.isClicked)
        {
            if(Main.xTurn)
                this.setText("X");
            else
                this.setText("O");
            Main.xTurn=!Main.xTurn;
            this.setEnabled(false);
            this.setClicked(true);
        }
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

