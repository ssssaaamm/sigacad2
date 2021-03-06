package models;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
@Table(name="examenRepetidos")
public class ERep2 extends Model{
	@Id
	public Long id;
	public String carrera;
    public String materia;
	public Integer ano;
	public Integer ciclo; 
	public Integer evaluaciones;
    public Integer  repetidos;

	public static Finder<Long, ERep2> find = new Finder<Long,ERep2>(ERep2.class);

}