package com.Entities;

public class MovimientoDinero {

        private double montoMovimiento;
        private String conceptoMovimiento;

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    //metodos dos crearMonto y responsable mvmto=Transaccion
    //usuarioEncargadoRegistrarMovimiento nombre

    public double crearMonto() {
        return 0;
    }

    public int responsableCrearTransaccion() {
        return 0;
    }




}

