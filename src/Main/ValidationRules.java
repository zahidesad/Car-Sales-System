package Main;

import SwingComponents.TransitionsForm;

/**
 *
 * @author zahid
 */
public class ValidationRules extends TransitionsForm {

    /**
     * Creates new form NewJPanel1
     */
    public ValidationRules() {
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
        headerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUsernameValidation = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtUsernameValidation1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUsernameValidation2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtUsernameValidation3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtUsernameValidation4 = new javax.swing.JTextArea();

        setBackground(java.awt.Color.gray);
        setForeground(java.awt.Color.gray);

        jPanel1.setBackground(new java.awt.Color(246, 207, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(246, 207, 104));
        headerLabel.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("VALIDATION RULES");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 630, 50));

        txtUsernameValidation.setBackground(new java.awt.Color(53, 53, 53));
        txtUsernameValidation.setColumns(20);
        txtUsernameValidation.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        txtUsernameValidation.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameValidation.setLineWrap(true);
        txtUsernameValidation.setRows(5);
        txtUsernameValidation.setText("                        PASSWORD VALIDATION RULES\n\n1) It contains at least 8 characters and at most 20 characters.\n2) It contains at least one digit..\n3) It contains at least one upper case alphabet.\n4) It contains at least one lower case alphabet.\n5) It contains at least one special character which includes !@#$%&*()-+=^.\n6) It doesn’t contain any white space.\n");
        txtUsernameValidation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jScrollPane1.setViewportView(txtUsernameValidation);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 350, 150));

        txtUsernameValidation1.setBackground(new java.awt.Color(53, 53, 53));
        txtUsernameValidation1.setColumns(20);
        txtUsernameValidation1.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        txtUsernameValidation1.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameValidation1.setLineWrap(true);
        txtUsernameValidation1.setRows(5);
        txtUsernameValidation1.setText("                           E-MAIL VALIDATION RULES\n\n1) It cannot start special characters.\n2) It must contains @ symbol.\n3) It something must come after the @ symbol.\n\n");
        txtUsernameValidation1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jScrollPane2.setViewportView(txtUsernameValidation1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 350, 120));

        txtUsernameValidation2.setBackground(new java.awt.Color(53, 53, 53));
        txtUsernameValidation2.setColumns(20);
        txtUsernameValidation2.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        txtUsernameValidation2.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameValidation2.setLineWrap(true);
        txtUsernameValidation2.setRows(5);
        txtUsernameValidation2.setText("                         USERNAME VALIDATION RULES\n\n1) The username consists of 6 to 30 characters inclusive.\n2) The username can only contain alphanumeric charactersand underscores (_).\n3) The first character of the username must be an alphabetic \ncharacter.\"\n");
        txtUsernameValidation2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jScrollPane3.setViewportView(txtUsernameValidation2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 350, 150));

        txtUsernameValidation3.setBackground(new java.awt.Color(53, 53, 53));
        txtUsernameValidation3.setColumns(20);
        txtUsernameValidation3.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        txtUsernameValidation3.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameValidation3.setLineWrap(true);
        txtUsernameValidation3.setRows(5);
        txtUsernameValidation3.setText("                    PHONE NO VALIDATION RULES\n\n1) It should be in the form xxx-xxx-xxxx\n2) It should not contain any letters\n");
        txtUsernameValidation3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jScrollPane4.setViewportView(txtUsernameValidation3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 260, 90));

        txtUsernameValidation4.setBackground(new java.awt.Color(53, 53, 53));
        txtUsernameValidation4.setColumns(20);
        txtUsernameValidation4.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        txtUsernameValidation4.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameValidation4.setLineWrap(true);
        txtUsernameValidation4.setRows(5);
        txtUsernameValidation4.setText("                         NAME AND VALIDATION RULES\n\n1) It must start with a capital or lowercase letter.\n2) It must be 2-20 characters long.\n3) It must not contain any special characters\n");
        txtUsernameValidation4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jScrollPane5.setViewportView(txtUsernameValidation4);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 350, 120));

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtUsernameValidation;
    private javax.swing.JTextArea txtUsernameValidation1;
    private javax.swing.JTextArea txtUsernameValidation2;
    private javax.swing.JTextArea txtUsernameValidation3;
    private javax.swing.JTextArea txtUsernameValidation4;
    // End of variables declaration//GEN-END:variables
}