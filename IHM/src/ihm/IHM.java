/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ihm;

import static ihm.MainFaceFrame.comb;
import java.util.ArrayList;

/**
 *
 * @author ANIS INFO
 */
public class IHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* MainFaceFrame f = new MainFaceFrame();
        f.setVisible(true);
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
                }*/
        Login l = new Login();
        l.setVisible(true);
        l.setResizable(false);
        System.out.println("d");
    }
    
}
