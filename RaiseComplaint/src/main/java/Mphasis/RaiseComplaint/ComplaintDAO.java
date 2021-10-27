package Mphasis.RaiseComplaint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComplaintDAO {
	Connection connection;
	PreparedStatement pst;

	public String AddComplaints(Complaint complaint) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Complaint(ComplaintID,ComplaintType,CDescription,ComplaintDate,Severity,Status) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, complaint.getcid());
		pst.setString(2, complaint.getComplaintType());
		pst.setString(3, complaint.getCDescription());
		pst.setString(4, complaint.getComplaintDate());
		pst.setString(5, complaint.getSeverity());
		pst.setInt(6, complaint.getStatus());
		pst.executeUpdate();
		return "Record Inserted...";
	}
}
