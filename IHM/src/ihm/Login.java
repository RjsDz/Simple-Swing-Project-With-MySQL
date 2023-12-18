
package ihm;

import static ihm.MainFaceFrame.comb;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Login extends javax.swing.JFrame {
     public JButton cancelB;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    public JButton logB;
    public JPasswordField passF;
    public JTextField userF;
    
                      

    public Login() {
        initComponents();
    }

    public void build(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userF = new javax.swing.JTextField();
        passF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("Log In");

        userF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userF.setToolTipText("Username");
        userF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        

        passF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passF.setToolTipText("Password");
        

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Password:");

        logB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logB.setForeground(java.awt.Color.green);
        logB.setText("Log In");
        logB.setToolTipText("Log in to main Face");
        logB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logBMouseClicked(evt);
            }
        });
       

        cancelB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cancelB.setForeground(java.awt.Color.red);
        cancelB.setText("Cancel");
        cancelB.setToolTipText("Exit");
        cancelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBMouseClicked(evt);
            }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(passF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(logB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelB)
                    .addComponent(logB))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>                        

                                         

    private void logBMouseClicked(java.awt.event.MouseEvent evt) {                                  
         boolean isTrue = DataBase.isExist(userF.getText().trim(), String.valueOf(passF.getPassword()).trim());
        if(!isTrue){
            JOptionPane.showMessageDialog(null, "Your username or password is uncorect !!!!");
            passF.setText("");
            return;
        }else {
            MainFaceFrame m = new MainFaceFrame();
            m.setVisible(true);
           // m.setResizable(false);
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
        }
    }                                 

    private void cancelBMouseClicked(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }                                    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

                     
  
}

