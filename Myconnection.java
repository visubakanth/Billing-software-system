
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
public class Myconnection {
    public static Connection getConnection()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/textiles","root","visu2001");
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
