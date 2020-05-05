public class check {

    public static void print(int row,int col){

        theButton temp;
        temp = Main.window.getSpecificButton(row,col);
        System.out.println("the text on this button is:"+temp.getText());

    }
}
