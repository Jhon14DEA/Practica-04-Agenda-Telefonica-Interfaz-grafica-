/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Vista;

import java.awt.*;

/**
 *
 * @author JHON FAREZ
 */
public class VentanaTelefono extends Frame {

    //Paneles
    private Panel panelPrincipal;
    private Panel panelRegistro;
    private Panel panelBotones;
    //Botones
    private Button salir;
    private Button registrar;
    //Textos    
    private Label modificar;
    private Label eliminar;
    private Label buscar;
    private Label listarTelefonos;
    public VentanaTelefono(String telefonos) {
        this.setTitle("AGENTA TELEFONICA");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        panelPrincipal = new Panel(new BorderLayout());
        panelRegistro = new Panel(new GridLayout(6, 6, 6, 6));
        panelBotones = new Panel();
        salir = new Button("Registrar");
        registrar = new Button("Salir");       
        modificar = new Label("Modificar:", Label.CENTER);
        eliminar = new Label("Eliminar:", Label.CENTER);
        buscar = new Label("Buscar:", Label.CENTER);
        listarTelefonos = new Label("Listar sus telefonos:", Label.CENTER);
        panelRegistro.add(modificar);
        panelRegistro.add(new TextField());
        panelRegistro.add(eliminar);
        panelRegistro.add(new TextField());
        panelRegistro.add(buscar);
        panelRegistro.add(new TextField());
        panelRegistro.add(listarTelefonos);
        panelRegistro.add(new TextField());
        panelBotones.add(registrar);
        panelBotones.add(salir);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        panelPrincipal.add(panelRegistro, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        this.add(panelPrincipal);

    }
}
