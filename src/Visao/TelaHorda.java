
package Visao;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.LoginHorda;
import modelo.dao.HordaDAO;


public class TelaHorda extends javax.swing.JFrame {

    
    public TelaHorda() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaHorda.getModel();
        tb_TabelaHorda.setRowSorter(new TableRowSorter(modelo));
        
        lerTabelaStatus();
    }

    public void lerTabelaStatus() {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaHorda.getModel();
        modelo.setNumRows(0);
        HordaDAO hdao = new HordaDAO();
        
        for(LoginHorda h : hdao.ler()){
            
            modelo.addRow(new Object[]{                              
                h.getRegiaohorda(),
                h.getOrdenshorda(),
                h.getStatus(),                
            });
        }
    }
    public void lerPesquisa(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaHorda.getModel();
        modelo.setNumRows(0);
        HordaDAO jdao = new HordaDAO();
        
        for(LoginHorda h : jdao.pesquisa(desc)){
            
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

        lbl_BemVindo = new javax.swing.JLabel();
        lbl_Pergunta = new javax.swing.JLabel();
        btn_StatusEnviar = new javax.swing.JButton();
        txt_StatusMissao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_NomeInstru = new javax.swing.JTextField();
        btn_Pesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TabelaHorda = new javax.swing.JTable();
        txt_RegiaoStatus = new javax.swing.JTextField();
        txt_OrdensStatus = new javax.swing.JTextField();
        btn_Deslogar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FundoTelaHorda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Horda de Saruman Muitas Cores");
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_BemVindo.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        lbl_BemVindo.setText("Bem-Vindo à Horda");
        getContentPane().add(lbl_BemVindo);
        lbl_BemVindo.setBounds(130, 0, 350, 50);

        lbl_Pergunta.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        lbl_Pergunta.setText("Como está a missão?");
        getContentPane().add(lbl_Pergunta);
        lbl_Pergunta.setBounds(460, 200, 150, 19);

        btn_StatusEnviar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_StatusEnviar.setText("Enviar");
        btn_StatusEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StatusEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StatusEnviar);
        btn_StatusEnviar.setBounds(490, 280, 100, 30);

        txt_StatusMissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bem Sucedida", "Missão Falhou" }));
        getContentPane().add(txt_StatusMissao);
        txt_StatusMissao.setBounds(470, 230, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel1.setText("Digite seu nome para saber as instruções:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 200, 310, 19);
        getContentPane().add(txt_NomeInstru);
        txt_NomeInstru.setBounds(60, 240, 160, 20);

        btn_Pesquisa.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_Pesquisa.setText("Procurar");
        btn_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Pesquisa);
        btn_Pesquisa.setBounds(90, 280, 100, 30);

        tb_TabelaHorda.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_TabelaHorda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TabelaHordaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_TabelaHorda);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 320, 630, 210);
        getContentPane().add(txt_RegiaoStatus);
        txt_RegiaoStatus.setBounds(250, 90, 110, 30);
        getContentPane().add(txt_OrdensStatus);
        txt_OrdensStatus.setBounds(40, 150, 540, 30);

        btn_Deslogar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btn_Deslogar.setText("Deslogar");
        btn_Deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeslogarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Deslogar);
        btn_Deslogar.setBounds(520, 10, 90, 40);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel2.setText("Região:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 60, 70, 20);

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel3.setText("Instruções:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 120, 90, 30);

        FundoTelaHorda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo5.jpg"))); // NOI18N
        getContentPane().add(FundoTelaHorda);
        FundoTelaHorda.setBounds(0, -10, 650, 450);

        setSize(new java.awt.Dimension(633, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeslogarActionPerformed
        
        TelaLogin a = new TelaLogin();
            a.setVisible(true);
            
        dispose();
        
    }//GEN-LAST:event_btn_DeslogarActionPerformed

    private void btn_StatusEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StatusEnviarActionPerformed
        
        if(tb_TabelaHorda.getSelectedRow() != -1){
        
            LoginHorda h = new LoginHorda();
            HordaDAO dao = new HordaDAO();
        
             
            h.setRegiaohorda(txt_RegiaoStatus.getText()); 
            h.setOrdenshorda(txt_OrdensStatus.getText());           
            h.setStatus((String)txt_StatusMissao.getSelectedItem());            
            
            dao.status(h);
        
                                   
        
            lerTabelaStatus();
        }
        
    }//GEN-LAST:event_btn_StatusEnviarActionPerformed

    private void tb_TabelaHordaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TabelaHordaMouseClicked
               
            
        if(tb_TabelaHorda.getSelectedRow() != -1){
            
            txt_RegiaoStatus.setText(tb_TabelaHorda.getValueAt(tb_TabelaHorda.getSelectedRow(), 0).toString());
            txt_OrdensStatus.setText(tb_TabelaHorda.getValueAt(tb_TabelaHorda.getSelectedRow(), 1).toString());
            txt_StatusMissao.setSelectedItem(tb_TabelaHorda.getValueAt(tb_TabelaHorda.getSelectedRow(), 2).toString());           
            
            
        }
            
                  
        
    }//GEN-LAST:event_tb_TabelaHordaMouseClicked

    private void btn_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisaActionPerformed
        
        lerPesquisa(txt_NomeInstru.getText());
        
    }//GEN-LAST:event_btn_PesquisaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHorda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoTelaHorda;
    private javax.swing.JButton btn_Deslogar;
    private javax.swing.JButton btn_Pesquisa;
    private javax.swing.JButton btn_StatusEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_BemVindo;
    private javax.swing.JLabel lbl_Pergunta;
    private javax.swing.JTable tb_TabelaHorda;
    private javax.swing.JTextField txt_NomeInstru;
    private javax.swing.JTextField txt_OrdensStatus;
    private javax.swing.JTextField txt_RegiaoStatus;
    private javax.swing.JComboBox<String> txt_StatusMissao;
    // End of variables declaration//GEN-END:variables
}
