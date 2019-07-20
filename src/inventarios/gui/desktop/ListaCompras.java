/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop;

import inventarios.Compras;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar Marroquin
 */
public class ListaCompras extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    int con = 0;

    /**
     * Creates new form ListaCompras
     */
    public ListaCompras() {
        initComponents();
        MostrarInterfaz();
        MostrarLosDatos();
        this.setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        cerrar();
    }

    public void MostrarInterfaz() {
        //para agregar los datos en un arreglo vacio//
        String data[][] = {};

        String col[] = {"Fecha", "Proveedor", "Dirección", "Teléfono", "RFC", "E-mail", "Producto"};
        modelo = new DefaultTableModel(data, col);
        shoppingTable.setModel(modelo);

    }

    public void MostrarLosDatos() {
        Compras c;
        for (int i = 0; i < ShoppingWindow.shoppingList.size(); i++) {
            c = (Compras) ShoppingWindow.shoppingList.get(i);
            modelo.insertRow(con, new Object[]{});
            modelo.setValueAt(c.getFecha(), con, 0);
            modelo.setValueAt(c.getProveedor(), con, 1);
            modelo.setValueAt(c.getDireccion(), con, 2);
            modelo.setValueAt(c.getTelefono(), con, 3);
            modelo.setValueAt(c.getRFC(), con, 4);
            modelo.setValueAt(c.getMail(), con, 5);
            modelo.setValueAt(c.getProducto(), con, 6);

        }
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(ListaCompras.DO_NOTHING_ON_CLOSE);
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

        shoppingScroll = new javax.swing.JScrollPane();
        shoppingTable = new javax.swing.JTable();
        btnDeleteRow = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnGetBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Compras Agregadas");
        setResizable(false);

        shoppingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        shoppingScroll.setViewportView(shoppingTable);

        btnDeleteRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar fila.png"))); // NOI18N
        btnDeleteRow.setBorder(null);
        btnDeleteRow.setContentAreaFilled(false);
        btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });

        btnDeleteAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar todo.png"))); // NOI18N
        btnDeleteAll.setBorder(null);
        btnDeleteAll.setContentAreaFilled(false);
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Lista de Compras");

        btnMenu.setBackground(new java.awt.Color(255, 0, 51));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnGetBack.setText("REGRESAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shoppingScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnDeleteRow, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteAll)
                                .addGap(31, 31, 31)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGetBack))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(lblTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(22, 22, 22)
                .addComponent(shoppingScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetBack)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        try {
            modelo = (DefaultTableModel) shoppingTable.getModel();
            modelo.removeRow(shoppingTable.getSelectedRow());
            shoppingTable.addRowSelectionInterval(0, 0);
            modelo = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) shoppingTable.getModel();
            int rows = shoppingTable.getRowCount();
            for (int i = 0; rows > i; i++) {
                model.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnGetBack;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane shoppingScroll;
    private javax.swing.JTable shoppingTable;
    // End of variables declaration//GEN-END:variables
}
