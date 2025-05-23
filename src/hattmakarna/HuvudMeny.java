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
 * @author Fam van L
 */
public class HuvudMeny extends javax.swing.JFrame {
    
    private InfDB idb; 
    private String inloggadAnvandare; 
    /**
     * Creates new form HuvudMeny
     */
    public HuvudMeny(InfDB idb, String ePost) {
        initComponents();
        this.idb = idb; 
        this.inloggadAnvandare = inloggadAnvandare; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kalender = new javax.swing.JButton();
        SeBestallning = new javax.swing.JButton();
        SeKunder = new javax.swing.JButton();
        SeProdukt = new javax.swing.JButton();
        SkapaBestallning = new javax.swing.JButton();
        SkapaBestallningSpecial = new javax.swing.JButton();
        Forsaljning = new javax.swing.JButton();
        HanteraAnstalld = new javax.swing.JButton();
        LoggaUt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Kalender.setText("Visa kalenderschema");
        Kalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KalenderActionPerformed(evt);
            }
        });

        SeBestallning.setText("Se alla beställningar");

        SeKunder.setText("Se alla kunder");

        SeProdukt.setText("Se alla produkter");

        SkapaBestallning.setText("Skapa ny beställning");

        SkapaBestallningSpecial.setText("Skapa ny specialbeställning");

        Forsaljning.setText("Försäljningsstatistik");

        HanteraAnstalld.setText("Hantera anställda");

        LoggaUt.setText("Logga ut");

        jLabel1.setText("Huvudmeny");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HanteraAnstalld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(LoggaUt)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Forsaljning)
                                .addComponent(SkapaBestallningSpecial)
                                .addComponent(SkapaBestallning)
                                .addComponent(SeProdukt)
                                .addComponent(SeKunder)
                                .addComponent(SeBestallning)
                                .addComponent(Kalender)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(Kalender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SeBestallning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SeKunder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SeProdukt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SkapaBestallning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SkapaBestallningSpecial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Forsaljning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HanteraAnstalld)
                    .addComponent(LoggaUt))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KalenderActionPerformed
        // TODO add your handling code here:
        //new KalenderSchema(idb, inloggadAnvandare).setVisible();
       // this.setVisible(false);
    }//GEN-LAST:event_KalenderActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Forsaljning;
    private javax.swing.JButton HanteraAnstalld;
    private javax.swing.JButton Kalender;
    private javax.swing.JButton LoggaUt;
    private javax.swing.JButton SeBestallning;
    private javax.swing.JButton SeKunder;
    private javax.swing.JButton SeProdukt;
    private javax.swing.JButton SkapaBestallning;
    private javax.swing.JButton SkapaBestallningSpecial;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
