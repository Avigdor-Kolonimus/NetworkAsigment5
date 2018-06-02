/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
//libraries
import java.util.ArrayList;
import java.util.List;
/**
 * GUI for NetWork 5
 * @author Alexey Titov
 * @version 2.0
 */
public class AppBeda extends javax.swing.JFrame {

    /**
	 * serial id for app
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form AppBeda
     */
    public AppBeda() {
        initComponents();
    }
    /**
     * initialization for frame
     */
    private void initComponents() {

        buttonGroupMethod = new javax.swing.ButtonGroup();
        jTabbedPaneAssignment5 = new javax.swing.JTabbedPane();
        jPanelScanning = new javax.swing.JPanel();
        jLabelPort = new javax.swing.JLabel();
        jFormattedTextFieldIP = new javax.swing.JFormattedTextField();
        jLabelSM = new javax.swing.JLabel();
        jRadioButtonMethod1 = new javax.swing.JRadioButton();
        jRadioButtonMethod2 = new javax.swing.JRadioButton();
        jRadioButtonMethod3 = new javax.swing.JRadioButton();
        jButtonStart = new javax.swing.JButton();
        jScrollPaneTablePotts = new javax.swing.JScrollPane();
        jTablePorts = new javax.swing.JTable();
        jFormattedTextFieldtimeout = new javax.swing.JFormattedTextField();
        jLabelsec = new javax.swing.JLabel();
        jPanelPassword = new javax.swing.JPanel();
        jLabelIP = new javax.swing.JLabel();
        jFormattedTextFieldipPAS = new javax.swing.JFormattedTextField();
        jLabelUserDictionary = new javax.swing.JLabel();
        jTextFieldUserDictionary = new javax.swing.JTextField();
        jLabelPasswordDictionary = new javax.swing.JLabel();
        jTextFieldPasswordDictionary = new javax.swing.JTextField();
        jButtonPassOK = new javax.swing.JButton();
        jLabelOUTPUT = new javax.swing.JLabel();
        jTextFieldOUTPUT = new javax.swing.JTextField();
        jLabelOPENport = new javax.swing.JLabel();
        jTextFieldOPENport = new javax.swing.JTextField();
        jPanelSEND = new javax.swing.JPanel();
        jLabelIPsend = new javax.swing.JLabel();
        jFormattedTextFieldIPsend = new javax.swing.JFormattedTextField();
        jLabelUSERNAME = new javax.swing.JLabel();
        jTextFieldUSERNAME = new javax.swing.JTextField();
        jLabelPASSWORD = new javax.swing.JLabel();
        jTextFieldPASSWORD = new javax.swing.JTextField();
        jLabelFILES = new javax.swing.JLabel();
        jTextFieldFILE1 = new javax.swing.JTextField();
        jTextFieldFILE2 = new javax.swing.JTextField();
        jTextFieldFILE3 = new javax.swing.JTextField();
        jTextFieldFILE4 = new javax.swing.JTextField();
        jButtonSEND = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AppBeda");
        setMaximumSize(new java.awt.Dimension(380, 400));
        setMinimumSize(new java.awt.Dimension(380, 400));
        setName("frameAPP"); // NOI18N
        setPreferredSize(new java.awt.Dimension(380, 400));

        jTabbedPaneAssignment5.setMaximumSize(new java.awt.Dimension(360, 350));
        jTabbedPaneAssignment5.setMinimumSize(new java.awt.Dimension(360, 350));
        jTabbedPaneAssignment5.setPreferredSize(new java.awt.Dimension(360, 350));

        jPanelScanning.setMaximumSize(new java.awt.Dimension(340, 300));
        jPanelScanning.setMinimumSize(new java.awt.Dimension(340, 300));
        jPanelScanning.setPreferredSize(new java.awt.Dimension(340, 300));

        jLabelPort.setText("HOSTNAME:");

        jFormattedTextFieldIP.setColumns(18);
        try {
            jFormattedTextFieldIP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldIP.setMaximumSize(new java.awt.Dimension(150, 20));
        jFormattedTextFieldIP.setMinimumSize(new java.awt.Dimension(150, 20));

        jLabelSM.setText("scanning method");

        buttonGroupMethod.add(jRadioButtonMethod1);
        jRadioButtonMethod1.setText("1");

        buttonGroupMethod.add(jRadioButtonMethod2);
        jRadioButtonMethod2.setText("2");

        buttonGroupMethod.add(jRadioButtonMethod3);
        jRadioButtonMethod3.setSelected(true);
        jRadioButtonMethod3.setText("3");

        jButtonStart.setText("start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jScrollPaneTablePotts.setMinimumSize(new java.awt.Dimension(350, 120));
        jScrollPaneTablePotts.setPreferredSize(new java.awt.Dimension(350, 120));

        jTablePorts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePorts.setMinimumSize(new java.awt.Dimension(340, 110));
        jTablePorts.setPreferredSize(new java.awt.Dimension(340, 110));
        jScrollPaneTablePotts.setViewportView(jTablePorts);

        jFormattedTextFieldtimeout.setColumns(5);
        try {
            jFormattedTextFieldtimeout.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldtimeout.setText("1000");

        jLabelsec.setText("milsec");

        javax.swing.GroupLayout jPanelScanningLayout = new javax.swing.GroupLayout(jPanelScanning);
        jPanelScanning.setLayout(jPanelScanningLayout);
        jPanelScanningLayout.setHorizontalGroup(
            jPanelScanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScanningLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonStart)
                .addGap(35, 35, 35))
            .addGroup(jPanelScanningLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jRadioButtonMethod1)
                .addGap(110, 110, 110)
                .addComponent(jRadioButtonMethod2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonMethod3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelScanningLayout.createSequentialGroup()
                .addGroup(jPanelScanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelScanningLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jFormattedTextFieldtimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelsec))
                    .addGroup(jPanelScanningLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneTablePotts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelScanningLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabelSM)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelScanningLayout.setVerticalGroup(
            jPanelScanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScanningLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelScanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPort)
                    .addComponent(jFormattedTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldtimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSM)
                .addGap(11, 11, 11)
                .addGroup(jPanelScanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButtonMethod3)
                    .addComponent(jRadioButtonMethod2)
                    .addComponent(jRadioButtonMethod1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonStart)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTablePotts, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jTabbedPaneAssignment5.addTab("scanning", jPanelScanning);

        jPanelPassword.setBackground(new java.awt.Color(204, 255, 204));
        jPanelPassword.setMaximumSize(new java.awt.Dimension(340, 300));
        jPanelPassword.setMinimumSize(new java.awt.Dimension(340, 300));
        jPanelPassword.setPreferredSize(new java.awt.Dimension(340, 300));

        jLabelIP.setText("IP:");

        jFormattedTextFieldipPAS.setColumns(18);
        try {
            jFormattedTextFieldipPAS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldipPAS.setMaximumSize(new java.awt.Dimension(150, 20));
        jFormattedTextFieldipPAS.setMinimumSize(new java.awt.Dimension(150, 20));

        jLabelUserDictionary.setText("User dictionary");

        jLabelPasswordDictionary.setText("Password dictionary");

        jButtonPassOK.setText("OK");
        jButtonPassOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPassOKActionPerformed(evt);
            }
        });

        jLabelOUTPUT.setText("OUTPUT:");

        jTextFieldOUTPUT.setEditable(false);

        jLabelOPENport.setText("Open port");

        javax.swing.GroupLayout jPanelPasswordLayout = new javax.swing.GroupLayout(jPanelPassword);
        jPanelPassword.setLayout(jPanelPasswordLayout);
        jPanelPasswordLayout.setHorizontalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldOPENport)
                    .addComponent(jTextFieldOUTPUT)
                    .addComponent(jTextFieldUserDictionary)
                    .addComponent(jTextFieldPasswordDictionary)
                    .addGroup(jPanelPasswordLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPassOK))
                    .addGroup(jPanelPasswordLayout.createSequentialGroup()
                        .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOPENport)
                            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                                .addComponent(jLabelIP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldipPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelUserDictionary)
                            .addComponent(jLabelPasswordDictionary)
                            .addComponent(jLabelOUTPUT))
                        .addGap(0, 228, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPasswordLayout.setVerticalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIP)
                    .addComponent(jFormattedTextFieldipPAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUserDictionary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUserDictionary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPasswordDictionary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPasswordDictionary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOPENport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldOPENport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPassOK)
                .addGap(4, 4, 4)
                .addComponent(jLabelOUTPUT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldOUTPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPaneAssignment5.addTab("bruteforce", jPanelPassword);

        jPanelSEND.setBackground(new java.awt.Color(204, 204, 255));
        jPanelSEND.setMaximumSize(new java.awt.Dimension(340, 300));
        jPanelSEND.setMinimumSize(new java.awt.Dimension(340, 300));
        jPanelSEND.setPreferredSize(new java.awt.Dimension(340, 300));

        jLabelIPsend.setText("IP:");

        jFormattedTextFieldIPsend.setColumns(18);
        try {
            jFormattedTextFieldIPsend.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldIPsend.setMaximumSize(new java.awt.Dimension(150, 20));
        jFormattedTextFieldIPsend.setMinimumSize(new java.awt.Dimension(150, 20));

        jLabelUSERNAME.setText("USERNAME:");

        jTextFieldUSERNAME.setMaximumSize(new java.awt.Dimension(174, 20));
        jTextFieldUSERNAME.setMinimumSize(new java.awt.Dimension(174, 20));
        jTextFieldUSERNAME.setPreferredSize(new java.awt.Dimension(174, 20));

        jLabelPASSWORD.setText("PASSWORD:");

        jTextFieldPASSWORD.setMaximumSize(new java.awt.Dimension(174, 20));
        jTextFieldPASSWORD.setMinimumSize(new java.awt.Dimension(174, 20));
        jTextFieldPASSWORD.setPreferredSize(new java.awt.Dimension(174, 20));

        jLabelFILES.setText("FILES:");

        jButtonSEND.setText("SEND");
        jButtonSEND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSENDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSENDLayout = new javax.swing.GroupLayout(jPanelSEND);
        jPanelSEND.setLayout(jPanelSENDLayout);
        jPanelSENDLayout.setHorizontalGroup(
            jPanelSENDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSENDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSENDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFILE1)
                    .addComponent(jTextFieldFILE2)
                    .addComponent(jTextFieldFILE3)
                    .addGroup(jPanelSENDLayout.createSequentialGroup()
                        .addGroup(jPanelSENDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSENDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelSENDLayout.createSequentialGroup()
                                    .addComponent(jLabelIPsend)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFormattedTextFieldIPsend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelUSERNAME)
                                .addComponent(jLabelPASSWORD)
                                .addComponent(jTextFieldPASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldUSERNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelFILES))
                        .addGap(0, 146, Short.MAX_VALUE))
                    .addComponent(jTextFieldFILE4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSENDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSEND)))
                .addContainerGap())
        );
        jPanelSENDLayout.setVerticalGroup(
            jPanelSENDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSENDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSENDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIPsend)
                    .addComponent(jFormattedTextFieldIPsend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUSERNAME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUSERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPASSWORD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFILES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFILE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFILE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFILE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFILE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSEND)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPaneAssignment5.addTab("send", jPanelSEND);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneAssignment5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneAssignment5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //user press start
    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        HelpFunction hf=new HelpFunction();
        List<PORT> scanning_list;
        jTablePorts.removeAll();
        int tmp=Integer.parseInt(jFormattedTextFieldtimeout.getText());
        if (jRadioButtonMethod1.isSelected())
            scanning_list=hf.Scanning(1,jFormattedTextFieldIP.getText(),tmp);
        else
            if (jRadioButtonMethod2.isSelected())
                scanning_list=hf.Scanning(2,jFormattedTextFieldIP.getText(),tmp);
            else
                scanning_list=hf.Scanning(3,jFormattedTextFieldIP.getText(),tmp);
        //create table with data
        jTablePorts.setModel(new MyTableModel(scanning_list));
        hf.WriteCSV(scanning_list,jFormattedTextFieldIP.getText());
    }//GEN-LAST:event_jButtonStartActionPerformed
    //the function does brute force
    private void jButtonPassOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPassOKActionPerformed
        try{
            HelpFunction hf=new HelpFunction();
            String users=jTextFieldUserDictionary.getText();
            String passwords=jTextFieldPasswordDictionary.getText();
            String host=jFormattedTextFieldipPAS.getText();
            String port=jTextFieldOPENport.getText();
            jTextFieldOUTPUT.setText(hf.BruteForce(users,passwords,host,port));
        }catch(Exception e){
            jTextFieldOUTPUT.setText("EXCEPTION");
        }
    }//GEN-LAST:event_jButtonPassOKActionPerformed
    //send files to comp
    private void jButtonSENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSENDActionPerformed
        ArrayList<String> args=new ArrayList<>();
        SSHBRUTE ssh=new SSHBRUTE();
        args.add(jFormattedTextFieldIPsend.getText());
        args.add(jTextFieldUSERNAME.getText());
        args.add(jTextFieldPASSWORD.getText());
        if (!jTextFieldFILE1.getText().equals(""))
            args.add(jTextFieldFILE1.getText());
        if (!jTextFieldFILE2.getText().equals(""))
            args.add(jTextFieldFILE2.getText());
        if (!jTextFieldFILE3.getText().equals(""))
            args.add(jTextFieldFILE3.getText());
        if (!jTextFieldFILE4.getText().equals(""))
            args.add(jTextFieldFILE4.getText());
        ssh.conect(args);
    }//GEN-LAST:event_jButtonSENDActionPerformed
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
            java.util.logging.Logger.getLogger(AppBeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppBeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppBeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppBeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppBeda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMethod;
    private javax.swing.JButton jButtonPassOK;
    private javax.swing.JButton jButtonSEND;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JFormattedTextField jFormattedTextFieldIP;
    private javax.swing.JFormattedTextField jFormattedTextFieldIPsend;
    private javax.swing.JFormattedTextField jFormattedTextFieldipPAS;
    private javax.swing.JFormattedTextField jFormattedTextFieldtimeout;
    private javax.swing.JLabel jLabelFILES;
    private javax.swing.JLabel jLabelIP;
    private javax.swing.JLabel jLabelIPsend;
    private javax.swing.JLabel jLabelOPENport;
    private javax.swing.JLabel jLabelOUTPUT;
    private javax.swing.JLabel jLabelPASSWORD;
    private javax.swing.JLabel jLabelPasswordDictionary;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelSM;
    private javax.swing.JLabel jLabelUSERNAME;
    private javax.swing.JLabel jLabelUserDictionary;
    private javax.swing.JLabel jLabelsec;
    private javax.swing.JPanel jPanelPassword;
    private javax.swing.JPanel jPanelSEND;
    private javax.swing.JPanel jPanelScanning;
    private javax.swing.JRadioButton jRadioButtonMethod1;
    private javax.swing.JRadioButton jRadioButtonMethod2;
    private javax.swing.JRadioButton jRadioButtonMethod3;
    private javax.swing.JScrollPane jScrollPaneTablePotts;
    private javax.swing.JTabbedPane jTabbedPaneAssignment5;
    private javax.swing.JTable jTablePorts;
    private javax.swing.JTextField jTextFieldFILE1;
    private javax.swing.JTextField jTextFieldFILE2;
    private javax.swing.JTextField jTextFieldFILE3;
    private javax.swing.JTextField jTextFieldFILE4;
    private javax.swing.JTextField jTextFieldOPENport;
    private javax.swing.JTextField jTextFieldOUTPUT;
    private javax.swing.JTextField jTextFieldPASSWORD;
    private javax.swing.JTextField jTextFieldPasswordDictionary;
    private javax.swing.JTextField jTextFieldUSERNAME;
    private javax.swing.JTextField jTextFieldUserDictionary;
    // End of variables declaration//GEN-END:variables
}
