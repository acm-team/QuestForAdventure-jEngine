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
public class ConsoleOutput implements Output {
    private Queue<String> output;
    private PrintStream out;
    private String prompt;

    public ConsoleOutput() {
        output = new LinkedList<String>();
        out = System.out;
        prompt = ">";
    }

    public void add(String s) {
        output.add(s);
    }

    public boolean isEmpty() {
        return output.isEmpty();
    }

    public void flush() {
        while(!output.isEmpty()) {
            out.println(output.poll());
        }
    }

    public void printPrompt() {
        out.print(prompt+" ");
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
