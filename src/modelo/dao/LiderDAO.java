package modelo.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.LoginAdm;



public class LiderDAO {
    
    public void recrutarLider(LoginAdm h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO loginadm(user,password,nomelider,racalider)VALUES(?,?,?,?)");
            stmt.setString(1,h.getUser());
            stmt.setString(2,h.getPassword());
            stmt.setString(3,h.getNomelider());
            stmt.setString(4,h.getRacalider());            
                      
            
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Lidere com a sabedoria de muitas cores!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao definir Líder: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public void banirLider(LoginAdm h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM loginadm WHERE idadm = ?");
            stmt.setInt(1, h.getId());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Que líder que nada, direto pra cova!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Líder resistente: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void atualizarLider(LoginAdm h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE loginadm SET user = ? , password = ? , nomelider = ? , racalider = ? WHERE idadm = ?");
            stmt.setString(1,h.getUser());
            stmt.setString(2,h.getPassword());
            stmt.setString(3,h.getNomelider());
            stmt.setString(4,h.getRacalider());          
            stmt.setInt(5,h.getId());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Pense num chefão aprimorado!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Esse chefe aí tem rédeas de burro em? -> "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    
    public List<LoginAdm> lerLider() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<LoginAdm> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginadm");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                LoginAdm inf = new LoginAdm();
                
                inf.setId(rs.getInt("idadm"));    
                inf.setUser(rs.getString("user"));
                inf.setPassword(rs.getString("password"));
                inf.setNomelider(rs.getString("nomelider"));
                inf.setRacalider(rs.getString("racalider"));               
                                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
}
