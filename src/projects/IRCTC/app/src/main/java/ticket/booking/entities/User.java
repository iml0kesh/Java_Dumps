package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public User(){}

    public User(String name, String password, String hashPassword, List<Ticket> ticketsBooked, String userId) {
        this.name = name;
        this.password = password;
        this.hashPassword = hashPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
    }


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getHashPassword() {
        return hashPassword;
    }
    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public String getUserId() {
        return userId;
    }

    public void printTickets() {
        for(int i=0; i<ticketsBooked.size(); i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }
}