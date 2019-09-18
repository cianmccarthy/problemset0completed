import javax.swing.*;

public class problemset0Q2 {
    public static void main(String[] args) {
        String firstName, initial, lastName, distanceCycledAsString;
        int distanceCycled;
        double cost;


        firstName = JOptionPane.showInputDialog("Please enter the cyclists first name: ");
        lastName = JOptionPane.showInputDialog("Please enter the cyclists last name: ");
        initial = JOptionPane.showInputDialog("Please enter the cyclists initials: ");
        distanceCycledAsString = JOptionPane.showInputDialog("Please enter the distance cycled by the cyclist: ");
        distanceCycled = Integer.parseInt(distanceCycledAsString);

        if(distanceCycled<=10.00)
        {
            cost = distanceCycled*0.07;
        }
        else
        {
            cost = 10*0.07 + (distanceCycled-10)*0.1;
        }

        JOptionPane.showMessageDialog(null,"The cyclists full name is: " + firstName + initial + lastName + "\n\nThe distance cycled is: " + distanceCycled + "km" + "\n\nThe money that is due is: " + String.format("%.02f",cost));
    }
}