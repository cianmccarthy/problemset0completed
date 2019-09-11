import javax.swing.*;

public class problemset0Q3 {
    public static void main(String[] args) {

        String name, taxableIncomeAsString;
        double taxableIncome, taxDue;
        int taxRate;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        taxableIncomeAsString = JOptionPane.showInputDialog("Please enter your taxable income: ");
        taxableIncome = Double.parseDouble(taxableIncomeAsString);

        if(taxableIncome <= 20000) {
           taxRate = 0;
          taxDue = taxableIncome*0;
        }

        else if (taxableIncome >= 20000.01 &&taxableIncome <= 36000.00)
        {
            taxRate = 20;
            taxDue = taxableIncome*0.20;
        }

        else
        {
            taxRate = 41;
            taxDue = taxableIncome* 0.41;
        }

        JOptionPane.showMessageDialog(null,"The Tax Rate is: " + taxRate + "The Tax is: " + taxDue);




  }
}