/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabRole;

import Buisness.Products.Product;
import Business.CustomerAccount.CustomerAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Review.Review;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.SuppliesManagerRole.ViewPanel;

/**
 *
 * @author vaniv
 */
public class ProductDescJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductDescJPanel
     */
    private JPanel userProcessContainer;
    private Product p;
    private CustomerAccount customerAccount;
    private Enterprise enterprise;
    private Organization organization;
    private Object img;
    public ProductDescJPanel(JPanel userProcessContainer, Product p,Organization organization,Enterprise enterprise, CustomerAccount customerAccount) {
         initComponents();
         this.userProcessContainer =userProcessContainer;
         this.p =p;
         this.enterprise = enterprise;
         this.organization = organization;
         this.customerAccount= customerAccount;
         DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
         headerRenderer.setBackground(new Color(85,79,102));

         for (int i = 0; i < reviewTable.getModel().getColumnCount(); i++) {
        reviewTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
//         productImg.setText(p.getName());
         description.setText(p.getDesc());
         Productname.setText(p.getName());
          BufferedImage imgFromDb = null;
        InputStream in = new ByteArrayInputStream(p.getImagetry());
        try {
             imgFromDb = ImageIO.read(in);
               
    ImageIcon icon = new ImageIcon(imgFromDb);
         productImg.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(ViewPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         price.setText(Double.toString(p.getPrice()));
         quantityJComboBox.removeAllItems();
         for(int i = 1; i<= p.getQuantity();i++){
             quantityJComboBox.addItem(i);
         }
//         supplier.setText(p.getSupplierName());
         //quantity.setText(String.valueOf(p.getQuantity()));
         if (p.getReviewDirectory() != null){
             int rowCount = reviewTable.getRowCount();
        DefaultTableModel Table = (DefaultTableModel)reviewTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            Table.removeRow(i);
        }
        for(Review r : p.getReviewDirectory().getReviewList()){
            Object row[] = new Object[2];
            row[0]=r;
            row[1]=r.getRating();
            Table.addRow(row);
        }
         }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        productImg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        quantityJComboBox = new javax.swing.JComboBox();
        Productname = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(44, 44, 91));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(171, 238, 255));
        jLabel1.setText("QUANTITY");

        jButton1.setBackground(new java.awt.Color(44, 44, 91));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(171, 238, 255));
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(44, 44, 91));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(171, 238, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(171, 238, 255));
        jLabel2.setText("PRICE");

        price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        price.setForeground(new java.awt.Color(171, 238, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(171, 238, 255));
        jLabel3.setText("DESCRIPTION");

        description.setBackground(new java.awt.Color(44, 44, 91));
        description.setColumns(20);
        description.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        description.setForeground(new java.awt.Color(171, 238, 255));
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(171, 238, 255));
        jLabel5.setText("REVIEWS");

        reviewTable.setBackground(new java.awt.Color(44, 44, 91));
        reviewTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(44, 44, 91), new java.awt.Color(44, 44, 91)));
        reviewTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reviewTable.setForeground(new java.awt.Color(171, 238, 255));
        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPTION", "RATING"
            }
        ));
        reviewTable.setGridColor(new java.awt.Color(44, 44, 91));
        reviewTable.setRowHeight(100);
        reviewTable.setSelectionBackground(new java.awt.Color(85, 79, 102));
        reviewTable.setSelectionForeground(new java.awt.Color(171, 238, 255));
        jScrollPane3.setViewportView(reviewTable);

        quantityJComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quantityJComboBox.setForeground(new java.awt.Color(171, 238, 255));
        quantityJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        quantityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityJComboBoxActionPerformed(evt);
            }
        });

        Productname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Productname.setForeground(new java.awt.Color(171, 238, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Productname, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productImg, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(quantityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(743, 743, 743))
                            .addComponent(jScrollPane3))
                        .addGap(143, 143, 143))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, price, quantityJComboBox});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Productname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(productImg, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, price, quantityJComboBox});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String name = p.getName();
       String desc = p.getDesc();
       Double price = p.getPrice();
       String supplier = p.getSupplierName();
       int quantity1 = Integer.valueOf(quantityJComboBox.getSelectedItem().toString());
       String productType =p.getProductType();
       String Type = p.getType();
       int ProductID= p.getID();
       byte[] image =p.getImagetry();
       customerAccount.getCartDirectory().CreateCart(ProductID,name, desc, price, quantity1, Type, supplier, productType,image);
       JOptionPane.showMessageDialog(null,"Item added to cart");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       userProcessContainer.remove(this);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quantityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Productname;
    private javax.swing.JTextArea description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productImg;
    private javax.swing.JComboBox quantityJComboBox;
    private javax.swing.JTable reviewTable;
    // End of variables declaration//GEN-END:variables
}