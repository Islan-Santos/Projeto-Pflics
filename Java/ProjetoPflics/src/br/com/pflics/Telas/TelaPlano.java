package br.com.pflics.Telas;

import br.com.pflics.codgin.User;
import br.com.pflics.codgin.Usuario;
import java.sql.*;
import br.com.pflics.dal.ModuloConexao;
import javax.swing.JOptionPane;

public class TelaPlano extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst, pst2 = null;
    ResultSet rs, rs2 = null;
    User userPl;
    
    Usuario usuario = new Usuario();
    
    public TelaPlano(User user) {
        userPl = user;
        initComponents();
        conexao = ModuloConexao.conector();
        plano();
    }

    public void plano() {

        String sql = "select * from plano where idPlano = ?";
        String sql2 = "select * from usuario where cpfUsuario = ?";
        try {
            
            pst2 = conexao.prepareStatement(sql2);
            pst2.setString(1, userPl.getCpf());
            
            rs2 = pst2.executeQuery();
            
            if (rs2.next()) {
                String idPlano = rs2.getString(2);
                
                usuario.setIdPlano(idPlano);
            }
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getIdPlano());

            rs = pst.executeQuery();

            if (rs.next()) {
                txtNomePlano.setText(rs.getString(2));
                txtDescricao.setText(rs.getString(3));
                txtPreco.setText(rs.getString(4));

            } else {
                txtNomePlano.setText(" ");
                txtDescricao.setText(" ");
                txtPreco.setText(" ");
                JOptionPane.showMessageDialog(null,"Plano inexistente.");
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomePlano = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(760, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome do Plano:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição do Plano:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preço:");

        txtNomePlano.setEditable(false);

        txtPreco.setEditable(false);

        txtDescricao.setEditable(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67))
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomePlano, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(txtDescricao)
                    .addComponent(txtPreco))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
     }//GEN-LAST:event_txtDescricaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNomePlano;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
