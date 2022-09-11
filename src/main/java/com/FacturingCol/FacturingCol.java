package com.FacturingCol;

import com.Entities.Empleado;
import com.Entities.Empresa;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturingCol {

    //se  creo por correction 
    private static Empleado empleado;

    public static void main(String[] args) {
        SpringApplication.run(FacturingCol.class, args);


        Empleado empleado1 = null;

        Empresa emp1 = new Empresa(
                "Hurbliz",
                "Calle 50",
                20221, "ABC203", empleado1);

        empleado1 = new Empleado(
                "Juan Acosta","pepe@gmail.com",
                "Hurlbiz","Administrador",null);

        System.out.println(emp1.toString());

    }




}
