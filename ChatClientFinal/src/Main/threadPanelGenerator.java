/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import WebService.MessageThread;

/**
 *
 * @author Dilum De Siva
 */
public class threadPanelGenerator extends javax.swing.JPanel {

    /**
     * Creates new form AddThreadPanel
     */
    public threadPanelGenerator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAddThreadTittle = new javax.swing.JLabel();
        txtThreadTittle = new javax.swing.JTextField();
        lblAddTittle = new javax.swing.JLabel();
        btnCreateThread = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(13, 127, 137));

        lblAddThreadTittle.setForeground(new java.awt.Color(255, 255, 255));
        lblAddThreadTittle.setText("Add Thread");

        txtThreadTittle.setBackground(new java.awt.Color(13, 127, 137));
        txtThreadTittle.setForeground(new java.awt.Color(255, 255, 255));
        txtThreadTittle.setBorder(null);
        txtThreadTittle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThreadTittleActionPerformed(evt);
            }
        });

        lblAddTittle.setForeground(new java.awt.Color(255, 255, 255));
        lblAddTittle.setText("Thread Tittle");

        btnCreateThread.setForeground(new java.awt.Color(13, 127, 137));
        btnCreateThread.setText("Create Thread");
        btnCreateThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateThreadActionPerformed(evt);
            }
        });

        btnBack.setForeground(new java.awt.Color(13, 127, 137));
        btnBack.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddThreadTittle)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateThread))
                    .addComponent(lblAddTittle)
                    .addComponent(txtThreadTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblAddThreadTittle)
                .addGap(26, 26, 26)
                .addComponent(lblAddTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThreadTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateThread)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnCreateThread});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtThreadTittleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThreadTittleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThreadTittleActionPerformed

    private void btnCreateThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateThreadActionPerformed
        // TODO add your handling code here:
        try {
            addThread(txtThreadTittle.getText(), Main.BlaBlaClient.currentUser);
        } catch (Exception e) {
            // todo display the error message
        }
        Main.BlaBlaClient.changeWindow(new messageThreadPanelGenerator());

    }//GEN-LAST:event_btnCreateThreadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateThread;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddThreadTittle;
    private javax.swing.JLabel lblAddTittle;
    private javax.swing.JTextField txtThreadTittle;
    // End of variables declaration//GEN-END:variables

    private static MessageThread addThread(java.lang.String name, WebService.User user) {
        WebService.ChatService_Service service = new WebService.ChatService_Service();
        WebService.ChatService port = service.getChatServicePort();
        return port.addThread(name, user);
    }
}
