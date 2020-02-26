import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdateMetro extends javax.swing.JFrame 
{
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public UpdateMetro() 
    {
        initComponents();
        conn = MyDatabase.DataConnect();
        getContentPane().setBackground(new Color(240,240,240));
        setTitle("Update Metro");
        setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        findTxt = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        metroNoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        carriageTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        capacityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        linenoTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        originTxt = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find", 0, 0, new java.awt.Font("Arial", 0, 18), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Metro Number : ");

        findTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        findTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                findTxtFocusLost(evt);
            }
        });

        FindButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(findTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindButton))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Record", 0, 0, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Metro Number : ");

        metroNoTxt.setEditable(false);
        metroNoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Number Of Carriage : ");

        carriageTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carriageTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                carriageTxtFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Carrying Capacity : ");

        capacityTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capacityTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                capacityTxtFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Origin ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Destination");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("LineNo : ");

        linenoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        linenoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linenoTxtFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Start On Date : ");

        dateTxt.setEditable(false);
        dateTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        updateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        originTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        originTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                originTxtFocusLost(evt);
            }
        });

        destinationTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        destinationTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                destinationTxtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(updateButton)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(metroNoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(capacityTxt)
                            .addComponent(carriageTxt)
                            .addComponent(linenoTxt)
                            .addComponent(dateTxt)
                            .addComponent(jButton3)
                            .addComponent(originTxt)
                            .addComponent(destinationTxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(metroNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(carriageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(capacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(originTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(linenoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metro1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
        // TODO add your handling code here:
        String temp =(String) findTxt.getText();  
        String sql =  "select * from NEWMETRO where MetroNo=?";
        if(temp.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               findTxt.requestFocus();
               return;
        }
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String add1 = rs.getString("METRONO");
                metroNoTxt.setText(add1);
                
                String add2 = rs.getString("CARRIAGE");
                carriageTxt.setText(add2);
                
                String add3 = rs.getString("CAPACITY");
                capacityTxt.setText(add3);
                
                String add4 = rs.getString("ORIGIN");
                originTxt.setText(add4);
                
                String add5 = rs.getString("Destination");
                destinationTxt.setText(add5);
                
                String add6 = rs.getString("LINENO");
                linenoTxt.setText(add6);
                
                String add7 = rs.getString("DATE");
                dateTxt.setText(add7);
         }
        
       }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e); 
        }
    }//GEN-LAST:event_FindButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String temp =(String) findTxt.getText(); 
        String carriage = carriageTxt.getText();
        String capacity = capacityTxt.getText();
        String origin = originTxt.getText();
        String destination = destinationTxt.getText();
        String lineno = linenoTxt.getText();
        
        if(temp.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Please find the card ");
               FindButton.requestFocus();
               return;
        }
        else if(carriage.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               carriageTxt.requestFocus();
               return;
        }
        else if(capacity.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               capacityTxt.requestFocus();
               return;
        }
        else if(origin.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               originTxt.requestFocus();
               return;
        }
        else if(destination.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               destinationTxt.requestFocus();
               return;
        }
        else if(lineno.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               linenoTxt.requestFocus();
               return;
        }
        
        try
        {
           String sq = "update NEWMETRO set CARRIAGE ='"+carriage+"',CAPACITY='"+capacity+"',ORIGIN='"+origin+"',DESTINATION='"+destination+"',LINENO='"+lineno+"' ";
           pst = conn.prepareStatement(sq);
           pst.execute();
           dispose();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e); 
       }    
    }//GEN-LAST:event_updateButtonActionPerformed

    private void findTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_findTxtFocusLost
        // TODO add your handling code here:
        
        String temp = findTxt.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   findTxt.requestFocus();
                   break;
               }
        } 
    }//GEN-LAST:event_findTxtFocusLost

    private void carriageTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carriageTxtFocusLost
        // TODO add your handling code here:
       String temp = carriageTxt.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   carriageTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_carriageTxtFocusLost

    private void capacityTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_capacityTxtFocusLost
        // TODO add your handling code here:
        String temp = capacityTxt.getText();
        char ch;
       
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   capacityTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_capacityTxtFocusLost

    private void originTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_originTxtFocusLost
        // TODO add your handling code here:
        String temp = originTxt.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!((ch<='Z'&&ch>='A')||(ch<='z'&&ch>='a')))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   originTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_originTxtFocusLost

    private void destinationTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_destinationTxtFocusLost
        // TODO add your handling code here:
        String temp = destinationTxt.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!((ch<='Z'&&ch>='A')||(ch<='z'&&ch>='a')))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   destinationTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_destinationTxtFocusLost

    private void linenoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linenoTxtFocusLost
        // TODO add your handling code here:
        String temp = linenoTxt.getText();
        char ch;
        if(temp.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               linenoTxt.requestFocus();
               return;
        }
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   linenoTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_linenoTxtFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindButton;
    private javax.swing.JTextField capacityTxt;
    private javax.swing.JTextField carriageTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JTextField findTxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField linenoTxt;
    private javax.swing.JTextField metroNoTxt;
    private javax.swing.JTextField originTxt;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
