package kenjigay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  kenjigay1{
	public static Scanner scan = new Scanner(System.in);
	public static List<Livro>livros = new ArrayList<>();
	public static void main(String[] args) {
		escolha();
	}
	
	public static void escolha() {
		
		boolean menu = true;
		
		while(menu) {
			System.out.println("BEM-VINDO A BIBLIOTECA DIGITAL!\nEscolha umas das opções abaixo:\n"
					+"[1]-Adicione um livro\n"
					+"[2]-Escolha um livro\n"
					+"[3]-Busque um livro pelo título\n"
					+"[4]-Remova um livro pelo título\n"
					+"[5]-Sair");
			int escolha1 = scan.nextInt(); 
			scan.nextLine();
			if(escolha1==1) {
				adicionar();
			}else if(escolha1==2) {
				listar();
			}else if(escolha1==3) {
				buscar();
			}else if(escolha1==4) {
				remover();
			}else if(escolha1==5) {
				System.out.println("Saindo.");
				menu = false;
			}else {
				System.out.println("Inválida.");
			}
		}
	}
	
	public static void adicionar() {
		System.out.println("Você escolheu adicionar um livro!\nPor favor preencha as opções abaixo:\n");
		System.out.println("Gênero do livro: ");
		String gen = scan.nextLine();
		System.out.println("Nome do título do livro: ");
		String tit = scan.nextLine();
		System.out.println("Nome do autor do livro: ");
		String autor = scan.nextLine();
		System.out.println("Ano da publicação: ");
		String ano = scan.nextLine();
		Livro livro = new Livro(tit, autor, ano, gen);
	    livros.add(livro);

		System.out.println("Livro adicionado com sucesso!");
	}
	
	public static void listar() {
		System.out.println("Você escolheu a opção listar!");
		if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Lista de livros:");
            for (Livro livro : livros) {
                System.out.println(livro);
                System.out.println("-------------------------");
            }
        }
	}
	
	public static void buscar() {
		System.out.println("Livro que deseja buscar: ");
        String titulo = scan.nextLine();
        boolean encontrado = false;

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado:");
                System.out.println(livro);
                encontrado = true;
               
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
	}
	
	public static void remover() {
		System.out.println("Livro que deseja remover: ");
        String tit = scan.nextLine();
        Livro remover = null;

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tit)) {
                remover = livro;
            }
        }
        
        if (remover != null) {
            livros.remove(remover);
            System.out.println("Removido com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
	}
}
