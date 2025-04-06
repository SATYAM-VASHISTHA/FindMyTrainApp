import java.time.LocalDateTime;

public class Schedule {
    private Train train;
    private Station station;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private Platform platform;

    public Schedule(Train train, Station station, LocalDateTime arrivalTime, LocalDateTime departureTime, Platform platform) {
        this.train = train;
        this.station = station;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.platform = platform;
    }

    public Train getTrain() {
        return train;
    }

    public Station getStation() {
        return station;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public Platform getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station.getStationName() +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", platform=" + platform.getPlatformNumber() +
                '}';
    }
}