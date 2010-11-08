/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acm_team.games.questforadventure;

/**
 *
 * @author fusion2004
 */
public interface Output {
    void add(String s);
    boolean isEmpty();
    void flush();
    void printPrompt();
    void setPrompt(String prompt);
}
