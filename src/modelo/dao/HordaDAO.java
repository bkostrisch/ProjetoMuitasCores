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
import modelo.bean.LoginHorda;


public class HordaDAO {
    
    public void recrutar(LoginHorda h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO loginhorda(login,senha,nomehorda,racahorda,regiaohorda,ordenshorda,statushorda)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1,h.getLogin());
            stmt.setString(2,h.getSenha());
            stmt.setString(3,h.getNomehorda());
            stmt.setString(4,h.getRacahorda());            
            stmt.setString(5,h.getRegiaohorda());           
            stmt.setString(6,h.getOrdenshorda());           
            stmt.setString(7,h.getStatus());           
                      
            
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Bem-vindo à Horda de Saruman!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ingressar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void ordenar(LoginHorda l) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE loginhorda SET ordenshorda = ? , statushorda = ? WHERE regiaohorda = ?");                        
            stmt.setString(1, l.getOrdenshorda());           
            stmt.setString(2, l.getStatus());  
            stmt.setString(3, l.getRegiaohorda());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Ótima estratégia, Senhor!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Talvez seja melhor repensar um pouco : "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }  
    
    
    public void status(LoginHorda l) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE loginhorda SET ordenshorda = ? , statushorda = ? WHERE regiaohorda = ?");                        
            stmt.setString(1, l.getOrdenshorda());           
            stmt.setString(2, l.getStatus());  
            stmt.setString(3, l.getRegiaohorda());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Saruman ficará sabendo!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tem certeza de que fez certo? "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    
    public void banir(LoginHorda h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM loginhorda WHERE idhorda = ?");
            stmt.setInt(1, h.getIdhorda());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Lacaio para o abismo!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lacaio teimoso: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void atualizar(LoginHorda h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE loginhorda SET login = ? , senha = ? , nomehorda = ? , racahorda = ? , regiaohorda = ? WHERE idhorda = ?");
            stmt.setString(1,h.getLogin());
            stmt.setString(2,h.getSenha());
            stmt.setString(3,h.getNomehorda());
            stmt.setString(4,h.getRacahorda());            
            stmt.setString(5,h.getRegiaohorda());
            stmt.setInt(6,h.getIdhorda());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Lacaio novinho em folha!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Esse lacaio não gosta muito de mudanças: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public List<LoginHorda> ler() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<LoginHorda> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginhorda");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                LoginHorda inf = new LoginHorda();
                
                inf.setIdhorda(rs.getInt("idhorda"));    
                inf.setLogin(rs.getString("login"));
                inf.setSenha(rs.getString("senha"));
                inf.setNomehorda(rs.getString("nomehorda"));
                inf.setRacahorda(rs.getString("racahorda"));                
                inf.setRegiaohorda(rs.getString("regiaohorda"));                
                inf.setOrdenshorda(rs.getString("ordenshorda"));                
                inf.setStatus(rs.getString("statushorda"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HordaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
    public List<LoginHorda> pesquisa(String desc) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<LoginHorda> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginhorda WHERE nomehorda LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                LoginHorda inf = new LoginHorda();
                
                inf.setIdhorda(rs.getInt("idhorda"));    
                inf.setLogin(rs.getString("login"));
                inf.setSenha(rs.getString("senha"));
                inf.setNomehorda(rs.getString("nomehorda"));
                inf.setRacahorda(rs.getString("racahorda"));                
                inf.setRegiaohorda(rs.getString("regiaohorda"));                
                inf.setOrdenshorda(rs.getString("ordenshorda"));                
                inf.setStatus(rs.getString("statushorda"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HordaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    public List<LoginHorda> pesquisaAdm(String pesq) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<LoginHorda> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginhorda WHERE regiaohorda LIKE ?");
            stmt.setString(1, "%"+pesq+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                LoginHorda inf = new LoginHorda();
                
                inf.setIdhorda(rs.getInt("idhorda"));    
                inf.setLogin(rs.getString("login"));
                inf.setSenha(rs.getString("senha"));
                inf.setNomehorda(rs.getString("nomehorda"));
                inf.setRacahorda(rs.getString("racahorda"));                
                inf.setRegiaohorda(rs.getString("regiaohorda"));                
                inf.setOrdenshorda(rs.getString("ordenshorda"));                
                inf.setStatus(rs.getString("statushorda"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HordaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
}
