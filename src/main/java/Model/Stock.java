package Model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name= "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Integer cantidad;

    @Column
    private Integer puntoPedido;

    @Column(name = "insumo_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Insumo insumo;

    @Column(name = "planta_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Planta planta;

    public Stock() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPuntoPedido() {
        return puntoPedido;
    }

    public void setPuntoPedido(Integer puntoPedido) {
        this.puntoPedido = puntoPedido;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Planta getPlanta(){
        return this.planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }


}
