/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import CONTROLADOR.ClienteData;
import CONTROLADOR.Conexion;
import CONTROLADOR.MascotaData;
import CONTROLADOR.TratamientoData;
import CONTROLADOR.VisitaData;

/**
 *
 * @author Barbara
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            // TODO code application logic here
            Conexion conexion = new Conexion();
            ClienteData cd = new ClienteData(conexion);
            MascotaData md = new MascotaData(conexion);
            TratamientoData td = new TratamientoData(conexion);
            VisitaData vd = new VisitaData(conexion);

// Prueba:  CLIENTE DATA //------------------------------------------------------------------- 
// METODO: AGREGAR CLIENTE //-----------------------------------------------------------------

// Cliente cliente1 = new Cliente(23456789, "Francella", "Guillermo", "Avenida Siempre viva 123", 12345678, "Pedrito rulito", true);
// cd.agregarCliente(cliente1);

//Cliente cliente2 = new Cliente ( 13690269, "Martinez", "Hector Antonio", "Juan Gilberto Funes 178 (Cerro de Oro)",266450330, "Liliana", true);
//cd.agregarCliente(cliente2);
//
//Cliente cliente3 = new Cliente(12592708, "Arias", "Lidia", "Cipres 12", 473330, "no tiene", true);
//cd.agregarCliente(cliente3);
//
//Cliente cliente4 = new Cliente (9530567, "Peres","Antonia", "Gascon 20 ", 453901, "Pablo", true);
//cd.agregarCliente(cliente4);
//cd.modificarCliente(4, cliente4);

//Cliente cliente5 = new Cliente (25678234, "Borrello", "Barbara", "Sarmiento 4206", 456789, "", true);
//cd.agregarCliente(cliente5);

//Cliente cliente6 = new Cliente (5530976,"Borrello", "Hector", "Avenida Los Incas 425", 266470842, "Pancho", true);
//cd.agregarCliente(cliente6);

//Cliente cliente7 = new Cliente ( 23567456,"Saez","Juan Jose", "Juan de Azurduy 2920",423678, "Michi",true);
//cd.agregarCliente(cliente7);


// COMENTARIOS//----------------------------------------------------------------------------------------------
//  telefono pasar a string? //
// no debe permitir duplicados por DNI //
// puede no tener contacto alterntivo, debe especificar que no tiene, no puede quedar vacio//
// no se deben poder crear clientes en estado inactivo//

//---------------------------------------------------------------------------------------------------------------------------------------

// METODO: BUSCAR CLIENTE X ID //-----------------------------------------------------------------
//
//cd.buscarCliente(1);
//cd.buscarCliente(2);
//cd.buscarCliente(34);

// METODO: BUSCAR CLIENTE X DNI //-----------------------------------------------------------------

//cd.buscarClientexDNI(5530976);
//cd.buscarClientexDNI(1145678);

// METODO: BUSCAR CLIENTE X APELLIDO //-----------------------------------------------------------------

//cd.buscarClientexAPELLIDO("Martinez");
//no corre

Mascota mascota1 = new Mascota("Pedro", "macho", "perro", "golden", "dorado", LocalDate.of(2020,4, 29), 40, 50.5, true,cd.buscarCliente(4));
md.agregar_Mascota(mascota1);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
