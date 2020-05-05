import javax.swing.*;

public class Main {
    static boolean xTurn=true;
    static Board window;
    static int tideCheck=0;
    public static void main(String[]args){

        window = new Board();

    }
    public static void stopTheGame(char winner){
        JOptionPane.showMessageDialog(null, "The winner is:"+winner,  "WINNER!!", JOptionPane.UNDEFINED_CONDITION);
        System.exit(0);
    }
    public static void tide(){
        JOptionPane.showMessageDialog(null, "There is no winner", "TIDE", JOptionPane.UNDEFINED_CONDITION);
        System.exit(0);
    }
}
