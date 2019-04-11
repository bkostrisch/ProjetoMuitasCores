
package Visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.LoginAdm;
import modelo.dao.LiderDAO;


public class TelaNovoLider extends javax.swing.JFrame {

    
    
    public TelaNovoLider() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaAdm.getModel();
        tb_TabelaAdm.setRowSorter(new TableRowSorter(modelo));
        
        lerTabela();
    }

    public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaAdm.getModel();
        modelo.setNumRows(0);
        LiderDAO hdao = new LiderDAO();
        
        for(LoginAdm h: hdao.lerLider()){
            
            modelo.addRow(new Object[]{
                h.getId(),
                h.getUser(),
                h.getPassword(),
                h.getNomelider(),
                h.getRacalider(),                                
            });
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_NomeLider = new javax.swing.JLabel();
        lbl_UsuarioLider = new javax.swing.JLabel();
        lbl_RacaLider = new javax.swing.JLabel();
        lbl_SenhaLider = new javax.swing.JLabel();
        lbl_NovoLider = new javax.swing.JLabel();
        txt_NomeLider = new javax.swing.JTextField();
        txt_RacaLider = new javax.swing.JTextField();
        txt_UsuarioLider = new javax.swing.JTextField();
        txt_SenhaLider = new javax.swing.JTextField();
        btn_voltarLider = new javax.swing.JButton();
        btn_AtualizarLider = new javax.swing.JButton();
        btn_NomearLider = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TabelaAdm = new javax.swing.JTable();
        btn_BanirLider = new javax.swing.JButton();
        fundotnlider = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seria alguém digno?");
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_NomeLider.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        lbl_NomeLider.setText("Nome:");
        getContentPane().add(lbl_NomeLider);
        lbl_NomeLider.setBounds(10, 80, 80, 30);

        lbl_UsuarioLider.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        lbl_UsuarioLider.setText("Usuário:");
        getContentPane().add(lbl_UsuarioLider);
        lbl_UsuarioLider.setBounds(10, 190, 90, 30);

        lbl_RacaLider.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        lbl_RacaLider.setText("Raça:");
        getContentPane().add(lbl_RacaLider);
        lbl_RacaLider.setBounds(10, 130, 60, 20);

        lbl_SenhaLider.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        lbl_SenhaLider.setText("Senha:");
        getContentPane().add(lbl_SenhaLider);
        lbl_SenhaLider.setBounds(250, 190, 70, 30);

        lbl_NovoLider.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        lbl_NovoLider.setText("Novo Líder");
        getContentPane().add(lbl_NovoLider);
        lbl_NovoLider.setBounds(140, 10, 200, 40);
        getContentPane().add(txt_NomeLider);
        txt_NomeLider.setBounds(80, 80, 330, 30);
        getContentPane().add(txt_RacaLider);
        txt_RacaLider.setBounds(80, 120, 330, 30);
        getContentPane().add(txt_UsuarioLider);
        txt_UsuarioLider.setBounds(90, 190, 140, 30);
        getContentPane().add(txt_SenhaLider);
        txt_SenhaLider.setBounds(320, 190, 140, 30);

        btn_voltarLider.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_voltarLider.setText("Voltar");
        btn_voltarLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarLiderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltarLider);
        btn_voltarLider.setBounds(360, 240, 90, 40);

        btn_AtualizarLider.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_AtualizarLider.setText("Atualizar");
        btn_AtualizarLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarLiderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AtualizarLider);
        btn_AtualizarLider.setBounds(130, 240, 90, 40);

        btn_NomearLider.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_NomearLider.setText("Nomear");
        btn_NomearLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NomearLiderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_NomearLider);
        btn_NomearLider.setBounds(20, 240, 90, 40);

        tb_TabelaAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário", "Senha", "Nome", "Raça"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_TabelaAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TabelaAdmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_TabelaAdm);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 290, 490, 150);

        btn_BanirLider.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_BanirLider.setText("Banir");
        btn_BanirLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BanirLiderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BanirLider);
        btn_BanirLider.setBounds(250, 240, 90, 40);

        fundotnlider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo3.jpg"))); // NOI18N
        getContentPane().add(fundotnlider);
        fundotnlider.setBounds(0, 0, 490, 440);

        setSize(new java.awt.Dimension(487, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarLiderActionPerformed
        
        TelaPrincipal tpp = new TelaPrincipal();
            tpp.setVisible(true);
            
        dispose();
    }//GEN-LAST:event_btn_voltarLiderActionPerformed

    private void btn_NomearLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NomearLiderActionPerformed
        
        LoginAdm h = new LoginAdm();
        LiderDAO hordao = new LiderDAO();
        
        h.setUser(txt_UsuarioLider.getText());        
        h.setPassword(txt_SenhaLider.getText());
        h.setNomelider(txt_NomeLider.getText());        
        h.setRacalider(txt_RacaLider.getText());       
             
               
        hordao.recrutarLider(h);
        
        txt_UsuarioLider.setText("");
        txt_SenhaLider.setText("");
        txt_NomeLider.setText("");      
        txt_RacaLider.setText("");   
                               
                      
        
        lerTabela();
        
    }//GEN-LAST:event_btn_NomearLiderActionPerformed

    private void tb_TabelaAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TabelaAdmMouseClicked
        
        if(tb_TabelaAdm.getSelectedRow() != -1){
            
            txt_UsuarioLider.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 1).toString());
            txt_SenhaLider.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 2).toString());
            txt_NomeLider.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 3).toString());
            txt_RacaLider.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 4).toString());
            
            
        }
        
    }//GEN-LAST:event_tb_TabelaAdmMouseClicked

    private void btn_BanirLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BanirLiderActionPerformed
        
        if(tb_TabelaAdm.getSelectedRow() != -1) {
            
            LoginAdm h = new LoginAdm();
            LiderDAO dao = new LiderDAO();
        
            h.setId((int)tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 0));            
            dao.banirLider(h);
        
            txt_UsuarioLider.setText("");
            txt_SenhaLider.setText("");
            txt_NomeLider.setText(""); 
            txt_RacaLider.setText(""); 
        
            lerTabela();
            
        }else{
            JOptionPane.showMessageDialog(null, "Que líder merece umas palmadas?");
        }
        
    }//GEN-LAST:event_btn_BanirLiderActionPerformed

    private void btn_AtualizarLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarLiderActionPerformed
        
        if(tb_TabelaAdm.getSelectedRow() != -1){
        
            LoginAdm h = new LoginAdm();
            LiderDAO dao = new LiderDAO();
        
            h.setId((int)tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 0));
            h.setUser(txt_UsuarioLider.getText());        
            h.setPassword(txt_SenhaLider.getText());
            h.setNomelider(txt_NomeLider.getText());        
            h.setRacalider(txt_RacaLider.getText());  
             
            dao.atualizarLider(h);
        
            txt_UsuarioLider.setText("");
            txt_SenhaLider.setText("");
            txt_NomeLider.setText(""); 
            txt_RacaLider.setText(""); 
        
            lerTabela();
        }
        
    }//GEN-LAST:event_btn_AtualizarLiderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaNovoLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoLider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AtualizarLider;
    private javax.swing.JButton btn_BanirLider;
    private javax.swing.JButton btn_NomearLider;
    private javax.swing.JButton btn_voltarLider;
    private javax.swing.JLabel fundotnlider;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_NomeLider;
    private javax.swing.JLabel lbl_NovoLider;
    private javax.swing.JLabel lbl_RacaLider;
    private javax.swing.JLabel lbl_SenhaLider;
    private javax.swing.JLabel lbl_UsuarioLider;
    private javax.swing.JTable tb_TabelaAdm;
    private javax.swing.JTextField txt_NomeLider;
    private javax.swing.JTextField txt_RacaLider;
    private javax.swing.JTextField txt_SenhaLider;
    private javax.swing.JTextField txt_UsuarioLider;
    // End of variables declaration//GEN-END:variables
}
