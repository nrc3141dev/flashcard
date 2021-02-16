package cotrim.rodrigues.flashcard.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(schema = Constante.schemaPrincipal, name = "baralho")
@Data
public class Baralho {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_baralho")
	@SequenceGenerator(name = "sq_baralho", schema = Constante.schemaPrincipal, sequenceName = "sq_baralho", allocationSize = 1)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "baralho", orphanRemoval = true)
	private List<Cartao> cartoes;
	
	
	public Cartao addCartao() {
		Cartao novo = new Cartao();
		novo.setBaralho(this);
		return novo;
	}

}
