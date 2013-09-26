/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conversor.servicio;

import com.grados.service.AngleUnit;
import com.grados.service.AngleUnitSoap;
import com.grados.service.Angles;

/**
 *
 * @author USUARIO
 */
public class conversion {
    
    public static double convertir(Double value, String from, String to){
        
        try{
            //Servicio
            AngleUnit miservicio= new AngleUnit();
            //Port a partir del service
            AngleUnitSoap port = miservicio.getAngleUnitSoap();
            //Metodo del servicio
            return port.changeAngleUnit(value, Angles.fromValue(from), Angles.fromValue(to));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}
