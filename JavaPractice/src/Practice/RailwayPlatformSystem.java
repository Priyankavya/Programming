package Practice;

import java.util.*;

class Train {
    String id;
    int arrival;
    int departure;
    Set<String> days;

    public Train(String id, String arrival, String departure, String... days) {
        this.id = id;
        this.arrival = convertToMinutes(arrival);
        this.departure = convertToMinutes(departure);
        this.days = new HashSet<>(Arrays.asList(days));
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}

public class RailwayPlatformSystem {

    public static int findMinPlatforms(List<Train> trains) {

        int n = trains.size();

        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = trains.get(i).arrival;
            dep[i] = trains.get(i).departure;
        }

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformNeeded = 0, maxPlatforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {

            if (arr[i] < dep[j]) {   // overlap
                platformNeeded++;
                i++;
            } else {                 // departure first
                platformNeeded--;
                j++;
            }

            maxPlatforms = Math.max(maxPlatforms, platformNeeded);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {

        List<Train> trains = new ArrayList<>();

        // Test Case 6
        trains.add(new Train("T1", "09:00", "12:00", "Daily"));
        trains.add(new Train("T2", "09:00", "12:00", "Daily"));
        trains.add(new Train("T3", "09:00", "12:00", "Daily"));
        trains.add(new Train("T4", "09:00", "12:00", "Daily"));

        int result = findMinPlatforms(trains);

        System.out.println("Minimum Platforms Required: " + result);
    }
}