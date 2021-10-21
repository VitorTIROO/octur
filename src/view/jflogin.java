package View;

import Controle.Conexao;
import java.awt.Color;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JFLogin extends javax.swing.JFrame {

    PreparedStatement ps;
    Connection con = Conexao.conectar();
    ResultSet rs;
    int CONT, perfil;
    String usuario;

    public JFLogin() {
        initComponents();
         idioma("pt", "BR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGIdiomas = new javax.swing.ButtonGroup();
        jPPrincipal = new javax.swing.JPanel();
        jLLogo = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLFigura = new javax.swing.JLabel();
        jPIdiomas = new javax.swing.JPanel();
        jRBPT = new javax.swing.JRadioButton();
        jRBIN = new javax.swing.JRadioButton();
        jRBEP = new javax.swing.JRadioButton();
        jTFUsuario = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jBNovoUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("null");
        setResizable(false);

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLLogo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLLogo.setText("null");
        jLLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLUsuario.setText("null");

        jLSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLSenha.setText("null");

        jLFigura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLFigura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFigura.setText("null");
        jLFigura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPIdiomas.setBackground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Propiedades/Bundle_pt_BR"); // NOI18N
        jPIdiomas.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("JFLogin.jPIdiomas.border.title_1"))); // NOI18N

        bGIdiomas.add(jRBPT);
        jRBPT.setSelected(true);
        jRBPT.setText("null");
        jRBPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPTActionPerformed(evt);
            }
        });

        bGIdiomas.add(jRBIN);
        jRBIN.setText("null");
        jRBIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBINActionPerformed(evt);
            }
        });

        bGIdiomas.add(jRBEP);
        jRBEP.setText("null");
        jRBEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPIdiomasLayout = new javax.swing.GroupLayout(jPIdiomas);
        jPIdiomas.setLayout(jPIdiomasLayout);
        jPIdiomasLayout.setHorizontalGroup(
            jPIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIdiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRBEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRBPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRBIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPIdiomasLayout.setVerticalGroup(
            jPIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIdiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRBPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBEP)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTFUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyReleased(evt);
            }
        });

        jPFSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jBEntrar.setBackground(new java.awt.Color(0, 0, 0));
        jBEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jBEntrar.setText("null");
        jBEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEntrarMouseExited(evt);
            }
        });

        jBNovoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jBNovoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jBNovoUsuario.setText("null");
        jBNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNovoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNovoUsuarioMouseExited(evt);
            }
        });
        jBNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFigura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLUsuario)
                                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLSenha)
                                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addComponent(jBEntrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBNovoUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jPIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLUsuario)
                            .addComponent(jLSenha))
                        .addGap(4, 4, 4)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBNovoUsuario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLFigura, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLSenha, jLUsuario, jPFSenha, jTFUsuario});

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBEntrar, jBNovoUsuario});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMouseEntered
        MouseEntered(jBEntrar);
    }//GEN-LAST:event_jBEntrarMouseEntered

    private void jBEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMouseExited
        MouseExited(jBEntrar);
    }//GEN-LAST:event_jBEntrarMouseExited

    private void jBNovoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNovoUsuarioMouseEntered
        MouseEntered(jBNovoUsuario);
    }//GEN-LAST:event_jBNovoUsuarioMouseEntered

    private void jBNovoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNovoUsuarioMouseExited
        MouseExited(jBNovoUsuario);
    }//GEN-LAST:event_jBNovoUsuarioMouseExited

    private void jRBINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBINActionPerformed
        idioma("en", "US");
    }//GEN-LAST:event_jRBINActionPerformed

    private void jRBPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPTActionPerformed
        idioma("pt", "BR");
    }//GEN-LAST:event_jRBPTActionPerformed

    private void jRBEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEPActionPerformed
        idioma("ep", "EP");
    }//GEN-LAST:event_jRBEPActionPerformed

    private void jBNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoUsuarioActionPerformed
//        dispose();
        new JFCadUsuario().setVisible(true);
    }//GEN-LAST:event_jBNovoUsuarioActionPerformed

    private void jTFUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyReleased
        if (jTFUsuario.getText().matches("[a-zA-Z-.@]{4,}") == false || jTFUsuario.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(this, "EUSUARIOINVALIDO", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String di = "select * from usuario where login = '" + jTFUsuario.getText() + "'";
                
                ps = con.prepareStatement(di);
                rs = ps.executeQuery();
                
                if (rs.next()) {
                    
                    // jLDica.setText(rs.getString("dica"));
                    //JOptionPane.showMessageDialog(null, "SENHA INCORRETA.", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                    jPFSenha.requestFocus();
                    jPFSenha.setText("");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "USUÁRIO INEXISTENTE!!!", "LOGIN", JOptionPane.INFORMATION_MESSAGE);;
                }
            } catch (SQLException ex) {
                Logger.getLogger(JFLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTFUsuarioKeyReleased

    void idioma(String lingua, String pais) {

        Locale.setDefault(new Locale(lingua, pais));
        Locale lacale = Locale.getDefault();

        ResourceBundle palavra = ResourceBundle.getBundle("Propiedades.Bundle", lacale);

        jLSenha.setText(palavra.getString("JFLogin.jLSenha.text"));
        jLFigura.setText(palavra.getString("JFLogin.jLFigura.text"));
        jBNovoUsuario.setText(palavra.getString("JFLogin.jBNovoUsuario.text"));
        jRBIN.setText(palavra.getString("JFLogin.jRBIN.text"));
        jRBPT.setText(palavra.getString("JFLogin.jRBPT.text"));
        jPIdiomas.setBorder(javax.swing.BorderFactory.createTitledBorder(palavra.getString("JFLogin.jPIdiomas.border.title")));
        jRBEP.setText(palavra.getString("JFLogin.jRBEP.text"));
        jBEntrar.setText(palavra.getString("JFLogin.jBEntrar.text"));
        jLUsuario.setText(palavra.getString("JFLogin.jLUsuario.text"));
    }

    void MouseEntered(JButton b) {
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
    }

    void MouseExited(JButton b) {
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
    }

    void entrar() {
//        if (jTFLogin.getText().isEmpty() == true) {
//            JOptionPane.showMessageDialog(this, "Digite o usuário.", "Login", JOptionPane.INFORMATION_MESSAGE);
//        } else if (jPFSenha.getText().isEmpty() == true) {
//            JOptionPane.showMessageDialog(this, "Digite a senha.", "Login", JOptionPane.INFORMATION_MESSAGE);
//        } else {

        try {

//            String sql = "select * from usuario where login = '" + jTFLogin.getText() + "' and senha = '" + jPFSenha.getText() + "'";

     //       ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario = rs.getString("nome");
                perfil = rs.getInt("perfil");
                //new JFPrincipal(usuario, perfil).setVisible(true);
                dispose();
                Conexao.desconectar();

            } else {

                String di = "select * from usuario where login = '" + jTFUsuario.getText() + "'";

                ps = con.prepareStatement(di);
                rs = ps.executeQuery();

                if (rs.next()) {

                    // jLDica.setText(rs.getString("dica"));
                    JOptionPane.showMessageDialog(null, "SENHA INCORRETA.", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                    jPFSenha.requestFocus();
                    jPFSenha.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "USUÁRIO NÃO EXISTE!!!", "LOGIN", JOptionPane.INFORMATION_MESSAGE);;
                }
                CONT = CONT + 1;
                if (CONT == 3) {
                    System.exit(0);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO ENTRAR NO SISTEMA\n\nERRO: " + ex.getMessage(), "LOGIN", JOptionPane.ERROR_MESSAGE);
        }

        //}
    }

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGIdiomas;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBNovoUsuario;
    private javax.swing.JLabel jLFigura;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPIdiomas;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JRadioButton jRBEP;
    private javax.swing.JRadioButton jRBIN;
    private javax.swing.JRadioButton jRBPT;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables

}
