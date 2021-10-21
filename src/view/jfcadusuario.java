package View;

import java.awt.Color;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;

/**
 *
 * @author Vitor
 */
public class JFCadUsuario extends javax.swing.JFrame {
    
    
    public JFCadUsuario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLLogo = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLDtNasc = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLIdioma = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jCBIdioma = new javax.swing.JComboBox();
        jLFoto = new javax.swing.JLabel();
        jFTFDtNasc = new javax.swing.JFormattedTextField();
        jBCadastrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBAtualizar = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jLIconeUser = new javax.swing.JLabel();
        jLIconeSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Propiedades/BundleCadUsu_pt_BR_1"); // NOI18N
        setTitle(bundle.getString("JFCadUsuario.title")); // NOI18N
        setResizable(false);

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLLogo.setText(bundle.getString("JFCadUsuario.jLLogo.text")); // NOI18N
        jLLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLTitulo.setText(bundle.getString("JFCadUsuario.jLTitulo.text")); // NOI18N

        jLNome.setText(bundle.getString("JFCadUsuario.jLNome.text")); // NOI18N

        jLDtNasc.setText(bundle.getString("JFCadUsuario.jLDtNasc.text")); // NOI18N

        jLUsuario.setText(bundle.getString("JFCadUsuario.jLUsuario.text")); // NOI18N

        jLSenha.setText(bundle.getString("JFCadUsuario.jLSenha.text")); // NOI18N

        jLIdioma.setText(bundle.getString("JFCadUsuario.jLIdioma.text")); // NOI18N

        jCBIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "PORTUGUÊS", "INGLÊS", "ESPERANTO" }));
        jCBIdioma.setSelectedIndex(1);
        jCBIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBIdiomaActionPerformed(evt);
            }
        });

        jLFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFoto.setText(bundle.getString("JFCadUsuario.jLFoto.text")); // NOI18N
        jLFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            jFTFDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jBCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBCadastrar.setText(bundle.getString("JFCadUsuario.jBCadastrar.text")); // NOI18N
        jBCadastrar.setPreferredSize(null);
        jBCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCadastrarMouseExited(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText(bundle.getString("JFCadUsuario.jBCancelar.text")); // NOI18N
        jBCancelar.setPreferredSize(null);
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });

        jBAtualizar.setBackground(new java.awt.Color(0, 0, 0));
        jBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBAtualizar.setText(bundle.getString("JFCadUsuario.jBAtualizar.text")); // NOI18N
        jBAtualizar.setPreferredSize(null);
        jBAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAtualizarMouseExited(evt);
            }
        });

        jBApagar.setBackground(new java.awt.Color(0, 0, 0));
        jBApagar.setForeground(new java.awt.Color(255, 255, 255));
        jBApagar.setText(bundle.getString("JFCadUsuario.jBApagar.text")); // NOI18N
        jBApagar.setPreferredSize(null);
        jBApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBApagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBApagarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIdioma)
                                    .addComponent(jLSenha)
                                    .addComponent(jLUsuario)
                                    .addComponent(jLDtNasc)
                                    .addComponent(jLNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPFSenha)
                                    .addComponent(jTFUsuario)
                                    .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLIconeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                            .addComponent(jBApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLIconeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBApagar, jBAtualizar, jLFoto});

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBIdioma, jFTFDtNasc, jPFSenha, jTFNome, jTFUsuario});

        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTitulo))
                .addGap(33, 33, 33)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNome)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDtNasc)
                            .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIconeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLUsuario)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLSenha)
                                .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLIconeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLIdioma)
                            .addComponent(jCBIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAtualizar, jCBIdioma, jFTFDtNasc, jLDtNasc, jLIconeSenha, jLIconeUser, jLIdioma, jLNome, jLSenha, jLUsuario, jPFSenha, jTFNome, jTFUsuario});

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLLogo, jLTitulo});

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBApagar, jBCadastrar, jBCancelar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBIdiomaActionPerformed
        if (jCBIdioma.getSelectedIndex() == 1) {
            idioma("pt", "BR_1");
        } else if (jCBIdioma.getSelectedIndex() == 2) {
            idioma("en", "US");
        }
    }//GEN-LAST:event_jCBIdiomaActionPerformed

    private void jBAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAtualizarMouseEntered
        MouseEntered(jBAtualizar);
    }//GEN-LAST:event_jBAtualizarMouseEntered

    private void jBAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAtualizarMouseExited
        MouseExited(jBAtualizar);
    }//GEN-LAST:event_jBAtualizarMouseExited

    private void jBApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBApagarMouseEntered
        MouseEntered(jBApagar);
    }//GEN-LAST:event_jBApagarMouseEntered

    private void jBApagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBApagarMouseExited
        MouseExited(jBApagar);
    }//GEN-LAST:event_jBApagarMouseExited

    private void jBCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrarMouseEntered
        MouseEntered(jBCadastrar);
    }//GEN-LAST:event_jBCadastrarMouseEntered

    private void jBCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrarMouseExited
        MouseExited(jBCadastrar);
    }//GEN-LAST:event_jBCadastrarMouseExited

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        MouseEntered(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        MouseExited(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseExited
    
    void idioma(String lingua, String pais) {
        
        Locale.setDefault(new Locale(lingua, pais));
        Locale locale = Locale.getDefault();
        
        ResourceBundle palavra = ResourceBundle.getBundle("Propiedades.BundleCadUsu", locale);
        
        jLSenha.setText(palavra.getString("JFCadUsuario.jLSenha.text"));
        jLNome.setText(palavra.getString("JFCadUsuario.jLNome.text"));
        jLDtNasc.setText(palavra.getString("JFCadUsuario.jLDtNasc.text"));
        jLTitulo.setText(palavra.getString("JFCadUsuario.jLTitulo.text"));
        jLIdioma.setText(palavra.getString("JFCadUsuario.jLIdioma.text"));
        jBCadastrar.setText(palavra.getString("JFCadUsuario.jBCadastrar.text"));
        jLUsuario.setText(palavra.getString("JFCadUsuario.jLUsuario.text"));
        jBCancelar.setText(palavra.getString("JFCadUsuario.jBCancelar.text"));
        jBApagar.setText(palavra.getString("JFCadUsuario.jBApagar.text"));
        jBAtualizar.setText(palavra.getString("JFCadUsuario.jBAtualizar.text"));
    }
    
    void MouseEntered(JButton b) {
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
    }
    
    void MouseExited(JButton b) {
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
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
            java.util.logging.Logger.getLogger(JFCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox jCBIdioma;
    private javax.swing.JFormattedTextField jFTFDtNasc;
    private javax.swing.JLabel jLDtNasc;
    private javax.swing.JLabel jLFoto;
    private javax.swing.JLabel jLIconeSenha;
    private javax.swing.JLabel jLIconeUser;
    private javax.swing.JLabel jLIdioma;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables

}
