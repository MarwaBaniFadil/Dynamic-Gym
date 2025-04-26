/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.new_gym;

import com.mycompany.gym.Log_in;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ELIFE STORE
 */
public class New_gym {

    public static void main(String[] args) {
          Log_in frame = new Log_in();
       frame.setVisible(true) ;
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setResizable(false) ;
    }
}
