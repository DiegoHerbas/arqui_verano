package com.juanvladmir13.mvc.vista;

import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class VPelicula extends javax.swing.JFrame {

  public VPelicula() {
    initComponents();
  }

  public Map<String, String> getFormData() {
    Map<String, String> data = new HashMap<>();

    data.put("id", txtId.getText());
    data.put("nombre", txtNombre.getText());
    data.put("duracion", txtDuracion.getText());

    return data;
  }

  public void setFormData(Object[] os) {
    txtId.setText(os[0].toString());
    txtNombre.setText(os[1].toString());
    txtDuracion.setText(os[2].toString());
  }

  public void clearFormData() {
    txtId.setText("");
    txtNombre.setText("");
    txtDuracion.setText("");
  }

  public void setTable(Map<String, Object[]> maps) {
    DefaultTableModel dt = (DefaultTableModel) tabListado.getModel();
    dt.setRowCount(0);

    for (Map.Entry<String, Object[]> entry : maps.entrySet()) {
      dt.addRow(entry.getValue());
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnCreate = new javax.swing.JButton();
    btnGuardar = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    btnDelete = new javax.swing.JButton();
    txtDuracion = new javax.swing.JTextField();
    btnList = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    txtId = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabListado = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("MVC - Gestionar Pelicula");

    btnCreate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnCreate.setText("Create");

    btnGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnGuardar.setText("Save");

    jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel6.setText("Duracion");

    btnDelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnDelete.setText("Delete");

    txtDuracion.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    btnList.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnList.setText("List");

    jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel1.setText("ID");

    txtId.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel2.setText("Nombre");

    txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    tabListado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    tabListado.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Title 1", "Title 2", "Title 3"
      }
    ));
    tabListado.setRowHeight(32);
    jScrollPane1.setViewportView(tabListado);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(278, 278, 278)
                    .addComponent(btnCreate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnGuardar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnDelete)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnList))
                  .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE)))
            .addContainerGap())
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabel6)
              .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnCreate)
              .addComponent(btnGuardar)
              .addComponent(btnDelete)
              .addComponent(btnList))
            .addGap(43, 43, 43)))
        .addGap(18, 18, 18)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel6)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(129, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btnCreate;
  public javax.swing.JButton btnDelete;
  public javax.swing.JButton btnGuardar;
  public javax.swing.JButton btnList;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tabListado;
  private javax.swing.JTextField txtDuracion;
  private javax.swing.JTextField txtId;
  private javax.swing.JTextField txtNombre;
  // End of variables declaration//GEN-END:variables

}
