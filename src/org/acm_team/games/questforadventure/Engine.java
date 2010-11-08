/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acm_team.games.questforadventure;

import java.util.*;
import java.io.*;
import org.acm_team.games.questforadventure.entities.*;

/**
 *
 * @author fusion2004
 */
public class Engine {
    private Player p;
    private Game g;
    private Output output;
    private boolean running;

    private StringTokenizer st;
    private String command;

    public Engine() {
        running = true;
        output = new ConsoleOutput();
        engineStart();
    }

    // I/O
    public void flushOutput() {
        output.flush();;
    }

    public void printPrompt() {
        output.printPrompt();;
    }

    public boolean running() {
        return running;
    }

    private void loadGame(String path) {
        g = new Game(path,output);
        // load a game here
    }

    private void engineStart() {
        output.add("* Welcome to the QuestForAdventure Engine");
        output.add("* Created by fusion2004 and acm-team");
        output.add("* QFA-E v0.02 Alpha");
        output.add("");
    }


    public void process(String in) {
        st = new StringTokenizer(in);
        
        if(st.hasMoreTokens())
            command = st.nextToken();
        else
            return;
        
        String[] arguments = new String[st.countTokens()];
        for(int i=0; i<arguments.length; i++)
            arguments[i] = st.nextToken();

        boolean commandProcessed = false;
        if(g != null)
            commandProcessed = g.processCommand(command,arguments);

        if(!commandProcessed)
            commandProcessed = this.processCommand(command,arguments);

    }

    public boolean processCommand(String command, String[] arguments) {
        if(command.equalsIgnoreCase("exit")) {
            output.add("* NOW EXITING THE ENGINE");
            output.flush();
            running = false;
            return true;
        }
        return false;
    }


}
