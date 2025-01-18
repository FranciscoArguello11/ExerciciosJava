package ExercicioLista;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {// O tipo de objeto a ser comparado precisa ser declarado

	private String nome, sexo;

	public Pessoa(String nome, String sexo) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		int comparaNome = this.nome.compareTo(outraPessoa.nome); // Por padrão, o método compareTo só compara um
																	// atributo, nesse caso precisamos criar uma lógica
																	// para que seja possível validar o sexo juntamente
																	// ao nome.
		if (comparaNome != 0) {// Essa lógica serve para o programa conseguir comparar o sexo caso o nome seja
								// duplicado, uma vez que o Set não permite entradas duplicadas.
			return comparaNome;
		}
		return this.sexo.compareTo(outraPessoa.sexo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}
}
