package br.com.pflics.Telas;

import br.com.pflics.codgin.User;
import java.sql.*;
import br.com.pflics.dal.ModuloConexao;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    User user = new User();

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaLogin() {
        initComponents();
        conexao = ModuloConexao.conector();
        // System.out.println(conexao);
        if (conexao != null) {
            lblStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pflics/icon/BDon.png")));
        } else {
            lblStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pflics/icon/BDoff.png")));
        }

    }

    public void Logar() {

        String sql = "select * from Login where login=? and senha=? ";

        try {
            user.setLogin(txtLogin.getText());
            user.setSenha(txtSenha.getText());

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtLogin.getText());
            pst.setString(2, txtSenha.getText());

            rs = pst.executeQuery();

            if (rs.next()) {

                String perfil = rs.getString(4);
                String cpf = rs.getString(1);

                user.setPerfil(perfil);
                user.setCpf(cpf);

                //System.out.println(perfil);
                //System.out.println(cpf);
                System.out.println(user.getCpf());
                if (perfil.equals("Admin")) {
                    TelaPrincipal principal = new TelaPrincipal(user);
                    principal.setVisible(true);
                    TelaPrincipal.mPlanoCriar.setEnabled(true);
                    TelaPrincipal.mUsuarioAdd.setEnabled(true);
                    this.dispose();
                    conexao.close();

                } else {
                    TelaPrincipal principal = new TelaPrincipal(user);
                    principal.setVisible(true);
                    this.dispose();
                    conexao.close();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario e/ou Senha inválidos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void Cadastrar() {
        this.dispose();
        TelaCadastrar cadastro = new TelaCadastrar();
        cadastro.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        lblStats = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pflics - Login");
        setResizable(false);

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        lblStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pflics/icon/BDoff.png"))); // NOI18N
		//Islan Passou Aqui XD
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblStats)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BtnLogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCadastrar))
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnLogin)
                            .addComponent(BtnCadastrar))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblStats)
                        .addGap(34, 34, 34))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        // Chamando o metodo logar
        Logar();
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        // Chamando Cadastrar
        Cadastrar();
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStats;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
