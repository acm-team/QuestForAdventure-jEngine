/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acm_team.games.questforadventure.entities;

import java.util.*;

/**
 *
 * @author fusion2004
 */
public class Player {
    private String name;
    private Integer level;
    private Job job;
    private Map<String,Double> stats;

    public Player(String name, Job job) {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Double getStat(String s) {
        return stats.get(s);
    }
    
}
