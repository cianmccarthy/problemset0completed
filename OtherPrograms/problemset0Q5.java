import javax.swing.*;

public class problemset0Q5 {
    public static void main(String[] args) {

        String  numberAsString, anotherNumberAsString, operationAsString;
        double number, anotherNumber;
        char operation;


        operationAsString = JOptionPane.showInputDialog("Please enter the operation desired: ");

        numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
        number = Double.parseDouble(numberAsString);

        anotherNumberAsString = JOptionPane.showInputDialog("Please enter another number: ");
        anotherNumber = Double.parseDouble(anotherNumberAsString);

        operation = operationAsString.charAt(0);

        switch (operation)
        {
            case 'a':
                JOptionPane.showMessageDialog(null,"The numbers entered will now equal to: " + String.format("%.2f",(number + anotherNumber)));
            break;

            case 's':
                JOptionPane.showMessageDialog(null,"The numbers entered will now equal to: \t" + String.format("%.2f",(number - anotherNumber)));
            break;

            case 'm':
                JOptionPane.showMessageDialog(null, "The numbers entered will now equal to: \t" + String.format("%.2f",(number * anotherNumber)));
            break;

            case 'd':
                JOptionPane.showMessageDialog(null,"The numbers entered equals to: \t" + String.format("%.2f",(number / anotherNumber)));
            break;

            default:
                JOptionPane.showMessageDialog(null,"The character you have entered is an ineligible operation");

        }
    }
}