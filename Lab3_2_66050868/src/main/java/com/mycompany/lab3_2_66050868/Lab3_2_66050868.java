/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3_2_66050868;

import java.util.Scanner;

/**
 *
 * @author tommi
 */
public class Lab3_2_66050868 {

    public static void main(String[] args) {
        SourceScore_2 sScore = new SourceScore_2();
        Subscriber_2 s1 = new Subscriber_2();
        Subscriber_2 s2 = new Subscriber_2();
        sScore.addPropertyChangeListener(s1);
        sScore.addPropertyChangeListener(s2);
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("Enter score");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break;
            }

            sScore.setscoreLine(input);
            
        }
        sc.close();
    }
}
