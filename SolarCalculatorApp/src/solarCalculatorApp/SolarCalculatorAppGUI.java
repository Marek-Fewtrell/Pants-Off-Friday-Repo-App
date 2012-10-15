/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package solarCalculatorApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author james
 */
public class SolarCalculatorAppGUI extends javax.swing.JFrame {
    private String defaultHelpString = "Help area.\nContents change depending"
            + " on which input field the user is currently active in."
            + "\n\nClick on the Generate Report Button when you have finished"
            + " entering the correct details in all of the fields."
            + "\n\nClick on the Reset Fields Button if you wish to start over.";

    /**
     * Creates new form SolarCalculatorAppGUI
     */
    public SolarCalculatorAppGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPanelBrand = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxInverterBrand = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNumPanels = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaHelp = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEnergyProvider = new javax.swing.JComboBox();
        jComboBoxPanelModel = new javax.swing.JComboBox();
        jComboBoxInverterModel = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTilt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldOrientation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPostcode = new javax.swing.JTextField();
        jButtonReport = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldInstallCost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDailyUsage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select Panel");

        jComboBoxPanelBrand.setModel(new javax.swing.DefaultComboBoxModel());
        jComboBoxPanelBrand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxPanelBrandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxPanelBrandFocusLost(evt);
            }
        });

        jLabel2.setText("Select Inverter");

        jComboBoxInverterBrand.setModel(new javax.swing.DefaultComboBoxModel());
        jComboBoxInverterBrand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxInverterBrandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxInverterBrandFocusLost(evt);
            }
        });

        jLabel3.setText("Number of Panels");

        jTextFieldNumPanels.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNumPanelsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNumPanelsFocusLost(evt);
            }
        });

        jTextAreaHelp.setEditable(false);
        jTextAreaHelp.setColumns(20);
        jTextAreaHelp.setLineWrap(true);
        jTextAreaHelp.setRows(5);
        jTextAreaHelp.setText("Help area. \nContents change depending on which input field the user is currently active in.");
        jTextAreaHelp.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaHelp);

        jLabel4.setText("Select Energy Provider");

        jComboBoxEnergyProvider.setModel(new javax.swing.DefaultComboBoxModel());
        jComboBoxEnergyProvider.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxEnergyProviderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxEnergyProviderFocusLost(evt);
            }
        });
        
        jComboBoxInverterBrand.addActionListener(new ActionListener () {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				GuiTalker asd = new GuiTalker();
 				ArrayList<String> temp = asd.inverterBrandModels.get(jComboBoxInverterBrand.getSelectedItem().toString());
 				jComboBoxInverterModel.removeAllItems();
 				for (int i=0 ; i<temp.size() ; i++) {
 					jComboBoxInverterModel.addItem(temp.get(i).toString());
 				}
 				
 			}
         });
        
        jComboBoxPanelBrand.addActionListener(new ActionListener () {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				GuiTalker asd = new GuiTalker();
 				ArrayList<String> temp = asd.panelBrandModels.get(jComboBoxPanelBrand.getSelectedItem().toString());
 				jComboBoxPanelModel.removeAllItems();
 				for (int i=0 ; i<temp.size() ; i++) {
 					System.out.println(temp.get(i).toString());
 					jComboBoxPanelModel.addItem(temp.get(i).toString());
 				}
 				
 			}
         });

        jComboBoxPanelModel.setModel(new javax.swing.DefaultComboBoxModel());
        jComboBoxPanelModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxPanelModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxPanelModelFocusLost(evt);
            }
        });

        jComboBoxInverterModel.setModel(new javax.swing.DefaultComboBoxModel());
        jComboBoxInverterModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxInverterModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxInverterModelFocusLost(evt);
            }
        });

    	
    	GuiTalker sendStuff = new GuiTalker();
    	populateList(sendStuff.getPopData());
        
        jLabel5.setText("Tilt Angle");

        jTextFieldTilt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldTiltFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTiltFocusLost(evt);
            }
        });

        jLabel6.setText("Roof Orientation");

        jTextFieldOrientation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldOrientationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldOrientationFocusLost(evt);
            }
        });

        jLabel7.setText("Postcode");

        jTextFieldPostcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPostcodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPostcodeFocusLost(evt);
            }
        });

        jButtonReport.setText("Generate Report");
        jButtonReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReportMouseClicked(evt);
            }
        });

        jButtonReset.setText("Reset Fields");

        jLabel8.setText("Installation Cost ($)");

        jTextFieldInstallCost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldInstallCostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldInstallCostFocusLost(evt);
            }
        });

        jLabel9.setText("Avg Daily Usage (kiloWatts)");

        jTextFieldDailyUsage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDailyUsageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDailyUsageFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDailyUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBoxInverterModel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxInverterBrand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxPanelModel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxPanelBrand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldInstallCost, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldNumPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTilt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxEnergyProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldOrientation)
                                .addGap(103, 103, 103)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonReport)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPostcode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReset)
                        .addGap(122, 122, 122))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumPanels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPanelBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxPanelModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxEnergyProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxInverterBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxInverterModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTilt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOrientation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstallCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReport))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDailyUsage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReset)))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    //FocusGained and FocusLost event handling code for Help Contents
    private void jTextFieldNumPanelsFocusGained(java.awt.event.FocusEvent evt) {                                                
        jTextAreaHelp.setText("Enter the total number of Solar Panels that are"
                + " going to be installed on the roof of your home.");
    }                                               

    private void jTextFieldNumPanelsFocusLost(java.awt.event.FocusEvent evt) {                                              
        jTextAreaHelp.setText(defaultHelpString);
    }                                             

    private void jComboBoxEnergyProviderFocusGained(java.awt.event.FocusEvent evt) {                                                    
        jTextAreaHelp.setText("Select your current Energy Provider from the"
                + " list of available Companies.");
    }                                                   

    private void jComboBoxEnergyProviderFocusLost(java.awt.event.FocusEvent evt) {                                                  
        jTextAreaHelp.setText(defaultHelpString);
    }                                                 

    private void jTextFieldTiltFocusGained(java.awt.event.FocusEvent evt) {                                           
        jTextAreaHelp.setText("Enter the known tilt angle of the panels"
                + " on the roof, in whole degrees.");
    }                                          

    private void jTextFieldTiltFocusLost(java.awt.event.FocusEvent evt) {                                         
        jTextAreaHelp.setText(defaultHelpString);
    }                                        

    private void jTextFieldOrientationFocusGained(java.awt.event.FocusEvent evt) {                                                  
        jTextAreaHelp.setText("Enter the known orientation of your roof"
                + " in whole degrees deviation from Solar North. This value can"
                + " be positive or negative.");
    }                                                 

    private void jTextFieldOrientationFocusLost(java.awt.event.FocusEvent evt) {                                                
        jTextAreaHelp.setText(defaultHelpString);
    }                                               

    private void jTextFieldPostcodeFocusGained(java.awt.event.FocusEvent evt) {                                               
        jTextAreaHelp.setText("Enter your postcode.");
    }                                              

    private void jTextFieldPostcodeFocusLost(java.awt.event.FocusEvent evt) {                                             
        jTextAreaHelp.setText(defaultHelpString);
    }                                            

    private void jTextFieldInstallCostFocusGained(java.awt.event.FocusEvent evt) {                                                  
        jTextAreaHelp.setText("Enter the initial cost of the Solar Panel"
                + " installation in whole dollars.");
    }                                                 

    private void jTextFieldInstallCostFocusLost(java.awt.event.FocusEvent evt) {                                                
        jTextAreaHelp.setText(defaultHelpString);
    }                                               

    private void jTextFieldDailyUsageFocusGained(java.awt.event.FocusEvent evt) {                                                 
        jTextAreaHelp.setText("Enter your current average daily energy consumption"
                + " in whole kiloWatts.");
    }                                                

    private void jTextFieldDailyUsageFocusLost(java.awt.event.FocusEvent evt) {                                               
        jTextAreaHelp.setText(defaultHelpString);
    }                                              

    private void jComboBoxPanelBrandFocusGained(java.awt.event.FocusEvent evt) {                                                
        jTextAreaHelp.setText("Select the Brand of your Panels.");
    }                                               

    private void jComboBoxPanelBrandFocusLost(java.awt.event.FocusEvent evt) {                                              
        jTextAreaHelp.setText(defaultHelpString);
    }                                             

    private void jComboBoxPanelModelFocusGained(java.awt.event.FocusEvent evt) {                                                
        jTextAreaHelp.setText("Select the corresponding Model of your Panels.");
    }                                               

    private void jComboBoxPanelModelFocusLost(java.awt.event.FocusEvent evt) {                                              
        jTextAreaHelp.setText(defaultHelpString);
    }                                             

    private void jComboBoxInverterBrandFocusGained(java.awt.event.FocusEvent evt) {                                                   
        jTextAreaHelp.setText("Select the Brand of your Inverter.");
    }                                                  

    private void jComboBoxInverterBrandFocusLost(java.awt.event.FocusEvent evt) {                                                 
        jTextAreaHelp.setText(defaultHelpString);
    }                                                

    private void jComboBoxInverterModelFocusGained(java.awt.event.FocusEvent evt) {                                                   
        jTextAreaHelp.setText("Select the corresponding Model of your Inverter.");
    }                                                  

    private void jComboBoxInverterModelFocusLost(java.awt.event.FocusEvent evt) {                                                 
        jTextAreaHelp.setText(defaultHelpString);
    }
    
    //Buttons Event Handling
    private void jButtonReportMouseClicked(java.awt.event.MouseEvent evt) {
        GuiTalker sendStuff = new GuiTalker();
        //HashMap<String, ArrayList<String>> dataOut = sendStuff.getPopData();
        //sendStuff.sendCalcData();
    	
    	String sendToServerValues = "?";
    	sendToServerValues += "panelNum=" + jComboBoxPanelModel.getSelectedItem().toString() + "&";
    	sendToServerValues += "numPanel=" + jTextFieldNumPanels.getText() + "&";
    	sendToServerValues += "postcode=" + jTextFieldPostcode.getText() + "&";
    	sendToServerValues += "invNum=" + jComboBoxInverterModel.getSelectedItem().toString() + "&";
    	sendToServerValues += "energyComp=" + jComboBoxEnergyProvider.getSelectedItem().toString() + "&";
    	sendToServerValues += "dailyUsage=" + jTextFieldDailyUsage.getText() + "&";
    	sendToServerValues += "tilt=" + jTextFieldTilt.getText() + "&";
    	sendToServerValues += "orientation=" + jTextFieldOrientation.getText() + "&";
    	sendToServerValues += "initInstalCost=" + jTextFieldInstallCost.getText();
        sendStuff.sendCalcData(sendToServerValues);
    }
    
    private void populateList(HashMap<String, ArrayList<String>> data) { 
    	ArrayList<String> inverterBrand = data.get("Inverter Brand");
    	for (int i=0 ; i<inverterBrand.size(); i++) {
    		jComboBoxInverterBrand.addItem(inverterBrand.get(i));
    	}
    	
    	ArrayList<String> inverterModel = data.get("Panel Brand");
    	for (int i=0 ; i<inverterModel.size(); i++) {
    		jComboBoxPanelBrand.addItem(inverterModel.get(i));
    	}
    	
    	ArrayList<String> energyProv = data.get("Energy");
    	for (int i=0 ; i<energyProv.size(); i++) {
    		jComboBoxEnergyProvider.addItem(energyProv.get(i));
    	}

    }

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
            java.util.logging.Logger.getLogger(SolarCalculatorAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolarCalculatorAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolarCalculatorAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolarCalculatorAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolarCalculatorAppGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JComboBox jComboBoxEnergyProvider;
    private javax.swing.JComboBox jComboBoxInverterBrand;
    private javax.swing.JComboBox jComboBoxInverterModel;
    private javax.swing.JComboBox jComboBoxPanelBrand;
    private javax.swing.JComboBox jComboBoxPanelModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaHelp;
    private javax.swing.JTextField jTextFieldDailyUsage;
    private javax.swing.JTextField jTextFieldInstallCost;
    private javax.swing.JTextField jTextFieldNumPanels;
    private javax.swing.JTextField jTextFieldOrientation;
    private javax.swing.JTextField jTextFieldPostcode;
    private javax.swing.JTextField jTextFieldTilt;
    // End of variables declaration                   
}
