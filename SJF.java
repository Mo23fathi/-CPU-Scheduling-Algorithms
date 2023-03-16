
import java.util.*;

public class ShortestJobFirst {
   static int totalWT = 0;
   static int totalTT = 0;
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of processes: ");
      int n = sc.nextInt();

      List<Process> processes = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         System.out.printf("Enter arrival time for process %d: ", i + 1);
         int at = sc.nextInt();
         System.out.printf("Enter burst time for process %d: ", i + 1);
         int bt = sc.nextInt();
         processes.add(new Process(i + 1, at, bt));
      }

      Collections.sort(processes, new Comparator<Process>() {
         @Override
         public int compare(Process p1, Process p2) {
            return Integer.compare(p1.bt, p2.bt);
         }
      });

      int time = 0;
      int completed = 0;
      int[] remainingTime = new int[n];
      for (int i = 0; i < n; i++) {
         remainingTime[i] = processes.get(i).bt;
      }

      while (completed < n) {
         int shortestJob = -1;
         for (int i = 0; i < n; i++) {
            if (remainingTime[i] > 0 && processes.get(i).at <= time) {
               if (shortestJob == -1 || remainingTime[i] < remainingTime[shortestJob]) {
                  shortestJob = i;
               }
            }
         }
         if (shortestJob == -1) {
            time++;
            continue;
         }
         time += remainingTime[shortestJob];
         processes.get(shortestJob).tt = time;
         processes.get(shortestJob).wt = processes.get(shortestJob).tt - processes.get(shortestJob).bt - processes.get(shortestJob).at;
         totalWT += processes.get(shortestJob).wt;
         totalTT += processes.get(shortestJob).tt;
         remainingTime[shortestJob] = 0;
         completed++;
      }

      double avgWaitingTime = (double) totalWT / n;
      double avgTurnaroundTime = (double) totalTT / n;

      System.out.printf("%-10s%-10s%-10s%s%n", "Process", "AT", "BT", "WT","TT");
      for (Process p : processes) {
         System.out.printf("%-10d%-10d%-10d%-10d%d%n", p.pid, p.at, p.bt, p.wt, p.tt);
      }
      System.out.println("\nAverage waiting time: " + avgWaitingTime);
      System.out.println("Average turnaround time: " + avgTurnaroundTime);
   }
}
