
package chucknorrisfactgui;

public class ChuckNorrisFactJFrame extends javax.swing.JFrame {
    
    // TODO: Create a ChuckNorrisFact object here.    
    private ChuckNorrisFact cnf = new ChuckNorrisFact();

    /**
     * Creates new form ChuckNorrisFactJFrame
     */
    public ChuckNorrisFactJFrame() {
        initComponents();
        // TODO: Get Random Joke place in TextArea
        this.jTextAreaFact.setText(cnf.getRandomJoke());        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGetFact = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaFact = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chuck Norris Facts");
        setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        setResizable(false);

        jButtonGetFact.setText("Get Another Fact");
        jButtonGetFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetFactActionPerformed(evt);
            }
        });

        jScrollPane1.setFocusable(false);
        jScrollPane1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setName(""); // NOI18N

        jTextAreaFact.setEditable(false);
        jTextAreaFact.setColumns(20);
        jTextAreaFact.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jTextAreaFact.setLineWrap(true);
        jTextAreaFact.setRows(5);
        jTextAreaFact.setWrapStyleWord(true);
        jTextAreaFact.setAutoscrolls(false);
        jTextAreaFact.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextAreaFact.setFocusable(false);
        jScrollPane1.setViewportView(jTextAreaFact);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jButtonGetFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGetFact)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGetFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetFactActionPerformed
        // TODO: Get Random Joke place in TextArea
        this.jTextAreaFact.setText(cnf.getRandomJoke());        
    }//GEN-LAST:event_jButtonGetFactActionPerformed

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
            java.util.logging.Logger.getLogger(ChuckNorrisFactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuckNorrisFactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuckNorrisFactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuckNorrisFactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuckNorrisFactJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGetFact;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaFact;
    // End of variables declaration//GEN-END:variables
}
