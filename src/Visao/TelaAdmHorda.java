
package Visao;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.LoginHorda;
import modelo.dao.HordaDAO;


public class TelaAdmHorda extends javax.swing.JFrame {

   
    public TelaAdmHorda() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaOrdens.getModel();
        tb_TabelaOrdens.setRowSorter(new TableRowSorter(modelo));
        
        lerTabelaOrdens();
    }
    
    
    
    public void lerTabelaOrdens() {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaOrdens.getModel();
        modelo.setNumRows(0);
        HordaDAO hdao = new HordaDAO();
        
        for(LoginHorda h: hdao.ler()){
            
            modelo.addRow(new Object[]{                              
                h.getRegiaohorda(),
                h.getOrdenshorda(),
                h.getStatus(),                
            });
        }
    }    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TabelaOrdens = new javax.swing.JTable();
        lbl_RegiaoAdmHorda = new javax.swing.JLabel();
        lbl_ComandosAdmHorda = new javax.swing.JLabel();
        txt_RegiaoAdmHorda = new javax.swing.JComboBox<>();
        btn_OrdenarOrdens = new javax.swing.JButton();
        btn_VoltarOrdens = new javax.swing.JButton();
        lbl_ComandeSeuExercito = new javax.swing.JLabel();
        txt_ComandosAdmHorda = new javax.swing.JTextField();
        FundoAdmHorda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admnistrar Horda");
        setResizable(false);
        getContentPane().setLayout(null);

        tb_TabelaOrdens.setAutoCreateRowSorter(true);
        tb_TabelaOrdens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Região", "Ordens", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_TabelaOrdens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TabelaOrdensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_TabelaOrdens);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 210, 740, 402);

        lbl_RegiaoAdmHorda.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_RegiaoAdmHorda.setText("Grupo da Região:");
        getContentPane().add(lbl_RegiaoAdmHorda);
        lbl_RegiaoAdmHorda.setBounds(20, 70, 160, 30);

        lbl_ComandosAdmHorda.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        lbl_ComandosAdmHorda.setText("Comandos:");
        getContentPane().add(lbl_ComandosAdmHorda);
        lbl_ComandosAdmHorda.setBounds(20, 150, 110, 30);

        txt_RegiaoAdmHorda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orthanc", "Isengard", "Rohan" }));
        getContentPane().add(txt_RegiaoAdmHorda);
        txt_RegiaoAdmHorda.setBounds(180, 70, 100, 30);

        btn_OrdenarOrdens.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_OrdenarOrdens.setText("Ordenar");
        btn_OrdenarOrdens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrdenarOrdensActionPerformed(evt);
            }
        });
        getContentPane().add(btn_OrdenarOrdens);
        btn_OrdenarOrdens.setBounds(630, 120, 90, 30);

        btn_VoltarOrdens.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_VoltarOrdens.setText("Voltar");
        btn_VoltarOrdens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarOrdensActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VoltarOrdens);
        btn_VoltarOrdens.setBounds(630, 170, 90, 30);

        lbl_ComandeSeuExercito.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        lbl_ComandeSeuExercito.setText("Comande seu Exército");
        getContentPane().add(lbl_ComandeSeuExercito);
        lbl_ComandeSeuExercito.setBounds(230, 10, 320, 40);
        getContentPane().add(txt_ComandosAdmHorda);
        txt_ComandosAdmHorda.setBounds(130, 150, 370, 30);

        FundoAdmHorda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo4.jpeg"))); // NOI18N
        getContentPane().add(FundoAdmHorda);
        FundoAdmHorda.setBounds(-30, -40, 770, 450);

        setSize(new java.awt.Dimension(746, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarOrdensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarOrdensActionPerformed
        
        TelaPrincipal ntela = new TelaPrincipal();
            ntela.setVisible(true);
            
        dispose();
        
    }//GEN-LAST:event_btn_VoltarOrdensActionPerformed

    private void btn_OrdenarOrdensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrdenarOrdensActionPerformed
        
        if(tb_TabelaOrdens.getSelectedRow() != -1){
        
            LoginHorda h = new LoginHorda();
            HordaDAO dao = new HordaDAO();
        
                                       
            h.setRegiaohorda((String)txt_RegiaoAdmHorda.getSelectedItem());
            h.setOrdenshorda(txt_ComandosAdmHorda.getText());
            h.setStatus("Em andamento");
            
            
            dao.ordenar(h);
        
            
            txt_ComandosAdmHorda.setText("");           
        
            lerTabelaOrdens();
        }        
    }//GEN-LAST:event_btn_OrdenarOrdensActionPerformed

    private void tb_TabelaOrdensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TabelaOrdensMouseClicked
       
        if(tb_TabelaOrdens.getSelectedRow() != -1){
            
            txt_RegiaoAdmHorda.setSelectedItem(tb_TabelaOrdens.getValueAt(tb_TabelaOrdens.getSelectedRow(), 0).toString());
            txt_ComandosAdmHorda.setText(tb_TabelaOrdens.getValueAt(tb_TabelaOrdens.getSelectedRow(), 1).toString());
            
            
        }
        
    }//GEN-LAST:event_tb_TabelaOrdensMouseClicked

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(TelaAdmHorda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmHorda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmHorda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmHorda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmHorda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoAdmHorda;
    private javax.swing.JButton btn_OrdenarOrdens;
    private javax.swing.JButton btn_VoltarOrdens;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ComandeSeuExercito;
    private javax.swing.JLabel lbl_ComandosAdmHorda;
    private javax.swing.JLabel lbl_RegiaoAdmHorda;
    private javax.swing.JTable tb_TabelaOrdens;
    private javax.swing.JTextField txt_ComandosAdmHorda;
    private javax.swing.JComboBox<String> txt_RegiaoAdmHorda;
    // End of variables declaration//GEN-END:variables
}
