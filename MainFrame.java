/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.FileChooserUI;

/**
 *
 * @author hanee
 */
public class MainFrame extends javax.swing.JFrame {
    
    private String imagePath;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        MainPanel = new javax.swing.JPanel();
        fNameLabel = new javax.swing.JLabel();
        fNameTextInput = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lNameTextInput = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageNumInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextInput = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneNumInput = new javax.swing.JTextField();
        uploadLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        MainPanel.setBackground(new java.awt.Color(153, 153, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(640, 360));
        MainPanel.setVerifyInputWhenFocusTarget(false);

        fNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fNameLabel.setText("First Name");

        fNameTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextInputActionPerformed(evt);
            }
        });

        lNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lNameLabel.setText("Last Name");

        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("Phone number");

        uploadLabel.setForeground(new java.awt.Color(255, 255, 255));
        uploadLabel.setText("Upload photo");

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoHandler(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onButtonSubmitEvent(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Detail Display");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneLabel)
                    .addComponent(ageLabel)
                    .addComponent(fNameLabel)
                    .addComponent(ageNumInput)
                    .addComponent(fNameTextInput)
                    .addComponent(phoneNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadLabel)
                    .addComponent(emailLabel)
                    .addComponent(lNameLabel)
                    .addComponent(lNameTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadButton))
                .addGap(58, 58, 58))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(submitButton))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(fNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fNameTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(submitButton)
                        .addGap(50, 50, 50))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(lNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNameTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uploadLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uploadButton)
                        .addGap(111, 111, 111))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextInputActionPerformed

    private void onButtonSubmitEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onButtonSubmitEvent
        // TODO add your handling code here:
        String fName = fNameTextInput.getText();
        String lName = lNameTextInput.getText();
        String ageString = ageNumInput.getText();
        String email = emailTextInput.getText();
        String phoneString = phoneNumInput.getText();
        
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        

//        Checking if all the inputs are entered
        if (fName == null || fName.isEmpty() || lName == null || lName.isEmpty() || ageString == null || ageString.isEmpty() || email == null || email.isEmpty() || phoneString == null || phoneString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please make sure you entered all the values!", "Form Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int age = 0;
        int phone = 0;
        String emailRegex = "^(.+)@(.+)$";

        boolean ageValidated = true;
        boolean phoneValidated = true;
        boolean emailValidated = true;

        try {
            age = Integer.parseInt(ageString);
        } catch (NumberFormatException e) {
            ageValidated = false;
        }

        try {
            phone = Integer.parseInt(phoneString);
        } catch (NumberFormatException e) {
            phoneValidated = false;
        }

        if (!email.matches(emailRegex)) {
            emailValidated = false;
        }

        if (!ageValidated && !phoneValidated) {
            JOptionPane.showMessageDialog(this, "Make sure your age and phone number are only numbers!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else if (!ageValidated) {
            JOptionPane.showMessageDialog(this, "Make sure your age is only numbers!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else if (!emailValidated) {
            JOptionPane.showMessageDialog(this, "Make sure your email is valid!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else if (!phoneValidated) {
            JOptionPane.showMessageDialog(this, "Make sure your phone number is only numbers!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else if(imagePath == null || imagePath.isEmpty()){
        JOptionPane.showMessageDialog(this, "Make sure you uploaded an image!", "Image Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "First name: " + fName + "\n" + "Last name: " + lName + "\n" + "Age " + ageString + "\n" + "Email: " + email + "\n" + "Phone Number: " + phoneString + "\n", "User information", JOptionPane.PLAIN_MESSAGE, scaledIcon);
        }


    }//GEN-LAST:event_onButtonSubmitEvent

    private void uploadPhotoHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoHandler
        // TODO add your handling code here:
       JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagePath = selectedFile.getAbsolutePath();
            
        }
    }//GEN-LAST:event_uploadPhotoHandler

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageNumInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextInput;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneNumInput;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadLabel;
    // End of variables declaration//GEN-END:variables
}
