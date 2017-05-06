package br.com.fiap.entity;
import javax.persistence.*;

@Entity
@Table(name="TB_PERFUME")
@SequenceGenerator(name="seqPerfume", sequenceName="SEQ_TB_PERFUME", allocationSize=1)
public class Perfume {

	@Id
	@Column(name="CD_CODIGO")
	@GeneratedValue(generator="seqPerfume", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_PERFUME", nullable=false)
	private String Nome;
	
	@Column(name="DS_CATEGORIA")
	private Categoria categoria;
	
	@Column(name="VL_PRECO")
	private double preco;

	
	public Perfume() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perfume(int codigo, String nome, Categoria categoria, double preco) {
		super();
		this.codigo = codigo;
		Nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
