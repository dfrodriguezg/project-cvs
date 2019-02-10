
package cvs.cvs.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numreferenciatransaccion",
    "numtransaccion",
    "estado",
    "nombrecliente"
})
public class RelacionCVS {

    @JsonProperty("numreferenciatransaccion")
    private Numreferenciatransaccion numreferenciatransaccion;
    @JsonProperty("numtransaccion")
    private Numtransaccion numtransaccion;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("nombrecliente")
    private Nombrecliente nombrecliente;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numreferenciatransaccion")
    public Numreferenciatransaccion getNumreferenciatransaccion() {
        return numreferenciatransaccion;
    }

    @JsonProperty("numreferenciatransaccion")
    public void setNumreferenciatransaccion(Numreferenciatransaccion numreferenciatransaccion) {
        this.numreferenciatransaccion = numreferenciatransaccion;
    }

    @JsonProperty("numtransaccion")
    public Numtransaccion getNumtransaccion() {
        return numtransaccion;
    }

    @JsonProperty("numtransaccion")
    public void setNumtransaccion(Numtransaccion numtransaccion) {
        this.numtransaccion = numtransaccion;
    }

    @JsonProperty("estado")
    public Estado getEstado() {
        return estado;
    }

    @JsonProperty("estado")
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @JsonProperty("nombrecliente")
    public Nombrecliente getNombrecliente() {
        return nombrecliente;
    }

    @JsonProperty("nombrecliente")
    public void setNombrecliente(Nombrecliente nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
