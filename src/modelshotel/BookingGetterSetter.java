package modelshotel;

import java.util.Date;

public class BookingGetterSetter {
    private int booking_id;
    private String room_type;
    private Date check_in_date;
    private Date check_out_date;
    private String status;
    private int cid;
    public static int bid;
    
    
    public int getBooking_id() {
        return booking_id;
    }
    
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }
    
    public String getRoom_type() {
        return room_type;
    }
    
    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }
    
    public Date getCheck_in_date() {
        return check_in_date;
    }
    
    public void setCheck_in_date(Date check_in_date) {
        this.check_in_date = check_in_date;
    }
    
    public Date getCheck_out_date() {
        return check_out_date;
    }
    
    public void setCheck_out_date(Date check_out_date) {
        this.check_out_date = check_out_date;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public int getCID() {
    	return cid;
    }
    public void setCID(int cid) {
    	this.cid = cid;
    }


}
