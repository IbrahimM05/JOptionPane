import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int response;
        ImageIcon myIcon = new ImageIcon("smileyFace.png");
        String[] myAnswers = {"yes", "maybe", "kind of"};
        response = JOptionPane.showOptionDialog(null, "Are you idiot :) ", "JOptionPane", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, myIcon, myAnswers, null);
        while (response == -1) {
            response = JOptionPane.showOptionDialog(null, "Are you idiot :) ", "JOptionPane", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, myIcon, myAnswers, null);
        }
    }
}