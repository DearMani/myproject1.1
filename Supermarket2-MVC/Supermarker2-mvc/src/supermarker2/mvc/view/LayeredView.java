/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarker2.mvc.view;

/**
 *
 * @author Manidu
 */
public class LayeredView extends javax.swing.JFrame {
         private static boolean newState =false;
         private static boolean oldState =false;
         
    /**
     * Creates new form LayeredView
     */
    public LayeredView() {
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

        borderPanel = new javax.swing.JPanel();
        borderLabel = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        customerButton = new javax.swing.JButton();
        itemButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        bottumPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        borderPanel.setBackground(new java.awt.Color(153, 0, 255));

        borderLabel.setBackground(new java.awt.Color(51, 51, 51));
        borderLabel.setForeground(new java.awt.Color(0, 0, 0));
        borderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borderLabel.setText("SuperMarket");
        borderLabel.setName(""); // NOI18N

        javax.swing.GroupLayout borderPanelLayout = new javax.swing.GroupLayout(borderPanel);
        borderPanel.setLayout(borderPanelLayout);
        borderPanelLayout.setHorizontalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanelLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(borderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(496, Short.MAX_VALUE))
        );
        borderPanelLayout.setVerticalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(borderLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(204, 0, 102));

        customerButton.setText("Customer");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        itemButton.setText("Item");
        itemButton.setToolTipText("");
        itemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButtonActionPerformed(evt);
            }
        });

        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemButton)
                            .addComponent(orderButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(customerButton)
                .addGap(37, 37, 37)
                .addComponent(itemButton)
                .addGap(64, 64, 64)
                .addComponent(orderButton)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bottumPanel.setBackground(new java.awt.Color(153, 51, 255));

        javax.swing.GroupLayout bottumPanelLayout = new javax.swing.GroupLayout(bottumPanel);
        bottumPanel.setLayout(bottumPanelLayout);
        bottumPanelLayout.setHorizontalGroup(
            bottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottumPanelLayout.setVerticalGroup(
            bottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bottumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(borderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
    
        //use button as TOGGLE SWITCH
        newState =true;
        if(oldState ^ newState ==true ){
             loadCustomerPanel();
             System.out.println(oldState ^ newState );
             oldState =newState;      
        }
        
        else if(oldState ^ newState ==false){
                          bodyPanel.removeAll();
                               bodyPanel.repaint();
                               bodyPanel.revalidate();  
                          System.out.println(oldState ^ newState );
                          oldState =false;
        }        
        
        
         
    }//GEN-LAST:event_customerButtonActionPerformed

    private void itemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemButtonActionPerformed
            newState =true;
        if(oldState ^ newState ==true ){
             loadItemPanel();
             System.out.println(oldState ^ newState );
             oldState =newState;      
        }
        
        else if(oldState ^ newState ==false){
                          bodyPanel.removeAll();
                               bodyPanel.repaint();
                               bodyPanel.revalidate();  
                          System.out.println(oldState ^ newState );
                          oldState =false;
        }          
        
        
        
    }//GEN-LAST:event_itemButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
           newState =true;
        if(oldState ^ newState ==true ){
             loadOrderPanel();
             System.out.println(oldState ^ newState );
             oldState =newState;      
        }
        
        else if(oldState ^ newState ==false){
                          bodyPanel.removeAll();
                               bodyPanel.repaint();
                               bodyPanel.revalidate();  
                          System.out.println(oldState ^ newState );
                          oldState =false;
        }          
        
        
    }//GEN-LAST:event_orderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LayeredView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayeredView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayeredView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayeredView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LayeredView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel borderLabel;
    private javax.swing.JPanel borderPanel;
    private javax.swing.JPanel bottumPanel;
    private javax.swing.JButton customerButton;
    private javax.swing.JButton itemButton;
    private javax.swing.JButton orderButton;
    // End of variables declaration//GEN-END:variables

 

    
    
    private void loadCustomerPanel(){
         bodyPanel.removeAll();
         CustomerPanel customerPanel =new CustomerPanel();
         customerPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
         bodyPanel.add(customerPanel);
         bodyPanel.repaint();
         bodyPanel.revalidate();       
    }
    
    
        private void loadItemPanel(){
         bodyPanel.removeAll();
         ItemPanel itemPanel =new ItemPanel();
         itemPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
         bodyPanel.add(itemPanel);
         bodyPanel.repaint();
         bodyPanel.revalidate();       
    }
        
        
         private void loadOrderPanel(){
         bodyPanel.removeAll();
         OrderPanel orderPanel =new OrderPanel();
         orderPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
         bodyPanel.add(orderPanel);
         bodyPanel.repaint();
         bodyPanel.revalidate();       
    }
        



}
