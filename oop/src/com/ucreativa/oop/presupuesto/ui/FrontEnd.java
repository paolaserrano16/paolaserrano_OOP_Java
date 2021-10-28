package com.ucreativa.oop.presupuesto.ui;

import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistroEnArchivo;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;
import com.ucreativa.oop.presupuesto.repo.FileRepository;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class FrontEnd extends JFrame {

    public FrontEnd(String sistema_registro_de_movimientos) {

    }

    public void build(){

        InterfaceRegistro registro = new ImplementacionRegistroEnArchivo(new FileRepository());




        JLabel lblNombre = new JLabel("Nombre");
        JTextField txtNombre = new JTextField();
        JLabel lblMoneda = new JLabel("Moneda");
        JTextField txtMoneda = new JTextField();
        JLabel lblCategoria = new JLabel("Categoria");
        JTextField txtCategoria = new JTextField();
        JLabel lblMonto = new JLabel("Monto");
        JTextField txtMonto = new JTextField();
        JLabel lblPeriodicidad = new JLabel("Periodicidad");
        JTextField txtPeriodicidad = new JTextField();
        JCheckBox ckIsIngreso = new JCheckBox("Es un Ingreso?");
        ckIsIngreso.setSelected(true);
        JButton salvar = new JButton("Salvar");
        JButton reporte = new JButton("Reporte");
        JLabel lblWarnings = new JLabel("");
        // ACTIONS
        ckIsIngreso.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblPeriodicidad.setVisible(!lblPeriodicidad.isVisible());
                txtPeriodicidad.setVisible(!txtPeriodicidad.isVisible());
            }
        });
        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean exitoso;
                if (ckIsIngreso.isSelected()){
                    lblWarnings.setText("Salvando Ingreso");
                    exitoso = registro.addIngreso(txtNombre.getText(),
                            txtMoneda.getText(),
                            txtCategoria.getText(),
                            txtMonto.getText(),
                            txtPeriodicidad.getText());
                }else {
                    lblWarnings.setText("Salvando Gasto");
                    exitoso = registro.addGasto(txtNombre.getText(),
                            txtMoneda.getText(),
                            txtCategoria.getText(),
                            txtMonto.getText());
                }
                if (exitoso){
                    txtNombre.setText("");
                    txtMoneda.setText("");
                    txtCategoria.setText("");
                    txtMonto.setText("");
                    txtPeriodicidad.setText("");
                }
            }
        });
        reporte.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registro.getGastos();
                registro.getMovimientos();
            }
        });
        // Add into the Container
        super.add(lblNombre);
        super.add(txtNombre);
        super.add(lblMoneda);
        super.add(txtMoneda);
        super.add(lblCategoria);
        super.add(txtCategoria);
        super.add(lblMonto);
        super.add(txtMonto);
        super.add(lblPeriodicidad);
        super.add(txtPeriodicidad);
        super.add(ckIsIngreso);
        super.add(salvar);
        super.add(reporte);
        super.add(lblWarnings);
    }
}