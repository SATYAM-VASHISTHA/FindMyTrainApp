import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {

    public static void main(String[] args) {
        TrainSystem trainSystem = new TrainSystem();

        // Creating stations
        Station station1 = new Station("ST01", "Agra");
        Station station2 = new Station("ST02", "Lucknow");

        // Creating trains
        Train train1 = new Train("45789", "Durante Express", "Express");
        Train train2 = new Train("12890", "Intercity", "Passenger");

        // Creating platforms
        Platform platform1 = new Platform("1", train1);
        Platform platform2 = new Platform("2", train2);

        // Assigning platforms to station1
        List<Platform> platformList1 = new ArrayList<>();
        platformList1.add(platform1);
        station1.setPlatformList(platformList1);

        List<Platform> platformList2 = new ArrayList<>();
        platformList2.add(platform2);
        station2.setPlatformList(platformList2);

        // Adding stations and trains to system
        trainSystem.addStation(station1);
        trainSystem.addStation(station2);
        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);

        // Creating schedules
        Schedule s1 = new Schedule(train1, station1, LocalDateTime.of(2025, 4, 7, 9, 0), LocalDateTime.of(2025, 4, 7, 9, 5), platform1);
        Schedule s2 = new Schedule(train1, station2, LocalDateTime.of(2025, 4, 7, 12, 30), LocalDateTime.of(2025, 4, 7, 12, 45), platform1);
        Schedule s3 = new Schedule(train2, station1, LocalDateTime.of(2025, 4, 7, 10, 0), LocalDateTime.of(2025, 4, 7, 10, 10), platform2);
        Schedule s4 = new Schedule(train2, station2, LocalDateTime.of(2025, 4, 7, 13, 0), LocalDateTime.of(2025, 4, 7, 13, 15), platform2);

        trainSystem.addSchedule(s1);
        trainSystem.addSchedule(s2);
        trainSystem.addSchedule(s3);
        trainSystem.addSchedule(s4);

        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Departure Station Name (e.g., Agra): ");
        String departureName = scanner.nextLine().trim();

        System.out.print("Enter Destination Station Name (e.g., Lucknow): ");
        String destinationName = scanner.nextLine().trim();

        String departureID = trainSystem.getStationIDByName(departureName);
        String destinationID = trainSystem.getStationIDByName(destinationName);

        if (departureID == null || destinationID == null) {
            System.out.println("One or both station names not found.");
            return;
        }

        List<Train> matchingTrains = trainSystem.findMyTrains(departureID, destinationID);

        if (matchingTrains.isEmpty()) {
            System.out.println("No trains found between " + departureName + " and " + destinationName);
            return;
        }

        System.out.println("\nTrains between " + departureName + " and " + destinationName + ":");
        for (int i = 0; i < matchingTrains.size(); i++) {
            System.out.println((i + 1) + ". " + matchingTrains.get(i));
        }

        System.out.print("\nEnter the Train ID to see its full schedule: ");
        String chosenTrainID = scanner.nextLine();

        List<Schedule> fullSchedule = trainSystem.getTrainSchedule(chosenTrainID);
        if (fullSchedule.isEmpty()) {
            System.out.println("No schedule found for train ID: " + chosenTrainID);
        } else {
            System.out.println("Full schedule for Train ID " + chosenTrainID + ":");
            for (Schedule schedule : fullSchedule) {
                System.out.println(schedule);
            }
        }
    }
}