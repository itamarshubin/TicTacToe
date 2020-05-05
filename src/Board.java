import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
private theButton[][] buttons=new theButton[3][3];
        public Board(){
            this.setSize(600,600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new GridLayout(3,3));
            this.setResizable(false);
            this.setLocationRelativeTo(null);//this will center the app

            //create and add the buttons to the frame
            for (int i = 0; i < buttons.length; i++) {
                for (int j = 0; j <buttons[0].length ; j++) {
                    buttons[i][j]=new theButton(i,j);
                    this.add(buttons[i][j]);
                }
            }
            this.setVisible(true);
        }



    public theButton getSpecificButton(int row,int col) {
        return buttons[row][col];
    }
}
