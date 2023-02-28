package com.juanvladmir13.mvc.vista;

import com.juanvladmir13.mvc.strategy.Contado;
import com.juanvladmir13.mvc.strategy.Context;
import com.juanvladmir13.mvc.strategy.Tarjeta;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class VBoleto extends javax.swing.JFrame {
  private Context strategy;

  public VBoleto() {
    initComponents();
    strategy = new Context();

    btnDescuento.addActionListener((evt) -> {
      ejecutarStrategy();
    });
  }

  public Map<String, String> getFormData() {
    Map<String, String> data = new HashMap<>();

    data.put("id", txtId.getText());
    data.put("numero", txtNumero.getText());
    data.put("fecha", txtFecha.getText());
    data.put("horaInicio", txtHoraInicio.getText());
    data.put("numeroAsiento", txtNumeroAsiento.getText());
    data.put("precio", txtPrecio.getText());
    data.put("descuento", txtDescuento.getText());

    data.put("formaDePago", cbxFormaPago.getSelectedItem().toString());

    String pelicula[] = cbxPelicula.getSelectedItem().toString().split("|");
    data.put("pelicula_id", pelicula[0]);

    String cliente[] = cbxCliente.getSelectedItem().toString().split("|");
    data.put("cliente_id", cliente[0]);

    return data;
  }

  public void setFormData(Object[] os) {
    txtId.setText(os[0].toString());
    txtNumero.setText(os[1].toString());
    txtFecha.setText(os[2].toString());
    txtHoraInicio.setText(os[3].toString());
    txtNumeroAsiento.setText(os[4].toString());
    //
    txtPrecio.setText(os[6].toString());
    txtDescuento.setText(os[7].toString());
  }

  public void clearFormData() {
    txtId.setText("");
    txtId.setText("");
    txtNumero.setText("");
    txtFecha.setText("");
    txtHoraInicio.setText("");
    txtNumeroAsiento.setText("");
    //
    txtPrecio.setText("");
    txtDescuento.setText("");
  }

  public void setTable(Map<String, Object[]> maps) {
    DefaultTableModel dt = (DefaultTableModel) tabListado.getModel();
    dt.setRowCount(0);

    for (Map.Entry<String, Object[]> entry : maps.entrySet()) {
      dt.addRow(entry.getValue());
    }
  }

  public void cargarCliente(List<String> rows) {
    cbxCliente.removeAllItems();

    for (int index = 0; index < rows.size(); index++) {
      cbxCliente.addItem(rows.get(index));
    }
  }

  public void cargarPeliculas(List<String> rows) {
    cbxPelicula.removeAllItems();

    for (int index = 0; index < rows.size(); index++) {
      cbxPelicula.addItem(rows.get(index));
    }
  }

  private void ejecutarStrategy() {
    String opcion = cbxFormaPago.getSelectedItem().toString();

    if (opcion.equals("Contado -20%")) {
      strategy.setStrategy(new Contado());
    }

    if (opcion.equals("Tarjeta -15%")) {
      strategy.setStrategy(new Tarjeta());
    }

    double precio = Double.valueOf(txtPrecio.getText());
    double descuento = strategy.precioFinalConDescuento(precio);

    txtDescuento.setText(Double.toString(descuento));
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    txtId = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtFecha = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtNumero = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtHoraInicio = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    txtNumeroAsiento = new javax.swing.JTextField();
    cbxPelicula = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    cbxCliente = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabListado = new javax.swing.JTable();
    btnCreate = new javax.swing.JButton();
    btnGuardar = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    btnList = new javax.swing.JButton();
    txtDescuento = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    cbxFormaPago = new javax.swing.JComboBox<>();
    btnDescuento = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    txtPrecio = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("MVC - Gestionar boleto");

    jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel1.setText("ID");

    txtId.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel2.setText("Fecha");

    txtFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel3.setText("Pelicula");

    jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel5.setText("Numero");

    txtNumero.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel6.setText("Hora inicio");

    txtHoraInicio.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel7.setText("Asiento");

    txtNumeroAsiento.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    cbxPelicula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel4.setText("Cliente");

    cbxCliente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    tabListado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    tabListado.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
      }
    ));
    tabListado.setRowHeight(32);
    jScrollPane1.setViewportView(tabListado);

    btnCreate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnCreate.setText("Create");

    btnGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnGuardar.setText("Save");

    btnDelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnDelete.setText("Delete");

    btnList.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnList.setText("List");

    txtDescuento.setEditable(false);
    txtDescuento.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel9.setText("Forma de pago");

    cbxFormaPago.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    cbxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado -20%", "Tarjeta -15%" }));

    btnDescuento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    btnDescuento.setText("Descuento");

    jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel10.setText("Descuento");

    txtPrecio.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

    jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    jLabel11.setText("Precio");

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
                  .addComponent(jLabel3)
                  .addComponent(cbxPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel1)
                      .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(txtNumero))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnCreate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnGuardar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnDelete)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnList)))
                .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel2)
                  .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel6)
                  .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel7)
                  .addComponent(txtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel10)
                  .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel9)
              .addGroup(layout.createSequentialGroup()
                .addComponent(cbxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDescuento)))
            .addGap(0, 20, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreate)
                        .addComponent(btnGuardar)
                        .addComponent(btnDelete)
                        .addComponent(btnList))
                      .addComponent(jLabel5))
                    .addGap(41, 41, 41))))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel6)
                  .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel11)
              .addComponent(jLabel10))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(21, 21, 21)
        .addComponent(jLabel3)
        .addGap(18, 18, 18)
        .addComponent(cbxPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel4)
        .addGap(18, 18, 18)
        .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel9)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(cbxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnDescuento))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btnCreate;
  public javax.swing.JButton btnDelete;
  private javax.swing.JButton btnDescuento;
  public javax.swing.JButton btnGuardar;
  public javax.swing.JButton btnList;
  private javax.swing.JComboBox<String> cbxCliente;
  private javax.swing.JComboBox<String> cbxFormaPago;
  private javax.swing.JComboBox<String> cbxPelicula;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tabListado;
  private javax.swing.JTextField txtDescuento;
  private javax.swing.JTextField txtFecha;
  private javax.swing.JTextField txtHoraInicio;
  private javax.swing.JTextField txtId;
  private javax.swing.JTextField txtNumero;
  private javax.swing.JTextField txtNumeroAsiento;
  private javax.swing.JTextField txtPrecio;
  // End of variables declaration//GEN-END:variables

}
