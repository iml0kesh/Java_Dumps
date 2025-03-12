package ticket.booking.services;

import ticket.booking.entities.Train;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBookingService {

    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localDb/Users.json";

    public UserBookingService(User loggedUser) throws IOException {
        this.user = loggedUser;
        loadUsers();        
    }

    public UserBookingService() throws IOException {
        loadUsers();
    }

    public List<User> loadUsers() throws IOException {
        File users = new File(USERS_PATH);
        return objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean loginUser() {
        Optional<User> foundUser = userList.stream().filter(loggedUser -> {
            return loggedUser.getName().equalsIgnoreCase(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),loggedUser.getHashPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User loggedUser) {
        try {
            userList.add(loggedUser);
            saveUserListToFile();
            return Boolean.TRUE;
        } catch (IOException e){
            return Boolean.FALSE;
        }
    }

    // Saving to JSON
    private void saveUserListToFile() throws IOException {
        File usersFile = new File(USERS_PATH);
        objectMapper.writeValue(usersFile, userList);
    }

    // JSON --> Object (User) --> Deserialize
    // Object (User) --> Json --> Serialize

    public void fetchBooking() {
        user.printTickets();
    }

    // Cancel Booking
    public Boolean cancelBooking(String ticketId) {
        if(ticketId == null || ticketId.isEmpty()){
            System.out.println("Ticket ID cannot be null or empty.");
            return Boolean.FALSE;
        }

        boolean removed = user.getTicketsBooked().removeIf(Ticket -> Ticket.getTicketId().equals(ticketId));
        removed ? "Booking Cancled with ID" + ticketId : "No Booking with that id" + ticketId;
    }

    public List<Train> getTrains(String src, String dest) {
        
    }
}
