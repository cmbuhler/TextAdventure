package com.chasesspace.adventure.engine;

public interface Command {
    String getName();
    void execute(String[] args);
    String getDescription();
}
