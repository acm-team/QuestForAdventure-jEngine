/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acm_team.games.questforadventure.entities;

import org.acm_team.games.questforadventure.*;

/**
 *
 * @author fusion2004
 */
public class Game {
    public String name;
    private Output output;

    public Game() {
    }

    public Game(String path, Output out) {
        name = "default";
        output = out;
    }

    public boolean processCommand(String command, String[] arguments) {
        if(Main.engine.state()==Engine.State.SYSTEMINPUTLOOP)
            return false;

        if(command.equalsIgnoreCase("save")) {
            output.add("* You have attempted to save, but this function has not been implemented.");
            return true;
        }

        return false;
    }
}
