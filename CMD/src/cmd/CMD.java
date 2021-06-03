/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd;

import java.util.Scanner;

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
            System.out.println(cmd.parseAndExecute(command));
        //} while(!command.equals("exit"));
        } while(!cmd.isEnd());
    }
    }
    

