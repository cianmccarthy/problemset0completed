import javax.swing.*;

public class problemset0 {
    public static void main(String[] args) {
        String name, className, snackNoAsString;
        int snackNo;
        float totalPrice;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        className = JOptionPane.showInputDialog("Please enter your class name: ");
        snackNoAsString = JOptionPane.showInputDialog("Please enter the number of snacks you would like: ");
        snackNo = Integer.parseInt(snackNoAsString);

        totalPrice = snackNo * 2;

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nClass Name: " + className + "\nNumber of Snacks: " + snackNo + "\n\nTotal Price: " + totalPrice,"Summary",JOptionPane.INFORMATION_MESSAGE);
    }
    }
