import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NewSmartCard extends javax.swing.JFrame 
{

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public NewSmartCard()
    {
        conn = MyDatabase.DataConnect();
        initComponents();
        getContentPane().setBackground(new Color(240,240,240));
        setTitle("New Smart Card");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cardnoTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        maleRbutton = new javax.swing.JRadioButton();
        femaleRbutton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        premiumRbutton = new javax.swing.JRadioButton();
        standardRbutton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        balanceTxt = new javax.swing.JTextField();
        MakeSmartCardButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Smart Card", 0, 0, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Smart Card No : ");

        cardnoTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cardnoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cardnoTxtFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gender");

        buttonGroup1.add(maleRbutton);
        maleRbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        maleRbutton.setText("Male");
        maleRbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(femaleRbutton);
        femaleRbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        femaleRbutton.setText("Female");
        femaleRbutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                femaleRbuttonFocusLost(evt);
            }
        });
        femaleRbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRbuttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone no: ");

        nameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });

        ageTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ageTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageTxtFocusLost(evt);
            }
        });

        phoneTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phoneTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTxtFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address");

        addressTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addressTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressTxtFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Card Type");

        buttonGroup2.add(premiumRbutton);
        premiumRbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        premiumRbutton.setText("Premium");
        premiumRbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumRbuttonActionPerformed(evt);
            }
        });

        buttonGroup2.add(standardRbutton);
        standardRbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        standardRbutton.setText("Standard");
        standardRbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardRbuttonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Initial balance : ");

        balanceTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        balanceTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                balanceTxtFocusLost(evt);
            }
        });
        balanceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTxtActionPerformed(evt);
            }
        });

        MakeSmartCardButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MakeSmartCardButton.setText("Make Smart Card");
        MakeSmartCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeSmartCardButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleRbutton)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRbutton))
                                    .addComponent(cardnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(standardRbutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(premiumRbutton))
                                    .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(MakeSmartCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cardnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maleRbutton)
                    .addComponent(femaleRbutton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(standardRbutton)
                    .addComponent(premiumRbutton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(MakeSmartCardButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metro1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balanceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceTxtActionPerformed

    private void MakeSmartCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeSmartCardButtonActionPerformed
        // TODO add your handling code here:
        String sql = "insert into SMARTCARD (SMARTCARDNO,NAME,AGE,GENDER,PHONENO,ADDRESS,CARDTYPE,CURRENTBALANCE) \n" 
                + " values(?,?,?,?,?,?,?,?)";
        
       String temp  = cardnoTxt.getText();
       String temp1 = nameTxt.getText();
       String temp2 = ageTxt.getText();
       String temp3 = phoneTxt.getText();
       String temp4 = addressTxt.getText();
       String temp5 = balanceTxt.getText();
        
        if(temp.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               cardnoTxt.requestFocus();
               return;
        }
        else if(temp1.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               nameTxt.requestFocus();
               return;
        }
        else if(temp2.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               ageTxt.requestFocus();
               return;
        }
        else if(temp3.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               phoneTxt.requestFocus();
               return;
        }
        else if(temp4.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               addressTxt.requestFocus();
        }
        else if(temp5.equals(""))
        {
               JOptionPane.showMessageDialog(null,"Field is Empty!!");
               balanceTxt.requestFocus();
               return;
        }
        
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1,cardnoTxt.getText());
            pst.setString(2,nameTxt.getText());
            pst.setString(3,ageTxt.getText());
            pst.setString(4,gender);
            pst.setString(5,phoneTxt.getText());
            pst.setString(6,addressTxt.getText());
            pst.setString(7,cardType);
            pst.setString(8,balanceTxt.getText());
            pst.execute();
        }
        catch(SQLException e)
        {
            System.out.print("\n\tprint : "+e);
        }
    }//GEN-LAST:event_MakeSmartCardButtonActionPerformed

    private void maleRbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRbuttonActionPerformed
        // TODO add your handling code here:
        gender = "M";
    }//GEN-LAST:event_maleRbuttonActionPerformed

    private void femaleRbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRbuttonActionPerformed
        // TODO add your handling code here:
        gender = "F";
    }//GEN-LAST:event_femaleRbuttonActionPerformed

    private void standardRbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardRbuttonActionPerformed
        // TODO add your handling code here:
        cardType = "S";
    }//GEN-LAST:event_standardRbuttonActionPerformed

    private void premiumRbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumRbuttonActionPerformed
        // TODO add your handling code here:
        cardType = "P";
    }//GEN-LAST:event_premiumRbuttonActionPerformed

    private void cardnoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardnoTxtFocusLost
        // TODO add your handling code here:
        JTextField temp1 = (JTextField)evt.getSource();
        String temp = temp1.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   cardnoTxt.requestFocus();
                   break;
               }
        } 
    }//GEN-LAST:event_cardnoTxtFocusLost

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        // TODO add your handling code here:
        String temp = nameTxt.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!((ch<='Z'&&ch>='A')||(ch<='z'&&ch>='a')))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   nameTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void ageTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageTxtFocusLost
        // TODO add your handling code here:
        String temp = ageTxt.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   ageTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_ageTxtFocusLost

    private void femaleRbuttonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_femaleRbuttonFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRbuttonFocusLost

    private void phoneTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFocusLost
        // TODO add your handling code here:
        String temp = phoneTxt.getText();
        char ch;
        int length = temp.length();
        
        
        if(length>10)
        {
            JOptionPane.showMessageDialog(null,"Phone No length Exceeded");
            phoneTxt.requestFocus();
            return;
        }
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   phoneTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_phoneTxtFocusLost

    private void addressTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTxtFocusLost
        // TODO add your handling code here:
        String temp = addressTxt.getText();
        char ch;
        
       
    }//GEN-LAST:event_addressTxtFocusLost

    private void balanceTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_balanceTxtFocusLost
        // TODO add your handling code here:
        String temp = balanceTxt.getText();
        char ch;
        
        for(int offset=0;offset<temp.length();offset++)
        {
               ch=temp.charAt(offset);
               if(!(ch<='9'&&ch>='0'))
               {
                   JOptionPane.showMessageDialog(null,"incorrect values");
                   balanceTxt.requestFocus();
                   break;
               }
        }
    }//GEN-LAST:event_balanceTxtFocusLost

    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        // TODO add your handling code here:
        /*String temp = cardnoTxt.getText();
        if(temp.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Field Is Empty!!");
            cardnoTxt.requestFocus(); 
        }*/
    }//GEN-LAST:event_nameTxtFocusGained

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
            java.util.logging.Logger.getLogger(NewSmartCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSmartCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSmartCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSmartCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSmartCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MakeSmartCardButton;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField balanceTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField cardnoTxt;
    private javax.swing.JRadioButton femaleRbutton;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JRadioButton maleRbutton;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JRadioButton premiumRbutton;
    private javax.swing.JRadioButton standardRbutton;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String cardType;
}
