package org.example.Models;

public class Process {
    public int id;
    public int arrivalTime;
    public int burstTime;

    public Process(int id, int arrivalTime, int burstTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}
