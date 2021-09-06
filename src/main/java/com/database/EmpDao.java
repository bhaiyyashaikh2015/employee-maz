package com.database;

import java.sql.*;
import java.util.*;
public class EmpDao {
	
	protected static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		// Initialize all the information regarding
		// Database Connection
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql:// localhost:3306/";
		// Database name to access
		String dbName = "employee";
		String dbUsername = "root";
		String dbPassword = "Shaikh2015@";

		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL + dbName,
													dbUsername,
													dbPassword);
		return con;
	}
	
	public static int save(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            
            PreparedStatement ps=con.prepareStatement("insert into emp1 values (?,?,?,?,?,?,?,?)");
            
            ps.setString(1,e.getId());  
            ps.setString(2,e.getFname());  
            ps.setString(3,e.getLname());  
            ps.setString(4,e.getEmail());  
            ps.setString(5,e.getPhone());
            ps.setString(6,e.getAddress());
            ps.setString(7,e.getTeam());
            ps.setString(8,e.getProject());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
	
	
    public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("update emp1 set fname=?,lname=?,email=?,phone=?, address=?, team=?, project=? where id=?");  
            ps.setString(1,e.getFname());  
            ps.setString(2,e.getLname());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getPhone());  
            ps.setString(5,e.getAddress()); 
            ps.setString(6,e.getTeam()); 
            ps.setString(7,e.getProject()); 
            
            ps.setString(8,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static int delete(String id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from emp1 where id=?");  
            ps.setString(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static Emp getEmployeeById(String id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from emp1 where id=?");  
            ps.setString(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2)); 
                e.setLname(rs.getString(3));
                e.setEmail(rs.getString(4));
                e.setPhone(rs.getString(5));  
                e.setAddress(rs.getString(6));  
                e.setTeam(rs.getString(7));
                e.setProject(rs.getString(8));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    
    
    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from emp1");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e= new Emp();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setPhone(rs.getString(5));  
                e.setAddress(rs.getString(6));
                e.setTeam(rs.getString(7));
                e.setProject(rs.getString(8));
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  
