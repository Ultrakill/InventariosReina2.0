/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista;

import com.proyecto.beans.Tipo;
import com.proyecto.control.AbstractControlador;
import com.proyecto.control.TipoControlador;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Documentos
 */
public class MantenimientoTipo extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoTipo
     */
    private static MantenimientoTipo instancia;
    public MantenimientoTipo() {
        initComponents();
        listar();
        btnguardar.setEnabled(false);
        nombreField.setEnabled(false);
    }

    public static MantenimientoTipo getInstancia() {
        if (instancia == null) {
            instancia = new MantenimientoTipo();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltipo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Mantenimiento Tipo");

        jLabel1.setText("Buscar: ");

        jButton1.setText("Buscar");

        jLabel2.setText("Lista de tipos:");

        tbltipo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbltipo);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 10))); // NOI18N
        jPanel1.setToolTipText("");

        idLabel.setText("Id:");

        idField.setEditable(false);

        nombreLabel.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(nombreLabel))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(nombreField))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 10))); // NOI18N
        jPanel2.setToolTipText("");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevo)
                .addGap(18, 18, 18)
                .addComponent(btnguardar)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        btnguardar.setEnabled(true);
        nombreField.setEnabled(true);
        btnnuevo.setEnabled(false);
        accion = AbstractControlador.NUEVO;
        tipoControlador.prepararCrear();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String palabra = "";
        String palabra2 = "";
        if (accion == 1) {
            palabra = "registrar";
            palabra2 = "registrado";

            if (JOptionPane.showConfirmDialog(null, "¿Desea " + palabra + " la Tipo?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                tipoControlador.getSeleccionado().setNombre(nombreField.getText());
                tipoControlador.accion(accion);
                System.out.println("se guardo");
                lista.add(tipoControlador.getSeleccionado());
                if (accion == 1) {
                    JOptionPane.showMessageDialog(null, "Tipo " + palabra2 + " correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
                    nombreField.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                nombreField.setText(null);
                JOptionPane.showMessageDialog(null, "Tipo no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
            }
        } else if (accion == 2) {
            palabra = "modificar";
            palabra2 = "modificado";

            if (JOptionPane.showConfirmDialog(null, "¿Desea " + palabra + " la Tipo?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                if (accion == 2) {
                    JOptionPane.showMessageDialog(null, "Tipo " + palabra2 + " correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
                    nombreField.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                nombreField.setText(null);
                JOptionPane.showMessageDialog(null, "Tipo no " + palabra2, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
            }
        }

        btnguardar.setEnabled(false);
        nombreField.setEnabled(false);
        btnnuevo.setEnabled(true);
        btnmodificar.setEnabled(true);

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        accion = AbstractControlador.MODIFICAR;
        btnguardar.setEnabled(true);
        btnmodificar.setEnabled(false);
        btnnuevo.setEnabled(false);
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        accion = AbstractControlador.ELIMINAR;
        if (tbltipo.getSelectedRow() != -1) {
            Integer codigo = (Integer) tbltipo.getModel().getValueAt(tbltipo.getSelectedRow(), 0);

            Tipo tipo = tipoControlador.buscarPorId(codigo);

            if (tipo != null) {
                if (JOptionPane.showConfirmDialog(null, "¿Desea Eliminar la Tipo?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    int[] filas = tbltipo.getSelectedRows();
                    for (int i = 0; i < filas.length; i++) {
                        Tipo tipo2 = lista.get(filas[0]);
                        lista.remove(tipo2);
                        tipoControlador.setSeleccionado(tipo2);
                        tipoControlador.accion(accion);
                    }
                    if (tipoControlador.accion(accion) == 3) {
                        JOptionPane.showMessageDialog(null, "Tipo eliminada correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo no eliminada", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo no eliminada", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    private int accion;
    private List<Tipo> lista;
    private final TipoControlador tipoControlador = new TipoControlador();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTable tbltipo;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        lista = tipoControlador.buscarTodos();
        lista = ObservableCollections.observableList(lista);
        JTableBinding binding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ, lista, tbltipo);

        BeanProperty bId = BeanProperty.create("id");
        BeanProperty bNombre = BeanProperty.create("nombre");

        binding.addColumnBinding(bId).setColumnName("ID").setEditable(false);

        binding.addColumnBinding(bNombre).setColumnName("NOMBRE").setEditable(false);

        binding.bind();

    }
}
