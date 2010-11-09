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
    private State state;


    public enum State { RUNNING, GAMEINPUTLOOP, SYSTEMINPUTLOOP };

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

    public State state() {
        return state;
    }

    private void loadGame(String path) {
        g = new Game(path,output);
        // load a game here
    }

    private void engineStart() {
        state = State.RUNNING;
        output.add("* Welcome to the QuestForAdventure-jEngine");
        output.add("* Created by fusion2004 and acm-team");
        output.add("* QFA-jE v0.02 Alpha");
        output.add("");
    }

    private void printError() {
        output.add("* There was an error processing that command.");
    }
    private void printError(String customError) {
        if(customError == null)
            printError();
        else
            output.add(customError);
    }

    public void process(String in) {
        if(in==null || in.equalsIgnoreCase(""))
            return;
        
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

        if(!commandProcessed)
            printError();
    }

    public boolean processCommand(String command, String[] arguments) {
        if(command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("quit")) {
            output.add("* NOW EXITING THE ENGINE");
            output.flush();
            running = false;
            return true;
        } else if(command.equalsIgnoreCase("version")) {
            output.add("* QuestForAdventure-jEngine Alpha v0.02 [Dev]");
            return true;
        } else if(command.equalsIgnoreCase("loadgame")) {
            loadGame("");
            output.add("* You have loaded the game entitled \""+g.name+"\".");
            return true;
        } else if(command.equalsIgnoreCase("game")) {
            if(g==null)
                output.add("* A game has not been loaded.");
            else
                output.add("* The game entitled \""+g.name+"\" has been loaded.");
            return true;
        }

        return false;
    }


}
