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
 * @author helinakravi
 */
public class LäggTillNyKund extends javax.swing.JFrame {
// lägg till koppling till databas

 private Validering validera; 
 private InfDB idb; 
    /**
     * Creates new form LäggTillNyKund
     */
    public LäggTillNyKund (InfDB idb) {  

        initComponents();
        this.idb = idb;

    btnSpara.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    sparaKund(); // Anropar metoden för att spara kunddata i databasen 


        }});
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textruta = new javax.swing.JLabel();
        lblKundNr = new javax.swing.JLabel();
        lnlFörnamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblTelefonnr = new javax.swing.JLabel();
        lblPostNr = new javax.swing.JLabel();
        lblOrt = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnSpara = new javax.swing.JButton();
        txtKundnummer = new javax.swing.JTextField();
        txtFörnamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtTelefonnummer = new javax.swing.JTextField();
        txtPostNummer = new javax.swing.JTextField();
        txtOrt = new javax.swing.JTextField();
        lblFakturaAdress = new javax.swing.JLabel();
        txtFakturaAdress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textruta.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        textruta.setText("Lägg till ny kund");

        lblKundNr.setText("Kundnummer:");

        lnlFörnamn.setText("Förnamn:");

        lblEfternamn.setText("Efternamn:");

        lblEpost.setText("Epost:");

        lblTelefonnr.setText("Telefonnummer:");

        lblPostNr.setText("Postnummer:");

        lblOrt.setText("Ort:");

        btnTillbaka.setText("Tillbaka");

        btnSpara.setText("Spara");

        lblFakturaAdress.setText("Faktura adress:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textruta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSpara)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEpost)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefonnr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblEfternamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lnlFörnamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKundNr)
                                .addGap(66, 66, 66)
                                .addComponent(txtKundnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFakturaAdress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFakturaAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(lblPostNr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPostNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(lblOrt)
                .addGap(18, 18, 18)
                .addComponent(txtOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(textruta)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKundNr)
                            .addComponent(txtKundnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnlFörnamn)
                            .addComponent(txtFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEfternamn)
                            .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEpost)
                            .addComponent(lblPostNr)
                            .addComponent(lblOrt)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPostNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefonnr)
                            .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFakturaAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFakturaAdress))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnSpara))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LäggTillNyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LäggTillNyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LäggTillNyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LäggTillNyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LäggTillNyKund().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFakturaAdress;
    private javax.swing.JLabel lblKundNr;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblPostNr;
    private javax.swing.JLabel lblTelefonnr;
    private javax.swing.JLabel lnlFörnamn;
    private javax.swing.JLabel textruta;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFakturaAdress;
    private javax.swing.JTextField txtFörnamn;
    private javax.swing.JTextField txtKundnummer;
    private javax.swing.JTextField txtOrt;
    private javax.swing.JTextField txtPostNummer;
    private javax.swing.JTextField txtTelefonnummer;
    // End of variables declaration//GEN-END:variables
}

//skyddar mot sql-injektion, genom att byta ut ' mot två'' (så att databasen inte tror att man avslutar koden tex)

private String skyddaSQL(String text) {
        if (text != null) {
            return text.replace("'", "''");
        }
        return null;

private void sparakund() {
    String förnamn = skyddaSQL(txtFörnamn.getText());
    String efternamn = skyddaSQL(txtEfternamn.getText());
    String epost = skyddaSQL(txtEpost.getText());
    String telefonNummer = skyddaSQL(txtTelefonnummer.getText());
    String fakturaAdress = skyddaSQL(txtFakturaAdress.getText());
    String postNummer = skyddaSQL(txtPostNummer.getText());
    String ort = skyddaSQL(txtOrt.getText());

//felmedelande som dyker upp ifall en ruta inte fylls i, går ej att spara då 

if (förnamn.isEmpty() || efternamn.isEmpty() || epost.isEmpty() ||
        telefonNummer.isEmpty() || fakturaAdress.isEmpty() || postNummer.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Alla fält måste fyllas i", "Fel", JOptionPane.ERROR_MESSAGE);
        return;
}

 try {
        String fraga = "INSERT INTO kunder (förnamn, efternamn, epost, telefonnummer, faktura_adress, postnummer, ort) " +
                       "VALUES ('" + förnamn + "', '" + efternamn + "', '" + epost + "', '" + telefonNummer + "', '" + fakturaAdress + "', '" + postNummer + "', '" + ort + "')";
        
//kör sql-frågan och ser till att spara datan i databasen
        idb.insert(fraga);

// Hämta det nyss genererade kundnumret (från AUTO_INCREMENT)
        String nyttID = idb.getAutoIncrement("kunder", "kundnummer");

        JOptionPane.showMessageDialog(this, "Kunddata har sparats!\nNytt kundnummer: " + nyttID, "Sparad", JOptionPane.INFORMATION_MESSAGE);

//om något går fel visas detta felmeddelande
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Fel vid sparning till databas: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
}

)); 

// ALTER TABLE kunder MODIFY kundnummer INT AUTO_INCREMENT;  lägg till i kundtabellen för att slumpmässigt generera kundid
