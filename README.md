# -CPU-Scheduling-Algorithms
# ShortestJobFirst Algorithm
This Java program implements the Shortest Job First (SJF) scheduling algorithm. The program takes input from the user regarding the number of processes, their arrival time, and burst time. It then sorts the processes based on their burst time and executes them according to the SJF algorithm. The program calculates the waiting time and turnaround time for each process and displays the same along with the average waiting time and average turnaround time.

The program uses a custom class named Process to represent each process, and an ArrayList to store all the processes. It also uses a Comparator to sort the processes based on their burst time. The program keeps track of the time and the remaining time required to complete each process. It executes the process with the shortest remaining time first and updates the waiting time and turnaround time accordingly.

The output of the program displays the process ID, arrival time, burst time, waiting time, and turnaround time for each process, along with the average waiting time and average turnaround time for all the processes.

![Screenshot (18)](https://user-images.githubusercontent.com/97131465/225160936-a44ac7e5-fb84-495e-b17c-1efe4656997a.png)

# RoundRobin Algorithm
This Java program implements the Round Robin algorithm for scheduling processes in an operating system. The user is prompted to enter the number of processes and the time quantum for the algorithm. The arrival time and burst time for each process are also entered by the user. The program then sorts the processes based on their arrival time and begins executing them in a round-robin fashion.

The program keeps track of the remaining time for each process and the total waiting time and turnaround time for all processes. Once a process completes, its waiting time and turnaround time are calculated and added to the totals. The program then displays the results, including the waiting time and turnaround time for each process, as well as the average waiting time and average turnaround time for all processes.

![Screenshot (19)](https://user-images.githubusercontent.com/97131465/225161834-1aea5b59-bfcf-4f6c-813b-f85e4e6fc6b9.png)
