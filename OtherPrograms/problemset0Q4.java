import javax.swing.*;

public class problemset0Q4 {
    public static void main(String[] args) {

        String numberAsString;
        int counter=0, number, numberTotal=0;


        numberAsString = JOptionPane.showInputDialog("Please enter a number (q to exit): ");
        number = Integer.parseInt(numberAsString);

        while(!numberAsString.equals("q"))
        {

            numberAsString = JOptionPane.showInputDialog("Please enter a number (q to exit): ");
            numberTotal = numberTotal + number;
            counter++;
        }

        JOptionPane.showMessageDialog(null,"The total of the  numbers entered is:\t " + numberTotal + "\n\nThe number of iterations is:\t " + counter);



  }
}