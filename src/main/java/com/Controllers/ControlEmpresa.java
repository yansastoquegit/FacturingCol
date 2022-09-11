package com.Controllers;

import com.Entities.Empresa;
import com.Services.ServiceEmpresa;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpresa {

    ServiceEmpresa se1 = new ServiceEmpresa();
    Empresa emp1;

    public Empresa ControlEmpresa(){
        this.emp1 = this.se1.getEp1();

    // DEberia reconocerse pero no lo hacer apesar que puse
        // las importaciones esto permite ver
        // en el navegador  @GetMapping(value = "/informacion") String informacion; {
        return this.emp1;
    //}


    }

}
