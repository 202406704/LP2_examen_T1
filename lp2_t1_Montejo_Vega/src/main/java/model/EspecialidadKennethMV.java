package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_especialidad")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter @Setter
public class EspecialidadKennethMV {

    @Id
    @Column(name = "id_especialidad")
	@EqualsAndHashCode.Include
    public int id;

    @Column(name = "titulo", nullable = false)
    public String titulo;

}
