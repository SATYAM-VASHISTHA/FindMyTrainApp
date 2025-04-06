public class Platform {
    private String platformNumber;
    private Train train;

    public Platform(String platformNumber, Train train) {
        this.platformNumber = platformNumber;
        this.train = train;
    }

    public String getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformNumber='" + platformNumber + '\'' +
                ", train=" + train +
                '}';
    }
}