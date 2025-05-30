/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarna;
import oru.inf.InfDB; 
import oru.inf.InfException; 
import javax.swing.JOptionPane; 
/**
 *
 * @author Elin
 */
public class Inloggningssida extends javax.swing.JFrame {
    
    private Validering validera; 
    private InfDB idb; 
    /**
     * Creates new form Inloggningssida
     */
    public Inloggningssida(InfDB idb) {
        initComponents();
        this.idb = idb;
        lblFelMeddelande.setVisible(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInloggning = new javax.swing.JLabel();
        txtfEmail = new javax.swing.JTextField();
        lblEpost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        pswfLosenord = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();
        lblFelMeddelande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInloggning.setText("Inloggning");

        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });

        lblEpost.setText("E-post");

        lblLosenord.setText("Lösenord");

        pswfLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswfLosenordActionPerformed(evt);
            }
        });

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        lblFelMeddelande.setText("Felaktig inloggning! ");
        lblFelMeddelande.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                lblFelMeddelandeComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEpost)
                                .addComponent(lblLosenord))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pswfLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtfEmail)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLoggaIn)
                                .addComponent(lblFelMeddelande))))
                    .addComponent(lblInloggning, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblInloggning, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEpost))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLosenord))
                .addGap(33, 33, 33)
                .addComponent(btnLoggaIn)
                .addGap(18, 18, 18)
                .addComponent(lblFelMeddelande)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmailActionPerformed
        
    }//GEN-LAST:event_txtfEmailActionPerformed

    private void pswfLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswfLosenordActionPerformed
        
    }//GEN-LAST:event_pswfLosenordActionPerformed
        //Knapp för att logga in med inmatad e-Post och lösenord. 
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        //Hämtar användarinmatning
        String ePost = txtfEmail.getText();
        char[] losenord = pswfLosenord.getPassword();
        String losen = new String(losenord);
      
        try{
            //Hej
            lblFelMeddelande.setVisible(false);
            //Validerar inmatningen
            if(validera.valideringEmail(ePost)){
                String selectLosenord = "select losenord from anstalld where epost = '" + ePost + "';";
                String dbLosen = idb.fetchSingle(selectLosenord); //dbLosen är den den variabel som får svaret ifrån frågan som skickas in. Använder objektet som har en databasuppkoppling
                //Om inloggning lyckas öppnas nästa fönster. Vilket är huvudmenyn. 
                if(losen.equals(dbLosen)){ //Viktigt att det som står före equals inte är null. Detta eftersom att null inte har några metoder (t.ex equals)
                    new HuvudMeny(idb,ePost).setVisible(true); 
                    this.setVisible(false); 
                    }
                //Är inloggningen fel visas istället ett felmeddelande. 
                else{
                    lblFelMeddelande.setVisible(true);
                    lblFelMeddelande.setText("Fel epostadress eller lösenord");
                    txtfEmail.setText("");
                    pswfLosenord.setText("");
                }
            }
            else{
                lblFelMeddelande.setVisible(true);
                lblFelMeddelande.setText("Ange en korrekt epostadress");
                txtfEmail.setText("");
                pswfLosenord.setText("");
            }
        }
        catch(InfException ex){
            //kolla så att användaren faktiskt lagt in någonting i epost samt losen.
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void lblFelMeddelandeComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblFelMeddelandeComponentHidden
        
    }//GEN-LAST:event_lblFelMeddelandeComponentHidden

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
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Inloggningssida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFelMeddelande;
    private javax.swing.JLabel lblInloggning;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JPasswordField pswfLosenord;
    private javax.swing.JTextField txtfEmail;
    // End of variables declaration//GEN-END:variables
}
