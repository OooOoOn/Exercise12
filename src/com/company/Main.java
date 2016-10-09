package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

                float openingFee = 0.6f;
                float dayFare = 2.5f;
                float eveningFare = 0.6f;
                float cost = 0;

                float minutes = Float.parseFloat(JOptionPane.showInputDialog(null, "How many minutes did you talk for?"));
                float reply = (float)JOptionPane.showConfirmDialog(null, "Did you talk during the day?");

        if(reply == 0)
        {
            cost = minutes * dayFare + openingFee;
        }
        else
        {
            cost = minutes * eveningFare + openingFee;
        }

        JOptionPane.showMessageDialog(null, "The total cost for this call is: " + cost);

        if(minutes >= 60)
        {
            cost = cost * 0.9f;
            JOptionPane.showMessageDialog(null, "You have received a 10% discount since your call lasted longer than 60 minutes. \nNew cost:" + cost);
        }


            }
}
