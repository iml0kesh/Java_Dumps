package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String userid;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}