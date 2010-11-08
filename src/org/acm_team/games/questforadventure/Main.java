/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acm_team.games.questforadventure;

import java.io.*;
import java.util.*;

/**
 *
 * @author fusion2004
 */
public class Main {

    public void update() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // init
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Command c = new Command();
        //FileDialog fail = new FileDialog(null);

        // welcome player
        

        Engine engine = new Engine();
        String in;

       /*
        * MAIN CONTROL LOOP
        */
        while(engine.running()) {
            engine.flushOutput();

            engine.printPrompt();
            in = br.readLine();

            engine.process(in);
        }


        


        /*
        System.out.print("> ");
        String lol = br.readLine();
        System.out.println("out: "+lol);
        // load game
        //JFileChooser fc = new JFileChooser();
        //fc.showOpenDialog(fc);
        System.out.println("* Loading game.xml ...");
        // init game
        //out.add(" . . . A new adventurer approaches the town of Quel'sara . . .");
        //out.add("As the player comes near, a town greeter appears from somewhere just out of sight and waves the player over.");
        //out.add("\"Welcome to the town of Quel'sara, friend! ... I'm sorry, I seem to be getting a bit old for this; be you a lad or a lass?\"");
         */
    }

}
