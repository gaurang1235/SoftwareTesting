package org.example;

import java.util.*;

public class OSMethods {

    static void findWaitingTime(int processes[], int n,
                                int bt[], int wt[]) {
        // waiting time for first process is 0
        wt[0] = 0;

        // calculating waiting time
        for (int i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }

    // Function to calculate turn around time
    static void findTurnAroundTime(int processes[], int n,
                                   int bt[], int wt[], int tat[]) {
        // calculating turnaround time by adding
        // bt[i] + wt[i]
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }

    //Function to calculate average time
    static void findavgTime(int processes[], int n, int bt[]) {
        if(processes.length==0) return ;
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        //Function to find waiting time of all processes
        findWaitingTime(processes, n, bt, wt);

        //Function to find turn around time for all processes
        findTurnAroundTime(processes, n, bt, wt, tat);

        //Display processes along with all details
        System.out.printf("Processes Burst time Waiting"
                +" time Turn around time\n");

        // Calculate total waiting time and total turn
        // around time
        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.printf(" %d ", (i + 1));
            System.out.printf("     %d ", bt[i]);
            System.out.printf("     %d", wt[i]);
            System.out.printf("     %d\n", tat[i]);
        }
        float s = (float)total_wt /(float) n;
        int t = total_tat / n;
        System.out.printf("Average waiting time = %f", s);
        System.out.printf("\n");
        System.out.printf("Average turn around time = %d ", t);
    }





    // create findNeedValue() method to calculate the need of each process
    static void findNeedValue(int needArray[][], int maxArray[][], int allocationArray[][], int totalProcess, int totalResources)
    {
        // use nested for loop to calculate Need for each process
        for (int i = 0 ; i < totalProcess ; i++){    // for each process
            for (int j = 0 ; j < totalResources ; j++){  //for each resource
                needArray[i][j] = maxArray[i][j] - allocationArray[i][j];
            }
        }
    }

    // create checkSafeSystem() method to determine whether the system is in safe state or not
    static boolean checkSafeSystem(int processes[], int availableArray[], int maxArray[][], int allocationArray[][], int totalProcess, int totalResources)
    {
        int [][]needArray = new int[totalProcess][totalResources];

        // call findNeedValue() method to calculate needArray
        findNeedValue(needArray, maxArray, allocationArray, totalProcess, totalResources);

        // all the process should be infinished in starting
        boolean []finishProcesses = new boolean[totalProcess];

        // initialize safeSequenceArray that store safe sequenced
        int []safeSequenceArray = new int[totalProcess];

        // initialize workArray as a copy of the available resources
        int []workArray = new int[totalResources];

        for (int i = 0; i < totalResources ; i++)    //use for loop to copy each available resource in the workArray
            workArray[i] = availableArray[i];

        // initialize counter variable whose value will be 0 when the system is not in the safe state or when all the processes are not finished.
        int counter = 0;

        // use loop to iterate the statements until all the processes are not finished
        while (counter < totalProcess)
        {
            // find infinished process which needs can be satisfied with the current work resource.
            boolean foundSafeSystem = false;
            for (int m = 0; m < totalProcess; m++)
            {
                if (finishProcesses[m] == false)        // when process is not finished
                {
                    int j;

                    //use for loop to check whether the need of each process for all the resources is less than the work
                    for (j = 0; j < totalResources; j++)
                        if (needArray[m][j] > workArray[j])      //check need of current resource for current process with work
                            break;

                    // the value of J and totalResources will be equal when all the needs of current process are satisfied
                    if (j == totalResources)
                    {
                        for (int k = 0 ; k < totalResources ; k++)
                            workArray[k] += allocationArray[m][k];

                        // add current process in the safeSequenceArray
                        safeSequenceArray[counter++] = m;

                        // make this process finished
                        finishProcesses[m] = true;

                        foundSafeSystem = true;
                    }
                }
            }

            // the system will not be in the safe state when the value of the foundSafeSystem is false
            if (foundSafeSystem == false)
            {
                System.out.print("The system is not in the safe state because lack of resources");
                return false;
            }
        }

        // print the safe sequence
        System.out.print("The system is in safe sequence and the sequence is as follows: ");
        for (int i = 0; i < totalProcess ; i++)
            System.out.print("P"+safeSequenceArray[i] + " ");

        return true;
    }


    public static void fcfs(int[] at, int[] bt) {
        List<Process> processes = new ArrayList<>();
        for (int i = 0; i < at.length; i++) {

            int arrivalTime = at[i];

            int burstTime = bt[i];

            processes.add(new Process(i, arrivalTime, burstTime));
        }

        firstComeFirstServe(processes);
    }

    public static void firstComeFirstServe(List<Process> processes) {
        int currentTime = 0;

        for (Process process : processes) {
            if (process.arrivalTime > currentTime) {
                currentTime = process.arrivalTime;
            }

            System.out.println("Time " + currentTime + ": Running Process " + process.id);
            currentTime += process.burstTime;
            System.out.println("Time " + currentTime + ": Process " + process.id + " completed");
        }
    }


}
