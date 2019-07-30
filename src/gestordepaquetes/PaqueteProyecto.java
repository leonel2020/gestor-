/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordepaquetes;

/**
 *
 * @author Desarrollo Web
 */
public class PaqueteProyecto {
       private int codPaqueteDeProyectores;
      private String destinatario;
      private String destino;
      private float costoEnvio;
      private boolean enTransito;

     PaqueteProyecto(int codPaqueDeProyectores, String destinatario, String destino, float costoEnvio, boolean enTransito) {
        this.codPaqueteDeProyectores = codPaqueDeProyectores;
        this.destinatario = destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
        this.enTransito = enTransito;
    }

    public int getCodPaqueteDeProyectores() {
        return codPaqueteDeProyectores;
    }

    public void setCodPaqueteDeProyectores(int codPaqueteDeProyectores) {
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

    
}
