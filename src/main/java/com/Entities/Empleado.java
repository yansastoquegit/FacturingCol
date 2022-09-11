package com.Entities;

import javax.persistence.*;
@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "rolEmpleado")
    private String rolEmpleado;
    @Column(name = "empresaPerteneceEmpleado")
    private String empresaPerteneceEmpleado;
    @Transient      //noseQ hace?
    MovimientoDinero movimiento1;

    public Empleado(long id) {
        this.id = id;
    }

    //met constructor
    public Empleado(String nombre, String correo, String empresaPerteneceEmpleado,
                    String rolEmpleado, MovimientoDinero movimiento1 ) {

        this.nombre = nombre;
        this.correo = correo;
        this.empresaPerteneceEmpleado = empresaPerteneceEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.movimiento1 = movimiento1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPerteneceEmpleado() {
        return empresaPerteneceEmpleado;
    }

    public void setEmpresaPerteneceEmpleado(String empresaPerteneceEmpleado) {
        this.empresaPerteneceEmpleado = empresaPerteneceEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public MovimientoDinero getMovimiento1() {
        return movimiento1;
    }

    public void setMovimiento1(MovimientoDinero movimiento1) {
        this.movimiento1 = movimiento1;
    }


    //se sobreescribio para visualizar en to String

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaPerteneceEmpleado=" + empresaPerteneceEmpleado +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                ", movimiento1=" + this.movimiento1 +
                '}';
    }
}
