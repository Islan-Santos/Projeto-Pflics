package br.com.pflics.Telas;

import br.com.pflics.codgin.User;
import javax.swing.JOptionPane;
import java.sql.*;
import br.com.pflics.dal.ModuloConexao;


public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    User userP;

    public TelaPrincipal(User user) {
        conexao = ModuloConexao.conector();
        initComponents();
        userP = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mUsuarios = new javax.swing.JMenu();
        mUsuarioM = new javax.swing.JMenuItem();
        mUsuarioAdd = new javax.swing.JMenuItem();
        mPlano = new javax.swing.JMenu();
        mPlanoMplano = new javax.swing.JMenuItem();
        mPlanoCriar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mAjuda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cartaoAdd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pflcs");
        setResizable(false);

        desktop.setPreferredSize(new java.awt.Dimension(760, 400));
		//Islan Passou Aqui XD
        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        mUsuarios.setText("Usuario");

        mUsuarioM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mUsuarioM.setText("Meus Dados");
        mUsuarioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsuarioMActionPerformed(evt);
            }
        });
        mUsuarios.add(mUsuarioM);

        mUsuarioAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mUsuarioAdd.setText("Adicionar usuario");
        mUsuarioAdd.setEnabled(false);
        mUsuarioAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsuarioAddActionPerformed(evt);
            }
        });
        mUsuarios.add(mUsuarioAdd);

        jMenuBar1.add(mUsuarios);

        mPlano.setText("Plano");
		//Islan Passou Aqui XD
        mPlanoMplano.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mPlanoMplano.setText("Meu Plano");
        mPlanoMplano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPlanoMplanoActionPerformed(evt);
            }
        });
        mPlano.add(mPlanoMplano);

        mPlanoCriar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mPlanoCriar.setText("Criar Plano");
        mPlanoCriar.setEnabled(false);
        mPlanoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPlanoCriarActionPerformed(evt);
            }
        });
        mPlano.add(mPlanoCriar);

        jMenuBar1.add(mPlano);

        jMenu3.setText("Ajuda");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        mAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mAjuda.setText("Ajuda");
        mAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAjudaActionPerformed(evt);
            }
        });
        jMenu3.add(mAjuda);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Cartão");

        cartaoAdd.setText("Meus Cartões");
        cartaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaoAddActionPerformed(evt);
            }
        });
        jMenu1.add(cartaoAdd);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Endereço");

        jMenuItem2.setText("Endereço");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(795, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void mAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAjudaActionPerformed
        JOptionPane.showMessageDialog(null, "Em desevolvimento!");
    }//GEN-LAST:event_mAjudaActionPerformed

    private void mUsuarioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsuarioMActionPerformed
        TelaUsuario usuario = new TelaUsuario(userP);
        usuario.setVisible(true);
        desktop.add(usuario);

    }//GEN-LAST:event_mUsuarioMActionPerformed

    private void mUsuarioAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsuarioAddActionPerformed
        TelaUsuarioCadastrar cadastrar = new TelaUsuarioCadastrar();
        cadastrar.setVisible(true);
        desktop.add(cadastrar);


    }//GEN-LAST:event_mUsuarioAddActionPerformed

    private void mPlanoMplanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPlanoMplanoActionPerformed

        TelaPlano plano = new TelaPlano(userP);
        plano.setVisible(true);
        desktop.add(plano);

    }//GEN-LAST:event_mPlanoMplanoActionPerformed

    private void mPlanoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPlanoCriarActionPerformed
        TelaPlanoCadastrar planoCadastrar = new TelaPlanoCadastrar();
        planoCadastrar.setVisible(true);
        desktop.add(planoCadastrar);
    }//GEN-LAST:event_mPlanoCriarActionPerformed

    private void cartaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaoAddActionPerformed
        TelaCartao CartaoCadastrar = new TelaCartao(userP);
        CartaoCadastrar.setVisible(true);
        desktop.add(CartaoCadastrar);
    }//GEN-LAST:event_cartaoAddActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaEndereco Endereco = new TelaEndereco(userP);
        Endereco.setVisible(true);
        desktop.add(Endereco);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cartaoAdd;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    //Islan Passou Aqui XD
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mAjuda;
    private javax.swing.JMenu mPlano;
    public static javax.swing.JMenuItem mPlanoCriar;
    private javax.swing.JMenuItem mPlanoMplano;
    public static javax.swing.JMenuItem mUsuarioAdd;
    private javax.swing.JMenuItem mUsuarioM;
    private static javax.swing.JMenu mUsuarios;
    // End of variables declaration//GEN-END:variables
}
