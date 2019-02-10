package cvs.cvs.model;

import org.springframework.stereotype.Component;

@Component
public class RelacionCVS {
	private String numreferenciatransaccion;
	private String numtransaccion;
	private String estado;
	private String nombrecliente;
	
	public String getNumreferenciatransaccion() {
		return numreferenciatransaccion;
	}
	public void setNumreferenciatransaccion(String numreferenciatransaccion) {
		this.numreferenciatransaccion = numreferenciatransaccion;
	}
	public String getNumtransaccion() {
		return numtransaccion;
	}
	public void setNumtransaccion(String numtransaccion) {
		this.numtransaccion = numtransaccion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
    
	
}