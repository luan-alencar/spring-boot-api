package david.augusto.luan.domain.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedido {

	@Id
	private Long id;
	private String sujeito;
	private String descricao;
	private Date dataInicio;
	private StatusPedido estadoPedido;
	private Usuario usuario;
	private List<StatusPedido> pedidos;

	public Pedido(Long id, String sujeito, String descricao, Date dataInicio, StatusPedido estadoPedido,
			Usuario usuario, List<StatusPedido> pedidos) {
		this.id = id;
		this.sujeito = sujeito;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.estadoPedido = estadoPedido;
		this.usuario = usuario;
		this.pedidos = new ArrayList<StatusPedido>();
	}

	public Pedido() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSujeito() {
		return sujeito;
	}

	public void setSujeito(String sujeito) {
		this.sujeito = sujeito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public StatusPedido getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(StatusPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<StatusPedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<StatusPedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
