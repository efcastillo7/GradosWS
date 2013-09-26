/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conversor.servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "ConversorWS")
public class ConversorWS {
        @WebMethod(operationName = "convercion")
    public Double convertir(@WebParam(name = "value") Double value,
    @WebParam(name = "from") String from, @WebParam(name = "to") String to) {
        return conversion.convertir(value, from, to);
    }

    }
