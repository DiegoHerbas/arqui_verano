package com.juanvladmir13.mvc.controller;

import com.juanvladmir13.mvc.model.MBoleto;
import com.juanvladmir13.mvc.model.MCliente;
import com.juanvladmir13.mvc.model.MPelicula;
import com.juanvladmir13.mvc.vista.VBoleto;
import com.uagrm.edu.mvc.IController;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class CBoleto implements IController {

  private MBoleto model;
  private VBoleto view;

  private MCliente modelCliente;
  private MPelicula modelPelicula;

  public CBoleto(MCliente modelCliente, MPelicula modelPelicula) {
    this.model = new MBoleto();
    this.view = new VBoleto();

    this.modelCliente = modelCliente;
    this.modelPelicula = modelPelicula;

    initListener();
  }

  @Override
  public void create() {
    view.clearFormData();
  }

  @Override
  public void save() {
    model.setData(view.getFormData());
    view.setFormData(model.save());

    list();
  }

  @Override
  public void delete() {
    model.setData(view.getFormData());
    model.delete();

    list();
    view.clearFormData();
  }

  @Override
  public void list() {
    view.setTable(model.list());
  }

  @Override
  public void initListener() {
    view.btnCreate.addActionListener((evt) -> {
      create();
    });

    view.btnGuardar.addActionListener((evt) -> {
      save();
    });

    view.btnDelete.addActionListener((evt) -> {
      delete();
    });

    view.btnList.addActionListener((evt) -> {
      list();
    });
  }

  private void cargarTablasAsociadas() {
    view.cargarCliente(modelCliente.rowsToString());
    view.cargarPeliculas(modelPelicula.rowsToString());
  }

  @Override
  public void showForm() {
    view.setVisible(true);
    cargarTablasAsociadas();
  }
}
