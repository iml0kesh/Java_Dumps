package ticket.booking.entities;


import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, String> stationTimes;
    private List<String> station;

    public Train(Map<String, String> stationTimes, List<List<Integer>> seats, String trainNo, String trainId, List<String> station) {
        this.stationTimes = stationTimes;
        this.seats = seats;
        this.trainNo = trainNo;
        this.trainId = trainId;
        this.station = station;
    }

    public List<String> getStation() {
        return station;
    }

    public void setStation(List<String> station) {
        this.station = station;
    }

    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public void setStationTimes(Map<String, String> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
}
