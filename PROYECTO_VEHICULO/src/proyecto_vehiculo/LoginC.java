
package proyecto_vehiculo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class LoginC extends javax.swing.JFrame {

    
    public LoginC() {
        initComponents();
         this.setTitle("AutoSoftPro");
        setLocationRelativeTo(null);
        Cliente cliente = new Cliente();
        cliente.setUsuario("cliente");
        cliente.setPass("cliente");
        cliente.setNombre("yo");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsuarioC = new javax.swing.JTextField();
        tfPassC = new javax.swing.JTextField();
        btnIngresarC = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        btnIngresarC.setText("Ingresar");
        btnIngresarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarCMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIngresarC)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUsuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPassC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(128, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUsuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPassC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarC)
                    .addComponent(btnCancelar))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarCMouseClicked
       String usuario = tfUsuarioC.getText();
       String pass = tfPassC.getText();
       String filePath = "C:\\AutoSoftPro\\usuarios.txt";
       
        String textoBuscado = tfUsuarioC.getText();
        int lineNumber = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            boolean textoEncontrado = false;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(textoBuscado)) {
                    textoEncontrado = true;
                    break;
                }
            }

            if (textoEncontrado==false) {
                System.out.println("El usuario no existe");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String filePath2 = "C:\\AutoSoftPro\\contraseña.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath2))) {           
            String contraBuscar = tfPassC.getText();
            String linea;
            int numeroLinea = lineNumber;
            // Saltar las líneas hasta llegar a la línea deseada
            for (int i = 1; i < numeroLinea; i++) {
                br.readLine(); // Leer la línea pero no hacer nada con ella
            }
            // Leer la línea deseada
            linea = br.readLine();
            // Comparar la línea con el texto buscado
            if (linea != null && linea.equals(contraBuscar)) {

                MenuC menu = new MenuC();
                menu.setVisible(true);
                this.dispose();
            } else {
                System.out.println("Usuario y contraseña no coinciden ");
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnIngresarCMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        Seleccion sel = new Seleccion();
        sel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    
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
            java.util.logging.Logger.getLogger(LoginC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfPassC;
    private javax.swing.JTextField tfUsuarioC;
    // End of variables declaration//GEN-END:variables
}
