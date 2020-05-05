public class check {

    public static char theWinner(int row,int col){
        char winner='-';

        theButton temp;
        temp = Main.window.getSpecificButton(row,col);

        //check if 3 int the row
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if ((Main.window.getSpecificButton(row,i).getTEXT())==(temp.getTEXT()))
                count++;
        }
        if (count==3)
        {
            winner = temp.getTEXT();
            return winner;
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
            if ((Main.window.getSpecificButton(i,col).getTEXT())==(temp.getTEXT()))
                count++;
        }
        if (count==3)
        {
            winner = temp.getTEXT();
            return winner;
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
            if ((Main.window.getSpecificButton(i,i).getTEXT())==(temp.getTEXT()))
                count++;
        }
        if (count==3)
        {
            winner = temp.getTEXT();
            return winner;
        }

        count=0;
        for (int i = 0; i < 3; i++) {
            if ((Main.window.getSpecificButton(i,2-i).getTEXT())==(temp.getTEXT()))
                count++;
        }
        if (count==3)
        {
            winner = temp.getTEXT();
            return winner;
        }
        return winner;
    }

}
