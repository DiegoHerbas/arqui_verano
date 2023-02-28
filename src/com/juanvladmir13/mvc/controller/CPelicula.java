package com.juanvladmir13.mvc.controller;

import com.juanvladmir13.mvc.model.MPelicula;
import com.juanvladmir13.mvc.vista.VPelicula;
import com.uagrm.edu.mvc.IController;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class CPelicula implements IController {
  private MPelicula model;
  private VPelicula view;

  public CPelicula() {
    this.model = new MPelicula();
    this.view = new VPelicula();

    initListener();
  }

  public MPelicula getModel() {
    return model;
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

  @Override
  public void showForm() {
    view.setVisible(true);
  }
}
