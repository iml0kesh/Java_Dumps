package ticket.booking.services;

import java.util.List;

import ticket.booking.entities.Train;

public class TrainService {
    public List<Train> searchTrains(String src, String dest) {
        return trainList.stream().filter(train -> validTrain(train, src, dest)).collect()
    }
}
