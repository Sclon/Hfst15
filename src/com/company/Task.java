package com.company;

public class Task implements Comparable<Task>{
    private int priority;
    private String description;

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task o) {
        if (o.priority == priority) {
            return 0;
        } else if (o.priority < priority) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Task: " + description + "\nPriority: " + priority;
    }
}
