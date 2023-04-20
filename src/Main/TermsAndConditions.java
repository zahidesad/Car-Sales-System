package Main;

import SwingComponents.TransitionsForm;

/**
 *
 * @author zahid
 */
public class TermsAndConditions extends TransitionsForm {

    public TermsAndConditions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(0, 0, 204));
        setPreferredSize(new java.awt.Dimension(900, 441));

        jPanel1.setBackground(new java.awt.Color(246, 207, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(246, 207, 104));
        headerLabel.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("TERMS AND CONDITIONS");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 630, 50));

        jTextArea1.setBackground(new java.awt.Color(53, 53, 53));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("1) Conditions of use :\nBy using this website, you certify that you have read and reviewed this Agreement and that you agree to comply with its terms.\nIf you do not want to be bound by the terms of this Agreement, you are advised to stop using the website accordingly.  Baltaci.com\nonly grants use and access of this website, its products, and its services to those who have accepted its terms.\n\n2) Age restriction :\nYou must be at least 18 (eighteen) years of age before you can use this website. By using this website, you warrant that you are at least \n18 years of age and you may legally adhere to this Agreement. Baltaci.com assumes no responsibility for liabilities related to age \nmisrepresentation.\n\n3) Intellectual property :\nYou agree that all materials, products, and services provided on this website are the property of Baltaci.com, its affiliates, directors, officers,\nemployees, agents, suppliers, or licensors including all copyrights, trade secrets, trademarks, patents, and other intellectual property. \nYou also agree that you will not reproduce or redistribute the Baltaci.com’s intellectual property in any way, including electronic, digital, or new\ntrademark registrations. You grant Baltaci.com a royalty-free and non-exclusive license to display, use, copy, transmit, and broadcast the content\nyou upload and publish. For issues regarding intellectual property claims, you should contact the company in order to come to an agreement.\n\n4) User accounts\nAs a user of this website, you may be asked to register with us and provide private information. You are responsible for ensuring the accuracy\nof this information, and you are responsible for maintaining the safety and security of your identifying information. ");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 810, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Copyright © 2023 Baltaci.com All rights reserved.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
