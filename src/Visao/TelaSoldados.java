
package Visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.LoginHorda;
import modelo.dao.HordaDAO;

public class TelaSoldados extends javax.swing.JFrame {

    
    public TelaSoldados() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaSoldados.getModel();
        tb_TabelaSoldados.setRowSorter(new TableRowSorter(modelo));
        
        lerTabela();
       
    }
    
     public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaSoldados.getModel();
        modelo.setNumRows(0);
        HordaDAO hdao = new HordaDAO();
        
        for(LoginHorda h: hdao.ler()){
            
            modelo.addRow(new Object[]{
                h.getIdhorda(),
                h.getLogin(),
                h.getSenha(),
                h.getNomehorda(),
                h.getRacahorda(),
                h.getRegiaohorda(),                
            });
        }
    }
     public void lerTabelaPesq(String pesq) {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaSoldados.getModel();
        modelo.setNumRows(0);
        HordaDAO hdao = new HordaDAO();
        
        for(LoginHorda h: hdao.pesquisaAdm(pesq)){
            
            modelo.addRow(new Object[]{
                h.getIdhorda(),
                h.getLogin(),
                h.getSenha(),
                h.getNomehorda(),
                h.getRacahorda(),
                h.getRegiaohorda(),                
            });
        }
    }
     
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TabelaSoldados = new javax.swing.JTable();
        lbl_NomeSoldados = new javax.swing.JLabel();
        lbl_RacaSoldados = new javax.swing.JLabel();
        lbl_UsuarioSoldados = new javax.swing.JLabel();
        lbl_SenhaSoldados = new javax.swing.JLabel();
        lbl_RegiaoSoldados = new javax.swing.JLabel();
        btn_RecrutarSoldados = new javax.swing.JButton();
        btn_BanirSoldados = new javax.swing.JButton();
        btn_AlterarSoldados = new javax.swing.JButton();
        btn_Pesquisar = new javax.swing.JButton();
        lbl_PesquisarSoldados = new javax.swing.JLabel();
        txt_NomeSoldados = new javax.swing.JTextField();
        txt_UsuarioSoldados = new javax.swing.JTextField();
        txt_PesquisarSoldados = new javax.swing.JTextField();
        btn_VoltarrSoldados = new javax.swing.JButton();
        txt_RacaSoldados = new javax.swing.JComboBox<>();
        txt_RegiaoSoldados = new javax.swing.JComboBox<>();
        txt_SenhaSoldados = new javax.swing.JTextField();
        fundotelasoldados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lacaios em ordem!");
        setResizable(false);
        getContentPane().setLayout(null);

        tb_TabelaSoldados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário", "Senha", "Nome", "Raça", "Região"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_TabelaSoldados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TabelaSoldadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_TabelaSoldados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 210, 910, 230);

        lbl_NomeSoldados.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_NomeSoldados.setText("Nome:");
        getContentPane().add(lbl_NomeSoldados);
        lbl_NomeSoldados.setBounds(10, 30, 60, 20);

        lbl_RacaSoldados.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_RacaSoldados.setText("Raça:");
        getContentPane().add(lbl_RacaSoldados);
        lbl_RacaSoldados.setBounds(10, 90, 60, 30);

        lbl_UsuarioSoldados.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_UsuarioSoldados.setText("Usuário:");
        getContentPane().add(lbl_UsuarioSoldados);
        lbl_UsuarioSoldados.setBounds(220, 20, 80, 30);

        lbl_SenhaSoldados.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_SenhaSoldados.setText("Senha:");
        getContentPane().add(lbl_SenhaSoldados);
        lbl_SenhaSoldados.setBounds(220, 90, 80, 30);

        lbl_RegiaoSoldados.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_RegiaoSoldados.setText("Região:");
        getContentPane().add(lbl_RegiaoSoldados);
        lbl_RegiaoSoldados.setBounds(10, 150, 70, 30);

        btn_RecrutarSoldados.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_RecrutarSoldados.setText("Recrutar");
        btn_RecrutarSoldados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RecrutarSoldadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_RecrutarSoldados);
        btn_RecrutarSoldados.setBounds(470, 160, 90, 40);

        btn_BanirSoldados.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_BanirSoldados.setText("Banir");
        btn_BanirSoldados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BanirSoldadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BanirSoldados);
        btn_BanirSoldados.setBounds(570, 160, 90, 40);

        btn_AlterarSoldados.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_AlterarSoldados.setText("Alterar");
        btn_AlterarSoldados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarSoldadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AlterarSoldados);
        btn_AlterarSoldados.setBounds(670, 160, 90, 40);

        btn_Pesquisar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Pesquisar);
        btn_Pesquisar.setBounds(770, 50, 90, 40);

        lbl_PesquisarSoldados.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_PesquisarSoldados.setText("Pesquisar:");
        getContentPane().add(lbl_PesquisarSoldados);
        lbl_PesquisarSoldados.setBounds(520, 20, 100, 20);
        getContentPane().add(txt_NomeSoldados);
        txt_NomeSoldados.setBounds(80, 20, 120, 30);
        getContentPane().add(txt_UsuarioSoldados);
        txt_UsuarioSoldados.setBounds(310, 20, 130, 30);
        getContentPane().add(txt_PesquisarSoldados);
        txt_PesquisarSoldados.setBounds(620, 10, 240, 30);

        btn_VoltarrSoldados.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_VoltarrSoldados.setText("Voltar");
        btn_VoltarrSoldados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarrSoldadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VoltarrSoldados);
        btn_VoltarrSoldados.setBounds(770, 160, 90, 40);

        txt_RacaSoldados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Goblin", "Uruk-hai", "Snaga", "Warg" }));
        getContentPane().add(txt_RacaSoldados);
        txt_RacaSoldados.setBounds(80, 90, 100, 30);

        txt_RegiaoSoldados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orthanc", "Isengard", "Rohan" }));
        getContentPane().add(txt_RegiaoSoldados);
        txt_RegiaoSoldados.setBounds(80, 150, 100, 30);
        getContentPane().add(txt_SenhaSoldados);
        txt_SenhaSoldados.setBounds(310, 90, 130, 30);

        fundotelasoldados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo4.jpeg"))); // NOI18N
        getContentPane().add(fundotelasoldados);
        fundotelasoldados.setBounds(-80, -150, 980, 1200);

        setSize(new java.awt.Dimension(896, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarrSoldadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarrSoldadosActionPerformed
     
        TelaPrincipal tlp = new TelaPrincipal();
            tlp.setVisible(true);
            
        dispose();
        
    }//GEN-LAST:event_btn_VoltarrSoldadosActionPerformed

    private void btn_RecrutarSoldadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RecrutarSoldadosActionPerformed
        
        LoginHorda h = new LoginHorda();
        HordaDAO hordao = new HordaDAO();
        
        h.setLogin(txt_UsuarioSoldados.getText());        
        h.setSenha(txt_SenhaSoldados.getText());
        h.setNomehorda(txt_NomeSoldados.getText());        
        h.setRacahorda((String) txt_RacaSoldados.getSelectedItem());               
        h.setRegiaohorda((String)txt_RegiaoSoldados.getSelectedItem());
        h.setOrdenshorda("Sem ordens");
        h.setStatus("Em andamento"); 
        hordao.recrutar(h);
        
        txt_UsuarioSoldados.setText("");
        txt_SenhaSoldados.setText("");
        txt_NomeSoldados.setText("");      
                               
                       
        
        lerTabela();
        
    }//GEN-LAST:event_btn_RecrutarSoldadosActionPerformed

    private void tb_TabelaSoldadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TabelaSoldadosMouseClicked
       
        if(tb_TabelaSoldados.getSelectedRow() != -1){
            
            txt_UsuarioSoldados.setText(tb_TabelaSoldados.getValueAt(tb_TabelaSoldados.getSelectedRow(), 1).toString());
            txt_SenhaSoldados.setText(tb_TabelaSoldados.getValueAt(tb_TabelaSoldados.getSelectedRow(), 2).toString());
            txt_NomeSoldados.setText(tb_TabelaSoldados.getValueAt(tb_TabelaSoldados.getSelectedRow(), 3).toString());
            txt_RacaSoldados.setSelectedItem(tb_TabelaSoldados.getValueAt(tb_TabelaSoldados.getSelectedRow(), 4).toString());
            txt_RegiaoSoldados.setSelectedItem(tb_TabelaSoldados.getValueAt(tb_TabelaSoldados.getSelectedRow(), 5).toString());
            
        }
        
    }//GEN-LAST:event_tb_TabelaSoldadosMouseClicked

    private void btn_BanirSoldadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BanirSoldadosActionPerformed
       
        if(tb_TabelaSoldados.getSelectedRow() != -1) {
            
            LoginHorda h = new LoginHorda();
            HordaDAO dao = new HordaDAO();
        
            h.setIdhorda((int)tb_TabelaSoldados.getValueAt(tb_TabelaSoldados.getSelectedRow(), 0));            
            dao.banir(h);
        
            txt_UsuarioSoldados.setText("");
            txt_SenhaSoldados.setText("");
            txt_NomeSoldados.setText(""); 
        
            lerTabela();
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um lacaio para banir.");
        }
        
    }//GEN-LAST:event_btn_BanirSoldadosActionPerformed

    private void btn_AlterarSoldadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarSoldadosActionPerformed
        
        if(tb_TabelaSoldados.getSelectedRow() != -1){
        
            LoginHorda h = new LoginHorda();
            HordaDAO dao = new HordaDAO();
        
            h.setIdhorda((int)tb_TabelaSoldados.getValueAt(tb_TabelaSoldados.getSelectedRow(), 0));
            h.setLogin(txt_UsuarioSoldados.getText());        
            h.setSenha(txt_SenhaSoldados.getText());
            h.setNomehorda(txt_NomeSoldados.getText());        
            h.setRacahorda((String) txt_RacaSoldados.getSelectedItem());               
            h.setRegiaohorda((String)txt_RegiaoSoldados.getSelectedItem());
            h.setOrdenshorda("Sem ordens");
            h.setStatus("Em andamento");
            dao.atualizar(h);
        
            txt_UsuarioSoldados.setText("");
            txt_SenhaSoldados.setText("");
            txt_NomeSoldados.setText(""); 
        
            lerTabela();
        }
        
    }//GEN-LAST:event_btn_AlterarSoldadosActionPerformed

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        
        lerTabelaPesq(txt_PesquisarSoldados.getText());
        
    }//GEN-LAST:event_btn_PesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSoldados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSoldados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSoldados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSoldados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSoldados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AlterarSoldados;
    private javax.swing.JButton btn_BanirSoldados;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_RecrutarSoldados;
    private javax.swing.JButton btn_VoltarrSoldados;
    private javax.swing.JLabel fundotelasoldados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_NomeSoldados;
    private javax.swing.JLabel lbl_PesquisarSoldados;
    private javax.swing.JLabel lbl_RacaSoldados;
    private javax.swing.JLabel lbl_RegiaoSoldados;
    private javax.swing.JLabel lbl_SenhaSoldados;
    private javax.swing.JLabel lbl_UsuarioSoldados;
    private javax.swing.JTable tb_TabelaSoldados;
    private javax.swing.JTextField txt_NomeSoldados;
    private javax.swing.JTextField txt_PesquisarSoldados;
    private javax.swing.JComboBox<String> txt_RacaSoldados;
    private javax.swing.JComboBox<String> txt_RegiaoSoldados;
    private javax.swing.JTextField txt_SenhaSoldados;
    private javax.swing.JTextField txt_UsuarioSoldados;
    // End of variables declaration//GEN-END:variables
}
