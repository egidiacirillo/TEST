package is.gestionevideo.entity;
import java.sql.*;
import java.time.LocalDate;

import is.gestionevideo.entity.Sport;
import is.gestionevideo.entity.Video;
import is.gestionevideo.*;
import is.gestionevideo.*;
public class VideoDAO {
		public static Video create(int id, String nome, Date data, Sport sport) {
			Video v =new Video(id, nome, data, sport);
			
			Connection comm = DBManager.getConnection();
			String query ="INSERT INTO Video VALUES(?,?,?,?,?)";
			Connection conn;
			try (PreparedStatement pstmt = conn.prepareStatement(query)){
			pstmt.setInt(1, id);
		    pstmt.setString(2, nome);
			pstmt.setDate(3, data);
			pstmt.setObject(4, sport);
			pstmt.executeUpdate();
			
}
		
		v.setId(id);
		v.setNome(nome);
		v.setDate(data);
		v.setSport(sport);
		
		}

		private static void getData() {
			// TODO Auto-generated method stub
			
		}
}