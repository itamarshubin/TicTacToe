import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
private XorO[] button=new XorO[9];
        public Board(){

            this.setSize(600,600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new GridLayout(3,3));
            this.setResizable(false);
            this.setLocationRelativeTo(null);//this will center the app
            for (int i = 0; i < button.length; i++) {
                button[i]= new XorO();
                this.add(button[i]);
            }




            this.setVisible(true);
        }

}
