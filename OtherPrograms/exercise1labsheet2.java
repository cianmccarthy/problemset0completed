import javax.swing.JOptionPane;

public class Exercise1 {
    public static void main(String[] args) {

        double exchangeRate, value, finalValue=0;
        int counter = 0;
        String exchangeRateAsString, valueAsString;


        String choice = JOptionPane.showInputDialog("S>E, or E>S");
        exchangeRateAsString = JOptionPane.showInputDialog("Please enter the exchange rate: ");
        exchangeRate = Double.parseDouble(exchangeRateAsString);

        valueAsString = JOptionPane.showInputDialog("Please enter a value: ");
        value = Double.parseDouble(valueAsString);

        while (value!=0) {
            if (choice.equals("StoE")) {

                double result = convert(value, exchangeRate);
                JOptionPane.showMessageDialog(null, "Equivalent sterling amount is: " + (String.format("%.2f",result)));
            } //

            else {
                double result = convert(value, exchangeRate);
                JOptionPane.showMessageDialog(null, "Equivalent Euro amount is: " + (String.format("%.2f",result)));


            } //end else

            valueAsString = JOptionPane.showInputDialog("Please enter a value: ");
            value = Double.parseDouble(valueAsString);


        }

        JOptionPane.showMessageDialog(null, "Equivalent Euro amount is: " + );

    }//end main

    public static double convert(double value,double rate){
        double finalValue = rate*value;
        return finalValue;
    } //end convert

} // end class
