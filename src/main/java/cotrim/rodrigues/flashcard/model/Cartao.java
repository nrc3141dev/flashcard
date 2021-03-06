package cotrim.rodrigues.flashcard.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(schema = Constante.schemaPrincipal, name = "cartao")
@Data
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_flashcard_cartao")
	@SequenceGenerator(name = "sq_flashcard_cartao", schema = Constante.schemaPrincipal, sequenceName = "sq_flashcard_cartao", allocationSize = 1 )
	private Long id;
	
	@Column(name = "texto_frente")
	private String textoFrente;
	
	@Column(name = "texto_tras")
	private String textoTras;
	
	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;
	
	@Column(name = "nivel_conhecimento")
	private Integer nivelConhecimento;
	
	@Column(name = "data_ultima_resposta")
	private LocalDateTime dataUltimaResposta;
	
	@Column(name = "data_proxima_pergunta")
	private LocalDateTime dataProximaPergunta;
	
	@Column(name = "resultado_ultima_resposta")
	private Resultado resultadoUltimaResposta;
	
	@ManyToOne
	@JoinColumn(name = "baralho")
	private Baralho baralho;
}
