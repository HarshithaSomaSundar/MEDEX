/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SuppliesManagerRole;

import Buisness.Products.Product;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Harshitha
 */
public class SuppliesManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SuppliesManagerWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization Organization;
    private Enterprise enterprise;
    private ImageIcon i;
    private BufferedImage origImage = null;
    
     private List<Product> allproductslist;

   
    public SuppliesManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,EcoSystem business ) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.Organization = organization;
        this.business=business;
        
        
        
        
        populate();
        
         
      
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        lblSearchAccNo = new javax.swing.JLabel();
        lblManage = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 44, 91));

        detailsBtn.setBackground(new java.awt.Color(44, 44, 91));
        detailsBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        detailsBtn.setForeground(new java.awt.Color(171, 238, 255));
        detailsBtn.setText("VIEW PRODUCT");
        detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(44, 44, 91));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(171, 238, 255));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(44, 44, 91));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(171, 238, 255));
        btnDelete.setText("DELETE PRODUCT");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(44, 44, 91));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(171, 238, 255));
        backBtn.setText("<< BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        tblDirectory.setBackground(new java.awt.Color(44, 44, 91));
        tblDirectory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblDirectory.setForeground(new java.awt.Color(171, 238, 255));
        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT NAME ", "AVAILABILITY", "PRICE", "PRODUCT IMAGE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDirectory.setRowHeight(150);
        tblDirectory.setSelectionBackground(new java.awt.Color(85, 79, 102));
        tblDirectory.setSelectionForeground(new java.awt.Color(171, 238, 255));
        jScrollPane1.setViewportView(tblDirectory);

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        lblSearchAccNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSearchAccNo.setForeground(new java.awt.Color(171, 238, 255));
        lblSearchAccNo.setText("SEARCH BY PRODUCT NAME");

        lblManage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManage.setForeground(new java.awt.Color(171, 238, 255));
        lblManage.setText("MANAGE PRODUCTS");

        jButton2.setBackground(new java.awt.Color(44, 44, 91));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(171, 238, 255));
        jButton2.setText("ADD DRUGS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(44, 44, 91));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(171, 238, 255));
        jButton3.setText("ADD EQUIPMENTS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(44, 44, 91));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(171, 238, 255));
        jButton4.setText("ADD VACCINATION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(44, 44, 91));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(171, 238, 255));
        jButton5.setText("VIEW DEMAND");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchAccNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addGap(164, 164, 164)
                                .addComponent(detailsBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(lblManage, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backBtn, btnDelete, detailsBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblManage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearchAccNo)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton5)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnDelete)
                    .addComponent(detailsBtn))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backBtn, btnDelete, detailsBtn});

    }// </editor-fold>//GEN-END:initComponents

    
     public void populate(){
         DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(85,79,102));

        for (int i = 0; i < tblDirectory.getModel().getColumnCount(); i++) {
       tblDirectory.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
       }
         allproductslist = new ArrayList<Product>();
        for (Product p : Organization.getProductDirectory().getDrugproductlist())
            allproductslist.add(p);
        for (Product p : Organization.getProductDirectory().getEquipproductlist())
            allproductslist.add(p);
        for (Product p : Organization.getProductDirectory().getVaccineproductlist())
            allproductslist.add(p);
        
        Organization.getProductDirectory().setAllProducts(allproductslist);
        // Organization.getProductDirectory().getAllProducts().clear();
                
         System.out.println("gvhjik" + allproductslist);
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        //tblDirectory.setRowHeight(100);
        
        dtm.setRowCount(0);
        
        for(Product a : allproductslist){
//            Object[] row = new Object[dtm.getColumnCount()];
//            row[0]=a;
//            row[1]=a.getQuantity();
//            row[2]=a.getPrice();
//            dtm.addRow(row);
            Product pro=a;
            int q=a.getQuantity();
            double p=a.getPrice();
            
            
             BufferedImage imgFromDb = null;
        InputStream in = new ByteArrayInputStream(a.getImagetry());
        try {
             imgFromDb = ImageIO.read(in);
               
    ImageIcon icon = new ImageIcon(imgFromDb);
         //img.setIcon(icon);
//         Renderer1 re= new Renderer1();
//            re.lbl.setIcon(icon);
//            tblDirectory.getColumnModel().getColumn(3).setCellRenderer(re);
    
    dtm.addRow(new Object[] {pro,q,p,a.getImagetry()});
    tblDirectory.getColumnModel().getColumn(3).setCellRenderer(new Renderer1());
    
        } catch (IOException ex) {
            Logger.getLogger(ViewPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    }
    private void detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBtnActionPerformed
        // TODO add your handling code here:
        int selectRow= tblDirectory.getSelectedRow();
        if(selectRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        else
        {
            Product prod=(Product)tblDirectory.getValueAt(selectRow, 0);
            ViewPanel viewPanel= new ViewPanel(userProcessContainer,prod,Organization.getProductDirectory(),Organization);
            userProcessContainer.add("ViewPanel",viewPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_detailsBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtsearch.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter aproduct name to search!!");
        }
        else
        {
            for(Product a : Organization.getProductDirectory().getAllProducts())
            {
                if(a.getName().equals(txtsearch.getText()))
                {
                ViewPanel viewPanel= new ViewPanel(userProcessContainer,a,Organization.getProductDirectory(),Organization);
            userProcessContainer.add("ViewPanel",viewPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            txtsearch.setText("");
                    

                }

            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Product prod = (Product)tblDirectory.getValueAt(selectedRow, 0);
                if(prod.getProductType().equals("Drug"))
                {
                    Organization.getProductDirectory().deleteDrug(prod);
                }
                else if(prod.getProductType().equals("Vaccine"))
                {
                    Organization.getProductDirectory().deleteVaccine(prod);
                }
                else
                {
                    Organization.getProductDirectory().deleteEquipment(prod);
                }
               
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          AddEquipmentJPanel viewPanel= new AddEquipmentJPanel(userProcessContainer,Organization,enterprise);
            userProcessContainer.add("ViewPanel",viewPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         AddDrugJPanel viewPanel= new AddDrugJPanel(userProcessContainer,Organization,enterprise);
            userProcessContainer.add("ViewPanel",viewPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         AddVaccineJPanel viewPanel= new AddVaccineJPanel(userProcessContainer,Organization,enterprise);
            userProcessContainer.add("ViewPanel",viewPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       BarChartViewJPanel viewPanel= new BarChartViewJPanel(userProcessContainer,userAccount,Organization,enterprise,business);
            userProcessContainer.add("ViewPanel",viewPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton detailsBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblSearchAccNo;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
