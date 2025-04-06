import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    private Map<String, Station> stations = new HashMap<>();
    private Map<String, Train> trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStation(Station station) {
        stations.put(station.getStationID(), station);
    }

    public void addTrain(Train train) {
        trains.put(train.getTrainID(), train);
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    // Returns list of trains between two station IDs
    public List<Train> findMyTrains(String startStationID, String endStationID) {
        List<Train> result = new ArrayList<>();
        for (Schedule schedule : schedules) {
            String stationID = schedule.getStation().getStationID();
            if (stationID.equals(startStationID) || stationID.equals(endStationID)) {
                Train train = schedule.getTrain();
                if (!result.contains(train)) {
                    result.add(train);
                }
            }
        }
        return result;
    }

    // Returns full schedule for a given train ID
    public List<Schedule> getTrainSchedule(String trainID) {
        List<Schedule> result = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getTrain().getTrainID().equals(trainID)) {
                result.add(schedule);
            }
        }
        return result;
    }

    public String getStationIDByName(String stationName) {
        for (Station station : stations.values()) {
            if (station.getStationName().equalsIgnoreCase(stationName)) {
                return station.getStationID();
            }
        }
        return null;
    }
}