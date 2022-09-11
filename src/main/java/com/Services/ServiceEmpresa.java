package com.Services;
import com.Entities.Empresa;

public  class ServiceEmpresa {

    Empresa ep1;

    public  ServiceEmpresa() {
        this.ep1 = new Empresa("HurlBiz","Cra 50 Bis # 08",2728987,"BCA048",null);
    }

    public Empresa getEp1() {
        return ep1;
    }
}