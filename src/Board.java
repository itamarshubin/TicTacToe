import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
private theButton[][] button=new theButton[3][3];
        public Board(){

            this.setSize(600,600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new GridLayout(3,3));
            this.setResizable(false);
            this.setLocationRelativeTo(null);//this will center the app

            //create and add the buttons to the frame
            for (int i = 0; i < button.length; i++) {
                for (int j = 0; j <button[0].length ; j++) {
                    button[i][j]=new theButton();
                    button[i][j].setRow(i);
                    button[i][j].setCol(j);
                    this.add(button[i][j]);
                }
            }
            this.setVisible(true);
        }


    public theButton getSpecificButton(int row,int col) {
        return button[row][col];
    }
}
