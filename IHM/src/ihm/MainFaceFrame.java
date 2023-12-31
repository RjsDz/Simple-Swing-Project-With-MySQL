/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ihm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.graalvm.nativeimage.Platform;

/**
 *
 * @author ANIS INFO
 */
public class MainFaceFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFaceFrame
     */
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private void updateDateTime() {
    try {
        Date dateTime = new Date();
        SimpleDateFormat formatterDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterTime = new SimpleDateFormat("HH:mm:ss");
        String date_ = formatterDate.format(dateTime);
        String time_ = formatterTime.format(dateTime);

        
            dateL.setText(date_);
            //time.setText(time_);
            timeL.setText(time_);
           // bonNum.setText(DateTimeTotalType.bon+"");
           // totalF();
         /*
        userLab.setText(Employee.name);
            total();*/
        
    } catch (Exception ex) {
        System.out.println(ex);
    }
    
}
    public MainFaceFrame() {
        initComponents();
         scheduler.scheduleAtFixedRate(MainFaceFrame.this::updateDateTime, 0, 1, TimeUnit.SECONDS);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        time = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        timeL = new javax.swing.JLabel();
        totalL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        comb = new javax.swing.JComboBox<>();
        qte = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prUnit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addB = new javax.swing.JButton();
        resB = new javax.swing.JButton();
        calcB = new javax.swing.JButton();
        passB = new javax.swing.JButton();
        newPB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        closeB = new javax.swing.JCheckBox();
        realoadB = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu8.setText("File");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar2.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.green);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N

        time.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Rjsofts_FX");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Date & Time");

        dateL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dateL.setForeground(java.awt.Color.white);
        dateL.setText("2023-10-20");

        timeL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timeL.setForeground(java.awt.Color.white);
        timeL.setText("22:22:22");

        totalL.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        totalL.setForeground(java.awt.Color.white);
        totalL.setText("0000.00");

        javax.swing.GroupLayout timeLayout = new javax.swing.GroupLayout(time);
        time.setLayout(timeLayout);
        timeLayout.setHorizontalGroup(
            timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(totalL, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeLayout.createSequentialGroup()
                        .addGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateL)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeLayout.createSequentialGroup()
                        .addComponent(timeL)
                        .addGap(41, 41, 41))))
        );
        timeLayout.setVerticalGroup(
            timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeLayout.createSequentialGroup()
                .addGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(dateL)
                        .addGap(18, 18, 18)
                        .addComponent(timeL))
                    .addGroup(timeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        area.setEditable(false);
        area.setBackground(new java.awt.Color(204, 255, 204));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        area.setRows(20);
        area.setTabSize(5);
        area.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(area);

        comb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comb.setForeground(java.awt.Color.green);
        comb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comb.setToolTipText("Products");
        comb.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                combPropertyChange(evt);
            }
        });

        qte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Product :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Qte :");

        prUnit.setEditable(false);
        prUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prUnitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Prix De Uint :");

        addB.setBackground(java.awt.Color.green);
        addB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addB.setForeground(java.awt.Color.white);
        addB.setText("Add Product");
        addB.setToolTipText("Add product");
        addB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        addB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBMouseClicked(evt);
            }
        });
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        resB.setBackground(java.awt.Color.red);
        resB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resB.setForeground(java.awt.Color.white);
        resB.setText("Reset Operation");
        resB.setToolTipText("Reset Purchase Operation");
        resB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        resB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resBMouseClicked(evt);
            }
        });
        resB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resBActionPerformed(evt);
            }
        });

        calcB.setBackground(java.awt.Color.green);
        calcB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calcB.setForeground(java.awt.Color.white);
        calcB.setText("Calculator");
        calcB.setToolTipText("Open Calculator");
        calcB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        calcB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBMouseClicked(evt);
            }
        });
        calcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBActionPerformed(evt);
            }
        });

        passB.setBackground(java.awt.Color.green);
        passB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passB.setForeground(java.awt.Color.white);
        passB.setText("Change Password");
        passB.setToolTipText("Change Password");
        passB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        passB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passBMouseClicked(evt);
            }
        });
        passB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBActionPerformed(evt);
            }
        });

        newPB.setBackground(java.awt.Color.green);
        newPB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newPB.setForeground(java.awt.Color.white);
        newPB.setText("New Product");
        newPB.setToolTipText("Add New Product To Data Base");
        newPB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        newPB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPBMouseClicked(evt);
            }
        });
        newPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPBActionPerformed(evt);
            }
        });

        closeB.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        closeB.setText("Close Connection Data ");
        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBMouseClicked(evt);
            }
        });

        realoadB.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        realoadB.setText("Reloaded Data Base");
        realoadB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                realoadBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeB, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realoadB, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(realoadB)
                .addGap(27, 27, 27)
                .addComponent(closeB)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("==========");

        jMenu5.setText("File");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exit.setText("exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu5.add(exit);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcB, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passB, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPB, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(qte, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)))
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(calcB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(newPB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(passB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qteActionPerformed

    private void prUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prUnitActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBActionPerformed

    private void resBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resBActionPerformed

    private void calcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcBActionPerformed

    private void passBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passBActionPerformed

    private void newPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPBActionPerformed

    private void calcBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBMouseClicked
        // TODO add your handling code here:
        Calculator c = new Calculator();
        c.setVisible(true);
        c.setResizable(false);
    }//GEN-LAST:event_calcBMouseClicked

    private void newPBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPBMouseClicked
        // TODO add your handling code here:
        AddProduct c = new AddProduct();
        c.setVisible(true);
        c.setResizable(false);
    }//GEN-LAST:event_newPBMouseClicked

    private void passBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passBMouseClicked
        // TODO add your handling code here:
        ChangePassword c = new ChangePassword();
        c.setVisible(true);
        c.setResizable(false);
    }//GEN-LAST:event_passBMouseClicked

    private void realoadBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realoadBMouseClicked
        // TODO add your handling code here:
        MainFaceFrame.comb.removeAllItems();
        ArrayList<Product> items = DataBase.fetchAllProducts("Export");
                ArrayList<String> newL = new ArrayList();
                int size = items.size();
                for(Product p : items){
                    newL.add(p.getDisignation());
                    }
                comb.removeAllItems();
                for(String s : newL){
                    comb.addItem(s);
                }
    }//GEN-LAST:event_realoadBMouseClicked

    private void closeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBMouseClicked
        // TODO add your handling code here:
        DataBase.closeConnectionDB();
    }//GEN-LAST:event_closeBMouseClicked

    private void addBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBMouseClicked
        // TODO add your handling code here:
        if(qte.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill the Qte field !!!!");
            return;
        }
        ArrayList<Product> items = DataBase.fetchAllProducts("Export");
        String s = (String)comb.getSelectedItem();
        String areaContent = area.getText()+"\n";
        for(Product p : items){
            if(p.getDisignation().equals(s)){
                prUnit.setText(p.getPrix_unitaire()+"");
                try{
                    
                    price+= p.getPrix_unitaire() * Float.parseFloat(qte.getText());
                    area.setText(areaContent+p.getDisignation()+"("+p.getUnite_de_mesure()+")"+"x"+qte.getText()+"="+p.getPrix_unitaire()*Float.parseFloat(qte.getText()));
                    
                    totalL.setText(price+"");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Please Enter a valide Qte");
                    qte.setText("");
                    return;
                }
            }
        }
    }//GEN-LAST:event_addBMouseClicked

    private void resBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resBMouseClicked
        // TODO add your handling code here:
        area.setText("");
        totalL.setText("0000.00");
        price = 0;
        qte.setText("");
    }//GEN-LAST:event_resBMouseClicked

    private void combPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_combPropertyChange
        // TODO add your handling code here:
        ArrayList<Product> items = DataBase.fetchAllProducts("Export");
        String s = (String)comb.getSelectedItem();
        for(Product p : items){
            if(p.getDisignation().equals(s)){
                prUnit.setText(p.getPrix_unitaire()+"");
            }
        }
    }//GEN-LAST:event_combPropertyChange

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(MainFaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFaceFrame().setVisible(true);
                //================================
                ArrayList<Product> items = DataBase.fetchAllProducts("Export");
                ArrayList<String> newL = new ArrayList();
                int size = items.size();
                for(Product p : items){
                    newL.add(p.getDisignation());
                    }
                comb.removeAllItems();
                for(String s : newL){
                    comb.addItem(s);
                }
                comb.addItem("dhhhhhhhhhhhhhh");
                 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.JTextArea area;
    private javax.swing.JButton calcB;
    private javax.swing.JCheckBox closeB;
    public static javax.swing.JComboBox<String> comb;
    public javax.swing.JLabel dateL;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newPB;
    private javax.swing.JButton passB;
    private javax.swing.JTextField prUnit;
    private javax.swing.JTextField qte;
    private javax.swing.JCheckBox realoadB;
    private javax.swing.JButton resB;
    public javax.swing.JPanel time;
    private javax.swing.JLabel timeL;
    private javax.swing.JLabel totalL;
    // End of variables declaration//GEN-END:variables
    public static float price = 0;

}
