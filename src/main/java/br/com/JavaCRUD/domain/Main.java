package br.com.JavaCRUD.domain;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {
		PlantDAO pDAO = new PlantDAO();
		BaseDAO bDAO = new BaseDAO();
		//Date test
		/*Date date = Date.valueOf("1998-05-06");
		System.out.println(date.toString());
		*/
		
		//Print what is in the Table
		
		
		/*List<Plant> plantList = pDAO.getPlants();
		
		for(int i = 0; i<plantList.size(); i++) {
			System.out.println(plantList.get(i).toString());
		}
		*/
		
		
		//Creating a Plant
		Plant pTestCreateID = new Plant();
		//long idTest = 3l;
		//pTestCreateID.setId(idTest);
		pTestCreateID.setPlants("TestID");
		
		SimpleDate simDate = new SimpleDate(2012, 01, 26);
		Date testDate = simDate.getDate();
		pTestCreateID.setDate(testDate);
		
		byte sunTest = 0;
		pTestCreateID.setSun(sunTest);
		
		pTestCreateID.setWaterTimes(9);
		pTestCreateID.setWaterUnity("a week");
		
		//Saving Plant
		/*pDAO.savePlant(pTestCreateID);
		
		plantList = pDAO.getPlants();
		for(int i = 0; i<plantList.size(); i++) {
			System.out.println(plantList.get(i).toString());
		}
		*/
		
		//Trying to save without PlantDAO
		
		//FUNCIONA!!!!!!!!!!!!
		/*Connection conn = null;
		PreparedStatement stmt = null;
		Plant p = pTestCreateID;
		
		try {
			conn = bDAO.getConnection();
			stmt = conn.prepareStatement("UPDATE garden SET plant=?, date=?, sun=?, WaterTimes=?, WaterUnity=? WHERE id=?");
			stmt.setString(1, p.getPlants());
			stmt.setDate(2, p.getDate());
			stmt.setByte(3, p.getSun());
			stmt.setInt(4, p.getWaterTimes());
			stmt.setString(5, p.getWaterUnity());
			stmt.setLong(6, p.getId());
			stmt.executeUpdate(); 
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			conn.close();
			stmt.close();
		}*/
		
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		Plant p = pTestCreateID;
		
		try {
			conn = bDAO.getConnection();
			stmt = conn.prepareStatement("INSERTO INTO garden (plant, date, sun, WaterTimes, WaterUnity) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, p.getPlants());
			stmt.setDate(2, p.getDate());
			stmt.setByte(3, p.getSun());
			stmt.setInt(4, p.getWaterTimes());
			stmt.setString(5, p.getWaterUnity());
			stmt.executeUpdate(); 
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			conn.close();
			stmt.close();
		}
		
		
		//if(p.getId()==null) {
			System.out.println(p.getId());
			
			Plant Jose = new Plant();
			System.out.println(Jose.getId());
		
	}
	
}
