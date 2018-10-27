/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display_assignment;
import data.Demographic;
import data.DriversLicense;
import data.Address;
import data.BankAccount;
import data.MedicalRecord;
/**
 *
 * @author Tanny
 */
public class MainJFrame extends javax.swing.JFrame {
    final private Demographic demoData;
    final private MedicalRecord medicalData;
    final private Address addData;
    final private BankAccount bankData;
    final private BankAccount bankDataChecking;
    final private DriversLicense driverLic;
    
    public MainJFrame() {
        initComponents();
        demoData = new Demographic();
        addData = demoData.getAddr();
        medicalData = demoData.getMedical();
        bankData = demoData.getBankAccountSaving();
        bankDataChecking= demoData.getBankAccountChecking();
        driverLic = demoData.getDl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPaneMain = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        demoInfoBtn = new javax.swing.JButton();
        addressBtn = new javax.swing.JButton();
        bankAccChecking = new javax.swing.JButton();
        medicalBtn = new javax.swing.JButton();
        finalReportBtn = new javax.swing.JButton();
        driversBtn = new javax.swing.JButton();
        bankAccSaving = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        demoInfoBtn.setText("Demographic Information");
        demoInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoInfoBtnActionPerformed(evt);
            }
        });

        addressBtn.setText("Address");
        addressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressBtnActionPerformed(evt);
            }
        });

        bankAccChecking.setText("Bank Account-Checking");
        bankAccChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankAccCheckingActionPerformed(evt);
            }
        });

        medicalBtn.setText("Medical Records");
        medicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalBtnActionPerformed(evt);
            }
        });

        finalReportBtn.setText("View Report");
        finalReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalReportBtnActionPerformed(evt);
            }
        });

        driversBtn.setText("Drivers License");
        driversBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driversBtnActionPerformed(evt);
            }
        });

        bankAccSaving.setText("Bank Account-Saving");
        bankAccSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankAccSavingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(demoInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bankAccChecking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medicalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(driversBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bankAccSaving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(demoInfoBtn)
                .addGap(4, 4, 4)
                .addComponent(addressBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bankAccSaving)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bankAccChecking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driversBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(finalReportBtn)
                .addGap(32, 32, 32))
        );

        splitPaneMain.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        splitPaneMain.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void demoInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoInfoBtnActionPerformed
       DemographicInfoJPanel demo = new DemographicInfoJPanel(demoData);
       splitPaneMain.setRightComponent(demo);
    }//GEN-LAST:event_demoInfoBtnActionPerformed

    private void medicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalBtnActionPerformed
        splitPaneMain.setRightComponent(new MedicalInformationJPanel(medicalData));   
    }//GEN-LAST:event_medicalBtnActionPerformed

    private void addressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressBtnActionPerformed
        splitPaneMain.setRightComponent(new AddressInfoJPanel(addData));
    }//GEN-LAST:event_addressBtnActionPerformed

    private void bankAccCheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankAccCheckingActionPerformed
        splitPaneMain.setRightComponent(new CheckingAccountJPanel(bankDataChecking));
    }//GEN-LAST:event_bankAccCheckingActionPerformed

    private void finalReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalReportBtnActionPerformed
        ViewJPanel view = new ViewJPanel(demoData);
        splitPaneMain.setRightComponent(view);
        
        
        //Demographic Data Panel
//        view.firstNmTxtField.setText(demoData.getFirstName());
//        view.lastNameTxtField.setText(demoData.getLastName());
//        view.phNumTextField.setText(Long.toString(demoData.getPhNum()));
//        view.ssnTextField.setText(demoData.getSsn());
//        view.heightTextField.setText(Double.toString(demoData.getHeight()));
//        view.weightTextField.setText(Double.toString(demoData.getWeight()));
//        view.dobTxtField.setText(demoData.getDob());
//        //dob, if possible, make it to string
//        
//        //Address Panel
//        view.streetAdd.setText(addData.getStreetAdd());
//        view.stateField.setText(addData.getState());
//        view.zipCdField.setText(addData.getZip());
//        view.zipCdField.getText();
//        view.cityTxtField.setText(addData.getCity());
//        
////        view.streetAdd.setText(demoData.getAddr().getStreetAdd());
////        view.stateField.setText(demoData.getAddr().getState());
////        view.zipCdField.setText(Integer.toString(demoData.getAddr().getZip()));
////        view.zipCdField.getText();
////        view.cityTxtField.setText(demoData.getAddr().getCity());
////        
//        
//        //Medical Panel
//        view.recNumTxtField.setText(Long.toString(medicalData.getRecordNum()));
//        view.allergy1.setText(medicalData.getAllergy1());
//        view.allergy2.setText(medicalData.getAllergy2());
//        view.allergy3.setText(medicalData.getAllergy3());
//        
////        view.recNumTxtField.setText(Long.toString(demoData.getMedical().getRecordNum()));
////        view.allergy1.setText(demoData.getMedical().getAllergy1());
////        view.allergy2.setText(demoData.getMedical().getAllergy2());
////        view.allergy3.setText(demoData.getMedical().getAllergy3());
//        
//        
//        //Savings Account Details
//        view.bankName.setText(bankData.getBankName());
//        view.routingNum.setText(Integer.toString(bankData.getRoutingNum()));
//        view.accNum.setText(Integer.toString(bankData.getAccNum()));
//        view.accBal.setText(Double.toString(bankData.getAccBalance()));
//        
////        view.bankName.setText(demoData.getBankAccountSaving().getBankName());
////        view.routingNum.setText(Integer.toString(demoData.getBankAccountSaving().getRoutingNum()));
////        view.accNum.setText(Integer.toString(demoData.getBankAccountSaving().getAccNum()));
////        view.accBal.setText(Double.toString(demoData.getBankAccountSaving().getAccBalance()));
//        
//        
//        //Checking Account Details
//        view.bankNameChecking.setText(bankDataChecking.getBankName());
//        view.routingNumChecking.setText(Integer.toString(bankDataChecking.getRoutingNum()));
//        view.accNumChecking.setText(Integer.toString(bankDataChecking.getAccNum()));
//        view.accBalChecking.setText(Double.toString(bankDataChecking.getAccBalance()));
//
////        view.bankNameChecking.setText(demoData.getBankAccountChecking().getBankName());
////        view.routingNumChecking.setText(Integer.toString(demoData.getBankAccountChecking().getRoutingNum()));
////        view.accNumChecking.setText(Integer.toString(demoData.getBankAccountChecking().getAccNum()));
////        view.accBalChecking.setText(Double.toString(demoData.getBankAccountChecking().getAccBalance()));
//        
//        
//        //Write drivers license data
//        view.licenseNumTxtField.setText(Long.toString(driverLic.getLicenseNum()));
//        view.issueDtTxtField.setText(driverLic.getDateOfIssue());
//        view.expDtTxtField.setText(driverLic.getDateOfExpiration());
//        view.bloodTypeTxtField.setText(driverLic.getBloodType());    
    }//GEN-LAST:event_finalReportBtnActionPerformed

    private void driversBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driversBtnActionPerformed
     DriversLicenseJPanel driversLicense = new DriversLicenseJPanel(driverLic);
     splitPaneMain.setRightComponent(driversLicense);
    }//GEN-LAST:event_driversBtnActionPerformed

    private void bankAccSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankAccSavingActionPerformed
    splitPaneMain.setRightComponent(new SavingsAccountJPanel(bankData));
    }//GEN-LAST:event_bankAccSavingActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addressBtn;
    private javax.swing.JButton bankAccChecking;
    private javax.swing.JButton bankAccSaving;
    private javax.swing.JButton demoInfoBtn;
    private javax.swing.JButton driversBtn;
    private javax.swing.JButton finalReportBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton medicalBtn;
    private javax.swing.JSplitPane splitPaneMain;
    // End of variables declaration//GEN-END:variables
}
