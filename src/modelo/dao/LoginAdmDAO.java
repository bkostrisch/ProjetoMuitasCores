
package modelo.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginAdmDAO {
    
    public boolean checagemLogin(String user, String password) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginadm WHERE user = ? and password = ?");
            stmt.setString(1, user);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                 check = true;              
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdmDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
}
