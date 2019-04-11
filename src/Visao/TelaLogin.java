
package Visao;

import javax.swing.JOptionPane;
import modelo.dao.LoginAdmDAO;
import modelo.dao.LoginHordaDAO;

public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_Usuario = new javax.swing.JLabel();
        lbl_Senha = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        btn_Entrar = new javax.swing.JButton();
        btn_Ingressar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Navegue pela Horda!");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        jLabel1.setText("Horda de Saruman");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 310, 45);

        lbl_Usuario.setFont(new java.awt.Font("Viner Hand ITC", 2, 24)); // NOI18N
        lbl_Usuario.setText("Usuário:");
        getContentPane().add(lbl_Usuario);
        lbl_Usuario.setBounds(140, 90, 100, 40);

        lbl_Senha.setFont(new java.awt.Font("Viner Hand ITC", 2, 24)); // NOI18N
        lbl_Senha.setText("Senha:");
        getContentPane().add(lbl_Senha);
        lbl_Senha.setBounds(140, 190, 90, 20);
        getContentPane().add(txt_usuario);
        txt_usuario.setBounds(110, 130, 150, 30);
        getContentPane().add(txt_senha);
        txt_senha.setBounds(110, 220, 150, 30);

        btn_Entrar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_Entrar.setText("Entrar");
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Entrar);
        btn_Entrar.setBounds(140, 270, 80, 27);

        btn_Ingressar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btn_Ingressar.setText("Ingressar à Horda");
        btn_Ingressar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngressarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Ingressar);
        btn_Ingressar.setBounds(110, 370, 140, 27);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 390, 420);

        setSize(new java.awt.Dimension(374, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed

      LoginAdmDAO dao = new LoginAdmDAO();
      LoginHordaDAO hdao = new LoginHordaDAO();
        
       if(dao.checagemLogin(txt_usuario.getText(), txt_senha.getText())){
           
                new TelaPrincipal().setVisible(true);
                this.dispose();
                
       }    else if(hdao.checagemLoginHorda(txt_usuario.getText(), txt_senha.getText())){
           
                new TelaHorda().setVisible(true);
                this.dispose();
                
                
            }   else{
                    JOptionPane.showMessageDialog(null, "Senha incorreta");
                }
    
    }//GEN-LAST:event_btn_EntrarActionPerformed

    private void btn_IngressarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngressarActionPerformed
        
         TelaIngressar ing = new TelaIngressar();
            ing.setVisible(true);
            
         dispose();
        
    }//GEN-LAST:event_btn_IngressarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JButton btn_Ingressar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
