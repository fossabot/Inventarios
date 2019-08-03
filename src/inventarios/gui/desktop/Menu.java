/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Marroquin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.orange);
        cerrar();
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(Menu.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Confirmar salida//
    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea cerrar todas las ventanas abiertas?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
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

        jLabel2 = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        optionsPanel = new javax.swing.JPanel();
        btnInventory = new javax.swing.JButton();
        btnTransaction = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnBilling = new javax.swing.JButton();
        btnProvider = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnEmployeeRecords = new javax.swing.JButton();
        btnCredits = new javax.swing.JButton();
        imageAndNavigationPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        navivgationPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnGetBack = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mnuInventory = new javax.swing.JMenu();
        mnuInventories = new javax.swing.JMenuItem();
        mnuBills = new javax.swing.JMenuItem();
        mnuProvider = new javax.swing.JMenuItem();
        mnuServices = new javax.swing.JMenu();
        mnuOrders = new javax.swing.JMenuItem();
        mnuTransactions = new javax.swing.JMenuItem();
        mnuAbout = new javax.swing.JMenu();
        mnuAboutItem = new javax.swing.JMenuItem();
        mnuGetBack = new javax.swing.JMenuItem();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgFondos/fondo 1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        setMinimumSize(new java.awt.Dimension(500, 250));

        lblTitle.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 0, 255));
        lblTitle.setText("MENU INVENTARIO");
        titlePanel.add(lblTitle);

        getContentPane().add(titlePanel, java.awt.BorderLayout.PAGE_START);

        contentPanel.setLayout(new javax.swing.BoxLayout(contentPanel, javax.swing.BoxLayout.X_AXIS));

        optionsPanel.setLayout(new java.awt.GridLayout(4, 2));

        btnInventory.setText("Inventarios");
        btnInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });
        optionsPanel.add(btnInventory);

        btnTransaction.setText("Compra/Venta");
        btnTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionActionPerformed(evt);
            }
        });
        optionsPanel.add(btnTransaction);

        btnOrders.setText("Pedidos");
        btnOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });
        optionsPanel.add(btnOrders);

        btnBilling.setText("Facturación");
        btnBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillingActionPerformed(evt);
            }
        });
        optionsPanel.add(btnBilling);

        btnProvider.setText("Proveedor");
        btnProvider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProviderActionPerformed(evt);
            }
        });
        optionsPanel.add(btnProvider);

        btnAbout.setText("A cerca de...");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        optionsPanel.add(btnAbout);

        btnEmployeeRecords.setText("Registro Empleados");
        btnEmployeeRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeRecordsActionPerformed(evt);
            }
        });
        optionsPanel.add(btnEmployeeRecords);

        btnCredits.setText("Creditos");
        btnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditsActionPerformed(evt);
            }
        });
        optionsPanel.add(btnCredits);

        contentPanel.add(optionsPanel);

        imageAndNavigationPanel.setLayout(new javax.swing.BoxLayout(imageAndNavigationPanel, javax.swing.BoxLayout.Y_AXIS));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgFondos/Imagen7.png"))); // NOI18N
        imagePanel.add(lblImage);

        imageAndNavigationPanel.add(imagePanel);

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        navivgationPanel.add(btnClose);

        btnGetBack.setText("Regresar");
        btnGetBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGetBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBackActionPerformed(evt);
            }
        });
        navivgationPanel.add(btnGetBack);

        imageAndNavigationPanel.add(navivgationPanel);

        contentPanel.add(imageAndNavigationPanel);

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        mnuInventory.setText("SISTEMA DE INVENTARIO");

        mnuInventories.setText("Inventarios");
        mnuInventories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInventoriesActionPerformed(evt);
            }
        });
        mnuInventory.add(mnuInventories);

        mnuBills.setText("Facturas");
        mnuBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBillsActionPerformed(evt);
            }
        });
        mnuInventory.add(mnuBills);

        mnuProvider.setText("Provedor");
        mnuProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProviderActionPerformed(evt);
            }
        });
        mnuInventory.add(mnuProvider);

        mnuServices.setText("Servicios");

        mnuOrders.setText("Pedidos");
        mnuOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrdersActionPerformed(evt);
            }
        });
        mnuServices.add(mnuOrders);

        mnuTransactions.setText("Compra  venta");
        mnuTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransactionsActionPerformed(evt);
            }
        });
        mnuServices.add(mnuTransactions);

        mnuInventory.add(mnuServices);

        menuBar.add(mnuInventory);

        mnuAbout.setText("ACERCA DE");

        mnuAboutItem.setText("Acerca de");
        mnuAboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutItemActionPerformed(evt);
            }
        });
        mnuAbout.add(mnuAboutItem);

        mnuGetBack.setText("Regresar");
        mnuGetBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGetBackActionPerformed(evt);
            }
        });
        mnuAbout.add(mnuGetBack);

        menuBar.add(mnuAbout);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        InterfazConstructor r = new InterfazConstructor();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void btnTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionActionPerformed
        ShoppingWindow r = new ShoppingWindow();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTransactionActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        PedidosVetana r = new PedidosVetana();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProviderActionPerformed
        ProveedorVentana r = new ProveedorVentana();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProviderActionPerformed

    private void btnGetBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnGetBackActionPerformed

    private void btnBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillingActionPerformed
        Billing Fv = new Billing();
        Fv.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBillingActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        Information F = new Information();
        F.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void mnuInventoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInventoriesActionPerformed
        InterfazConstructor r = new InterfazConstructor();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuInventoriesActionPerformed

    private void mnuAboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutItemActionPerformed
        Information F = new Information();
        F.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuAboutItemActionPerformed

    private void mnuBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBillsActionPerformed
        Billing Fv = new Billing();
        Fv.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuBillsActionPerformed

    private void mnuProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProviderActionPerformed
        ProveedorVentana r = new ProveedorVentana();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuProviderActionPerformed

    private void mnuOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrdersActionPerformed
        PedidosVetana r = new PedidosVetana();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuOrdersActionPerformed

    private void mnuTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransactionsActionPerformed
        ShoppingWindow r = new ShoppingWindow();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuTransactionsActionPerformed

    private void mnuGetBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGetBackActionPerformed
        dispose();
    }//GEN-LAST:event_mnuGetBackActionPerformed

    private void btnEmployeeRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeRecordsActionPerformed
        Employees n = new Employees();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEmployeeRecordsActionPerformed

    private void btnCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditsActionPerformed
        Creditos y = new Creditos();
        y.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreditsActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBilling;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnEmployeeRecords;
    private javax.swing.JButton btnGetBack;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnProvider;
    private javax.swing.JButton btnTransaction;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel imageAndNavigationPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAbout;
    private javax.swing.JMenuItem mnuAboutItem;
    private javax.swing.JMenuItem mnuBills;
    private javax.swing.JMenuItem mnuGetBack;
    private javax.swing.JMenuItem mnuInventories;
    private javax.swing.JMenu mnuInventory;
    private javax.swing.JMenuItem mnuOrders;
    private javax.swing.JMenuItem mnuProvider;
    private javax.swing.JMenu mnuServices;
    private javax.swing.JMenuItem mnuTransactions;
    private javax.swing.JPanel navivgationPanel;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
