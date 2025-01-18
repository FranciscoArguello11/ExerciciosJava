package ExercicioLista;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NomeeSexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparaNomeSexo();

	}

	private static void comparaNomeSexo() {
		// TODO Auto-generated method stub
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>(); // Gera uma nova lista para a coleção de pessoas,
		List<Pessoa> listaHomens = new ArrayList<Pessoa>(); // indicando que a lista vai guardar objetos do tipo pessoa.
		List<Pessoa> listaMulheres = new ArrayList<Pessoa>();

		String nome;
		String sexo;
		Scanner scan = new Scanner(System.in); // Inicia um Scanner para receber os dados do usuário via console.

		while (true) { // Cria um loop "infinito" para que possam ser inseridos quantos registros o
						// usuário quiser.
			System.out.println("Preencha seu nome, ou digite Sair para fechar:\n");
			nome = scan.nextLine(); // Aplica o nome inserido pelo usuário no scanner na variável de nome, e para o
									// programa caso seja digitado a palavra "Sair".

			if (nome.equalsIgnoreCase("Sair")) {
				break; 
			}

			do {
				System.out.println("Preencha seu sexo com M ou F:\n");
				sexo = scan.nextLine();
				if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {// Esse bloco serve para que o usuário
																					// não tenha a possibilidade de
																					// preencher qualquer valor
																					// diferende de F ou M no campo de
																					// sexo.
					System.out.println("Preencha apenas M ou F para prosseguir");

				}
			} while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));
			Pessoa pessoa = new Pessoa(nome, sexo);
			listaPessoa.add(pessoa);
		}

		for (Pessoa pessoa : listaPessoa) {
			if (pessoa.getSexo().equalsIgnoreCase("M")) {// Verifica se o usuário preencheu o scanner com M, caso sim
															// ele é adicionado a lista de homens.
				listaHomens.add(pessoa);
			} else if (pessoa.getSexo().equalsIgnoreCase("F")) {// Caso tenha sido preenchido F o registro é adicionado
																// na lista de mulheres.
				listaMulheres.add(pessoa);
			}

		}
		Collections.sort(listaHomens); //Ordena a lista de homens e mulheres em ordem alfabética.
		Collections.sort(listaMulheres);
		
		System.out.println("Listagem de homens inseridos:\n" + listaHomens + "Quantidade de homens na lista:\n"
				+ listaHomens.size());
		System.out.println("Listagem de mulheres inseridas:\n" + listaMulheres + "Quantidade de mulheres na lita:\n"
				+ listaMulheres.size());
		System.out.println("Total de Pessoas inseridas:\n" + listaPessoa.size());
		scan.close();

	}

}
