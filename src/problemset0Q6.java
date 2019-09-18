import javax.swing.*;

public class problemset0Q6 {
    public static void main(String[] args) {

        String  numberAsString, anotherNumberAsString, operationAsString;
        double number, anotherNumber;
        char operation;
        int choice;

        choice = JOptionPane.showConfirmDialog(null, "Do you wish to do some calculations? ");

        while(choice==JOptionPane.YES_OPTION) {

            numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
            number = Double.parseDouble(numberAsString);

            anotherNumberAsString = JOptionPane.showInputDialog("Please enter another number: ");
            anotherNumber = Double.parseDouble(anotherNumberAsString);

            operationAsString = JOptionPane.showInputDialog("Please choose your operation:\n\n" +
                    "A (addition)\n....");


            operation = operationAsString.charAt(0);

            switch (operation) {
                case 'a':
                    JOptionPane.showMessageDialog(null, "The numbers entered will now equal to: " + String.format("%.2f", (number + anotherNumber)));
                    break;

                case 's':
                    JOptionPane.showMessageDialog(null, "The numbers entered will now equal to: \t" + String.format("%.2f", (number - anotherNumber)));
                    break;

                case 'm':
                    JOptionPane.showMessageDialog(null, "The numbers entered will now equal to: \t" + String.format("%.2f", (number * anotherNumber)));
                    break;

                case 'd':
                    JOptionPane.showMessageDialog(null, "The numbers entered equals to: \t" + String.format("%.2f", (number / anotherNumber)));
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "The character you have entered is an ineligible operation");

            }

            choice = JOptionPane.showConfirmDialog(null, "Do you wish to enter more? ");

        }




        }
    }
