package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Equipo_DentalKennethMV {

	@Id
    @Column(name = "nro_equipo")
    public int idEquipo;

    @Column(nullable = false)
    public String nombre;

    @Column(nullable = false)
    public double costo;

    @Column(name = "fecha_adquisicion", nullable = false, insertable = false, updatable = false)
    public Date fechaAdquisicion;

    @Column(nullable = false)
    public String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dentista", nullable = false)
    public DentistaKennethMV dentista;

}
