package controllerhotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import modelshotel.BookingGetterSetter;

public class BookingJDBC {
    public boolean insert(BookingGetterSetter booking) {
        boolean result = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hmdb", "root", "");
            String sql = "INSERT INTO bookings(Roomtype, checkindate, checkoutdate, status, custid)"
                    + " VALUES (?, ?, ?, 'pending', ?)";

            PreparedStatement pstat = conn.prepareStatement(sql);

            pstat.setString(1, booking.getRoom_type());
            java.util.Date utilCheckInDate = booking.getCheck_in_date();
            java.sql.Date sqlCheckInDate = new java.sql.Date(utilCheckInDate.getTime());
            pstat.setDate(2, sqlCheckInDate);
            java.util.Date utilCheckOutDate = booking.getCheck_out_date();
            java.sql.Date sqlCheckOutDate = new java.sql.Date(utilCheckOutDate.getTime());
            pstat.setDate(3, sqlCheckOutDate);
            pstat.setInt(4, booking.getCID());

            result = pstat.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return result;
    }
    
    public void delete(JTextField bidField) {
        String bookingId = bidField.getText(); // Retrieve the booking_id value from the bidField text field
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmdb", "root", "");
            String strSql = "DELETE FROM bookings WHERE bid=?";
            PreparedStatement pstat = conn.prepareStatement(strSql);
            pstat.setString(1, bookingId); // Set the booking_id value as a string parameter
            pstat.executeUpdate();
            conn.close();
            System.out.println("Record deleted!");
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
    
    public void assign(int bid) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmdb", "root", "");
            String strSql = "UPDATE bookings SET status = 'booked' WHERE bid=?";
            
            PreparedStatement pstat = conn.prepareStatement(strSql);
            pstat.setInt(1, bid);
 
          
            pstat.executeUpdate();
            conn.close();
            System.out.println("Record updated!");
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    	
    	
    	
    	
    }
    
    public static void update(JTextField bidField, JDateChooser checkinField, JDateChooser checkoutDateChooser, JComboBox<String> roomoption) {
        String bookingId = bidField.getText();
        java.util.Date checkInDate = checkinField.getDate();
        java.util.Date checkOutDate = checkoutDateChooser.getDate();
        String roomType = null;
        Object selectedItem = roomoption.getSelectedItem();
        if (selectedItem != null) {
            roomType = selectedItem.toString();
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmdb", "root", "");
            String strSql = "UPDATE bookings SET checkindate=?, checkoutdate=?, Roomtype=? WHERE bid=?";
            PreparedStatement pstat = conn.prepareStatement(strSql);
            pstat.setString(4, bookingId);
            pstat.setDate(1, new java.sql.Date(checkInDate.getTime()));
            pstat.setString(3, roomType);
            pstat.setDate(2, new java.sql.Date(checkOutDate.getTime()));
            pstat.executeUpdate();
            conn.close();
            System.out.println("Record updated!");
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }}
