package cotrim.rodrigues.flashcard.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(schema = Constante.schemaPrincipal, name = "usuario")
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario")
	@SequenceGenerator(name = "sq_usuario", schema = Constante.schemaPrincipal, sequenceName = "sq_usuario", allocationSize = 1)
	private Long id;

	@Column(name = "email")
	private String email;

	@Column(name = "nome")
	private String nome;

	@Column(name = "senha")
	private String senha;

	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Baralho> baralhos;
	
	public Baralho addBaralho() {
		Baralho novo = new Baralho();
		novo.setUsuario(this);
		this.baralhos.add(novo);
		return novo;
	}


}
