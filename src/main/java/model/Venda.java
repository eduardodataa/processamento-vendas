package model;
import java.math.BigDecimal;

/**
 * 
 */

/**
 * @author Eduardo Cordeiro
 *
 */
public class Venda {

	private Long operacao;
	private Long cliente;
	private Integer quantidadeIngressos;
	private BigDecimal valorTotal;
	private String status;
	
	
	
	/**
	 * @param operacao
	 * @param cliente
	 * @param quantidadeIngressos
	 * @param valorTotal
	 * @param status
	 */
	public Venda(Long operacao, Long cliente, Integer quantidadeIngressos, BigDecimal valorTotal, String status) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
		this.quantidadeIngressos = quantidadeIngressos;
		this.valorTotal = valorTotal;
		this.status = status;
	}
	
	
	/**
	 * 
	 */
	public Venda() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getOperacao() {
		return operacao;
	}
	public void setOperacao(Long operacao) {
		this.operacao = operacao;
	}
	public Long getCliente() {
		return cliente;
	}
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	public Integer getQuantidadeIngressos() {
		return quantidadeIngressos;
	}
	public void setQuantidadeIngressos(Integer quantidadeIngressos) {
		this.quantidadeIngressos = quantidadeIngressos;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Venda [operacao=");
		builder.append(operacao);
		builder.append("\\n,  cliente=");
		builder.append(cliente);
		builder.append("\\n,  quantidadeIngressos=");
		builder.append(quantidadeIngressos);
		builder.append("\\n,  valorTotal=");
		builder.append(valorTotal);
		builder.append("\\n,  status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	
}
