package controllerhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelshotel.RegisterGetterSetter;
import modelshotel.StaffGetterSetter;

public class RegisterJDBC {
    public boolean insert(RegisterGetterSetter user) {
        boolean result = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hmdb", "root", "");
            String sql = "INSERT INTO register(Name, Email, password, Gender, Number, Country, Age, Creditcard) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstat = conn.prepareStatement(sql);
            
            pstat.setString(1, user.getName());
            pstat.setString(2, user.getEmail());
            pstat.setString(3, user.getPassword());
            pstat.setString(4, user.getGender());
            pstat.setString(5, user.getNumber());
            pstat.setString(6, user.getCountry());
            pstat.setString(7, user.getAge());
            pstat.setString(8, user.getCreditCard());
            result = pstat.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return result;
    }
    
    public static boolean login(RegisterGetterSetter log) {
        String sql = "SELECT * FROM register WHERE Email = ? AND password = ?";
        ResultSet rs;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hmdb", "root", "");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, log.getEmail());
            ps.setString(2, log.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                log.setCid(rs.getInt("cid"));
                log.setEmail(rs.getString("Email"));
                log.setPassword(rs.getString("password"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    public static boolean login1(StaffGetterSetter staff) {
        String sql = "SELECT * FROM staff WHERE Emial = ? AND password = ?";
        ResultSet rs;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hmdb", "root", "");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, staff.getEmail());
            ps.setString(2, staff.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                staff.setEmail(rs.getString("Emial"));
                staff.setPassword(rs.getString("password"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
}
