/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acm_team.games.questforadventure.entities;

/**
 *
 * @author fusion2004
 */
public class Job {
    public static Job Warrior = new Job(0.2);

    private Double strModifier;

    public Job(Double strMod) {
        this.strModifier = strMod;
    }
}
