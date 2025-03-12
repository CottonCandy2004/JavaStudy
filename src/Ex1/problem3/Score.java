package Ex1.problem3;

import javax.swing.JOptionPane;
public class Score {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a score:");
        int score;
        try{
            score = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid score");
            return;
        }
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println(grade);
    }
}
