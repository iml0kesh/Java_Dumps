package ticket.booking.services;

import ticket.booking.entities.User;

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
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
        
    }

    public Boolean loginUser() {
        Optional<User> foundUser = userList.stream().filter(loggedUser -> {
            return loggedUser.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),)
        })
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
}
