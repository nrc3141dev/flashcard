package cotrim.rodrigues.flashcard.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = Constante.schemaPrincipal, name = "cartao")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flashcard.sq_flashcard_cartao")
	@SequenceGenerator(name = "flashcard.sq_flashcard_cartao", sequenceName = "flashcard.sq_flashcard_cartao" )
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTextoFrente() {
		return textoFrente;
	}
	public void setTextoFrente(String textoFrente) {
		this.textoFrente = textoFrente;
	}
	public String getTextoTras() {
		return textoTras;
	}
	public void setTextoTras(String textoTras) {
		this.textoTras = textoTras;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Integer getNivelConhecimento() {
		return nivelConhecimento;
	}
	public void setNivelConhecimento(Integer nivelConhecimento) {
		this.nivelConhecimento = nivelConhecimento;
	}
	public LocalDateTime getDataUltimaResposta() {
		return dataUltimaResposta;
	}
	public void setDataUltimaResposta(LocalDateTime dataUltimaResposta) {
		this.dataUltimaResposta = dataUltimaResposta;
	}
	public LocalDateTime getDataProximaPergunta() {
		return dataProximaPergunta;
	}
	public void setDataProximaPergunta(LocalDateTime dataProximaPergunta) {
		this.dataProximaPergunta = dataProximaPergunta;
	}
	public Resultado getResultadoUltimaResposta() {
		return resultadoUltimaResposta;
	}
	public void setResultadoUltimaResposta(Resultado resultadoUltimaResposta) {
		this.resultadoUltimaResposta = resultadoUltimaResposta;
	}
	
	
}
