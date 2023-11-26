package org.example;

import org.junit.Test;
import org.junit.jupiter.api.condition.OS;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class OSMethodsTest {

    @Test
    public void testFindAvgTimeWithValidInput() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, 3, 8};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }


    @Test
    public void testFindAvgTimeWithEmptyInput() {
        int[] processes = {};
        int[] burstTimes = {};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithOneProcess() {
        int[] processes = {1};
        int[] burstTimes = {5};
        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithNegativeBurstTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, -3, 8};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithZeroBurstTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, 0, 8};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithLargeInput() {
        int[] processes = new int[1000];
        int[] burstTimes = new int[1000];
        for (int i = 0; i < 1000; i++) {
            processes[i] = i + 1;
            burstTimes[i] = i + 5;
        }

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithProcessHavingZeroBurstTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, 0, 8};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }


    @Test
    public void testSafeSequenceWithSafeSystem() {
        int totalProcess = 5;
        int totalResources = 3;

        int[] processes = {0, 1, 2, 3, 4};
        int[] availableArray = {3, 3, 2};

        int[][] maxArray = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2},
                {2, 2, 2},
                {4, 3, 3}
        };

        int[][] allocationArray = {
                {0, 1, 0},
                {2, 0, 0},
                {3, 0, 2},
                {2, 1, 1},
                {0, 0, 2}
        };

        assertTrue(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }

    @Test
    public void testSafeSequenceWithUnsafeSystem() {
        int totalProcess = 3;
        int totalResources = 3;

        int[] processes = {0, 1, 2};
        int[] availableArray = {3, 3, 2};

        int[][] maxArray = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2}
        };

        int[][] allocationArray = {
                {0, 1, 0},
                {2, 0, 0},
                {3, 0, 2}
        };

        assertFalse(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }

    @Test
    public void testSafeSequenceWithEmptySystem() {
        int totalProcess = 0;
        int totalResources = 0;

        int[] processes = {};
        int[] availableArray = {};
        int[][] maxArray = {};
        int[][] allocationArray = {};

        assertTrue(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }

    @Test
    public void testSafeSequenceWithSingleProcess() {
        int totalProcess = 1;
        int totalResources = 1;

        int[] processes = {0};
        int[] availableArray = {1};
        int[][] maxArray = {{1}};
        int[][] allocationArray = {{0}};

        assertTrue(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }

    @Test
    public void testSafeSequenceWithInsufficientResources() {
        int totalProcess = 3;
        int totalResources = 3;

        int[] processes = {0, 1, 2};
        int[] availableArray = {1, 1, 1};

        int[][] maxArray = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2}
        };

        int[][] allocationArray = {
                {0, 1, 0},
                {2, 0, 0},
                {3, 0, 2}
        };

        assertFalse(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }

    @Test
    public void testSafeSequenceWithSingleResource() {
        int totalProcess = 3;
        int totalResources = 1;

        int[] processes = {0, 1, 2};
        int[] availableArray = {1};

        int[][] maxArray = {
                {7},
                {3},
                {9}
        };

        int[][] allocationArray = {
                {0},
                {1},
                {0}
        };

        assertFalse(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }



    @Test
    public void testFindAvgTimeWithEqualBurstTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, 5, 5};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithRandomBurstTime() {
        int[] processes = {1, 2, 3, 4};
        int[] burstTimes = {10, 3, 7, 5};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithLargeBurstTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {100, 200, 150};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }



    @Test
    public void testSafeSequenceWithAlreadySafeSystem() {
        int totalProcess = 3;
        int totalResources = 3;

        int[] processes = {0, 1, 2};
        int[] availableArray = {3, 3, 2};

        int[][] maxArray = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2}
        };

        int[][] allocationArray = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        assertFalse(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }

    @Test
    public void testSafeSequenceWithInsufficientResourcesForAllProcesses() {
        int totalProcess = 3;
        int totalResources = 3;

        int[] processes = {0, 1, 2};
        int[] availableArray = {1, 1, 1};

        int[][] maxArray = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2}
        };

        int[][] allocationArray = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        assertFalse(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }

    @Test
    public void testFindAvgTimeWithNegativeWaitingTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, 3, 8};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithZeroWaitingTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, 3, 8};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }

    @Test
    public void testFindAvgTimeWithEqualBurstAndWaitingTime() {
        int[] processes = {1, 2, 3};
        int[] burstTimes = {5, 5, 5};

        assertDoesNotThrow(() -> OSMethods.findavgTime(processes, processes.length, burstTimes));
    }


    @Test
    public void testSafeSequenceWithProcessesRequiringMoreResources() {
        int totalProcess = 3;
        int totalResources = 3;

        int[] processes = {0, 1, 2};
        int[] availableArray = {1, 1, 1};

        int[][] maxArray = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2}
        };

        int[][] allocationArray = {
                {2, 1, 0},
                {0, 2, 0},
                {0, 0, 2}
        };

        assertFalse(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }



    @Test
    public void testSafeSequenceWithSingleProcessAndSingleResource() {
        int totalProcess = 1;
        int totalResources = 1;

        int[] processes = {0};
        int[] availableArray = {1};

        int[][] maxArray = {{1}};
        int[][] allocationArray = {{0}};

        assertTrue(OSMethods.checkSafeSystem(processes, availableArray, maxArray, allocationArray, totalProcess, totalResources));
    }



    @Test
    public void testFCFSWithValidInput() {
        int[] arrivalTimes = {0, 2, 4, 6};
        int[] burstTimes = {3, 5, 2, 7};

        assertDoesNotThrow(() -> OSMethods.fcfs(arrivalTimes, burstTimes));
    }

    @Test
    public void testFCFSWithEmptyInput() {
        int[] arrivalTimes = {};
        int[] burstTimes = {};

        assertDoesNotThrow(() -> OSMethods.fcfs(arrivalTimes, burstTimes));
    }

    @Test
    public void testFCFSWithSingleProcess() {
        int[] arrivalTimes = {0};
        int[] burstTimes = {5};

        assertDoesNotThrow(() -> OSMethods.fcfs(arrivalTimes, burstTimes));
    }

    @Test
    public void testFCFSWithProcessesArrivingLater() {
        int[] arrivalTimes = {5, 8, 12};
        int[] burstTimes = {3, 5, 2};

        assertDoesNotThrow(() -> OSMethods.fcfs(arrivalTimes, burstTimes));
    }

    @Test
    public void testFCFSWithProcessesHavingSameArrivalTime() {
        int[] arrivalTimes = {2, 2, 2};
        int[] burstTimes = {3, 5, 2};

        assertDoesNotThrow(() -> OSMethods.fcfs(arrivalTimes, burstTimes));
    }

    @Test
    public void testFCFSWithZeroBurstTime() {
        int[] arrivalTimes = {0, 2, 4, 6};
        int[] burstTimes = {0, 0, 0, 0};

        assertDoesNotThrow(() -> OSMethods.fcfs(arrivalTimes, burstTimes));
    }

    @Test
    public void testFirstComeFirstServeWithValidProcesses() {
        List<Process> processes = Arrays.asList(
                new Process(1, 0, 3),
                new Process(2, 2, 5),
                new Process(3, 4, 2),
                new Process(4, 6, 7)
        );

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        OSMethods.firstComeFirstServe(processes);

        assertEquals("Time 0: Running Process 1\n" +
                "Time 3: Process 1 completed\n" +
                "Time 3: Running Process 2\n" +
                "Time 8: Process 2 completed\n" +
                "Time 8: Running Process 3\n" +
                "Time 10: Process 3 completed\n" +
                "Time 10: Running Process 4\n" +
                "Time 17: Process 4 completed\n", outContent.toString());
    }

}
