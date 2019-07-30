/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordepaquetes;

import java.util.ArrayList;

/**
 *
 * @author Desarrollo Web
 */
public class GestorDePaquetesDeProyectore {
    ArrayList<PaqueteProyecto>PaqueteProyecto= new ArrayList<>();
   private String Empresa;
   
   PaqueteProyecto buscarPaqueteDeProyectores(int codPaq){
       for(int i=0;i<PaqueteProyecto.size();i++){
           if (PaqueteProyecto.get(i)==PaqueteProyecto.get(codPaq)){
               return PaqueteProyecto.get(i);
           }
       }
       return null;
   }

    public ArrayList<PaqueteProyecto> getPaqueteProyecto() {
        return PaqueteProyecto;
    }

    public void setPaqueteProyecto(ArrayList<PaqueteProyecto> PaqueteProyecto) {
        this.PaqueteProyecto = PaqueteProyecto;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
   
}
