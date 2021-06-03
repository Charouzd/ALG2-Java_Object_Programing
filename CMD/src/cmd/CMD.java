/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filip Charouzd
 */
public class CMD {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CommandLine cmd = new CommandLine();
        String command;
        do{
            System.out.print(cmd.getActualDir() + "# ");
            command = sc.nextLine();
            try {
                System.out.println(cmd.parseAndExecute(command));
                //} while(!command.equals("end"));
            } catch (IOException ex) {
                System.out.println("Error 505 file is un readable");
            }
        } while(!cmd.isEnd());
    }
    }
    

