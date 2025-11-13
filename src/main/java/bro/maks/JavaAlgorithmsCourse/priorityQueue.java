package bro.maks.JavaAlgorithmsCourse;

import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCommands = Integer.parseInt(scanner.nextLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < numCommands; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            if (parts[0].equals("Insert")) {
                int value = Integer.parseInt(parts[1]);
                maxHeap.add(value);
            } else if (parts[0].equals("ExtractMax")) {
                if (!maxHeap.isEmpty()) {
                    System.out.println(maxHeap.poll());
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
