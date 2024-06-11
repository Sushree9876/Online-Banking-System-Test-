
package online.banking.system;

import java.sql.*;


public class Conn {
   
    Connection c;
    Statement s;
    public Conn(){
        try{
          
           c = DriverManager.getConnection("jdbc:mysql:///onlinebankingsystem","root","SJ27@subha");
           s = c.createStatement();
           
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
   
}
