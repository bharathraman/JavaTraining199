package com.Library.LibraryManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {
Connection connection;
PreparedStatement pst;
	public Library searchBook(int id) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Book where id=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		Library library = null;
		if (rs.next()) {
			library = new Library();
			library.setid(rs.getInt("id"));
			library.setName(rs.getString("name"));
//			library.setGender(rs.getString("gender"));
//			library.setDept(rs.getString("dept"));
//			library.setDesig(rs.getString("desig"));
		}
		return library;
	}
	
}
