
package modelo.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginHordaDAO {
    
    public boolean checagemLoginHorda(String login, String senha) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginhorda WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                 check = true;              
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginHordaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
    public boolean checagemRegiaoHorda(String orthanc) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginhorda WHERE regiaohorda = Orthanc ");
            stmt.setString(1, orthanc);            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                 check = true;              
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginHordaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
}
