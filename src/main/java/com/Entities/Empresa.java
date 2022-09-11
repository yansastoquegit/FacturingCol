package com.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
//@Table(name="Empresa")

public class Empresa {
    private String nombre;
    private String direccion;
    private int telefono;
    private String nit;

    //Creacion objeto para relacionarlo con clase empleado
   Empleado empleado1;

    public Empresa(String nombre, String direccion, int telefono, String nit, Empleado empleado1) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.empleado1 = empleado1;
    }

    //creacion GET&set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;}

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", nit='" + nit + '\'' +
                ", empleado1=" +this.empleado1 +
                '}';
    }
}
