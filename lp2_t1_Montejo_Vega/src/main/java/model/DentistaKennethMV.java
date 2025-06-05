package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter @Setter
public class DentistaKennethMV {

    @Id
    @Column(name = "id_dentista")
    public int idDentista;

    @Column(nullable = false)
    public String cop;

    @Column(name = "nombre_completo", nullable = false)
    public String nombreCompleto;

    @Column(name = "fecha_inicio_contrato", nullable = false)
    public Date fechaInicioContrato;

    @Column(nullable = false)
    public String turno;

    @Column(nullable = false)
    public String correo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad", nullable = false)
    public EspecialidadKennethMV especialidad;
    
    @Override
    public String toString() {
        return nombreCompleto;  
    }

}
