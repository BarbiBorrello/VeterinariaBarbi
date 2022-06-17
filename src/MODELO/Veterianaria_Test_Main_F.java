/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.logging.Level;
import java.util.logging.Logger;
import CONTROLADOR.ClienteData;
import CONTROLADOR.Conexion;
import CONTROLADOR.MascotaData;
import CONTROLADOR.TratamientoData;
import CONTROLADOR.VisitaData;

public class Veterianaria_Test_Main_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {

            Conexion conexion = new Conexion();
            ClienteData cd = new ClienteData(conexion);
            MascotaData md = new MascotaData(conexion);
            TratamientoData td = new TratamientoData(conexion);
            VisitaData vd = new VisitaData(conexion);
            

            /* Eliminar esta linea para chequear busqueda de tratamientos Activo e inactivos A-
            // Buscar tratamiento activo existente
            td.buscarTratamientoActivo(0);
            // Buscar tratamiento activo inexistente
            td.buscarTratamientoActivo(515);
            // Buscar tratamiento inactivo existente
            td.buscarTratamientoInactivo(6);
            // Buscar tratamiento inactivo inexistente
            Eliminar esta linea para chequear busqueda de tratamientos Activo e inactivos -A*/
            
            
            cd.buscarClientexDNI(9530545);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Veterianaria_Test_Main_F.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
