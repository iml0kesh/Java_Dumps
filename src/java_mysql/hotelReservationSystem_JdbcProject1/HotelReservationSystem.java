package java_mysql.hotelReservationSystem_JdbcProject1;

import java.sql.*;
import java.util.Scanner;

public class HotelReservationSystem {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "1937";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Hotel Management System");
                System.out.println("1. Reserve a Room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("6. Exit");
                System.out.println("Choose an Option:");
                int option = sc.nextInt();

                if(option == 1){
                    System.out.println(reserveARoom(con,sc));
                } else if (option == 2) {
                    String query = "SELECT * FROM jdbc_reservation";
                    PreparedStatement pst = con.prepareStatement(query);
                    ResultSet rst = pst.executeQuery();

                    while(rst.next()){
                        int reservation_id = rst.getInt("reservation_id");
                        String guest_name = rst.getString("guest_name");
                        int room_number = rst.getInt("room_number");
                        String contact_number = rst.getString("contact_number");
                        String reservation_date = rst.getString("reservation_date");

                        System.out.println(reservation_id+" "+guest_name+" "+room_number+" "+contact_number+" "+reservation_date);
                    }
                } else if (option == 4) {
                    System.out.println("Update Menu");
                    System.out.println("1. Update Guest Name");
                    System.out.println("2. Update Room Number");
                    System.out.println("3. Update Contact Number");
                    System.out.println("4. Exit");
                    System.out.println("Choose an option: ");

                    int UpdateOption = sc.nextInt();
                    if(UpdateOption == 1) {
                        String query;
                    }
                } else {
                    break;
                }

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reserveARoom(Connection con, Scanner sc){
        try {
            String name;
            int r_no;
            String c_no;

            System.out.println("Guest Name:");
            name = sc.next();

            System.out.println("Room no:");
            r_no = sc.nextInt();

            System.out.println("Contact no:");
            c_no = sc.next();

            String query = "INSERT INTO jdbc_reservation (guest_name, room_number, contact_number) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, r_no);
            pst.setString(3, c_no);

            int rf = pst.executeUpdate();
            return rf > 0 ? "Data Inserted" : "Data Not Inserted";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

