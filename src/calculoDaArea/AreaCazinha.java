package calculoDaArea;

import java.util.Scanner;

public class AreaCazinha {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		String comodo;
		int largura;
		int comprimento;
		int total;	
		int totalcasa;
		
		System.out.print("Qual o nome do cômodo? ");
		comodo = leitor.next();		
		System.out.print("Qual a largura? ");
		largura = leitor.nextInt();		
		System.out.print("Qual o comprimento? ");
		comprimento = leitor.nextInt();		
		total = (largura*comprimento);
		System.out.println();
		System.out.println("A(o) " + comodo + " tem " + total + " metros.");
		
		
		String resposta  ;
		
		System.out.println();
		System.out.print("Digite S para continuar ou digite N para encerrar: ");	
    	resposta= leitor.next();
		
	  if(resposta.equals("S") || resposta.equals ("s")){
		while (resposta.equals("S") || resposta.equals ("s")) {
			
			System.out.println();
			System.out.print("Qual o nome do cômodo? ");
			comodo = leitor.next();
			
			System.out.print("Qual a largura? ");
			largura = leitor.nextInt();
			
			System.out.print("Qual o comprimento? ");
			comprimento = leitor.nextInt();
			
			total = (largura*comprimento);
			
			System.out.println();
			System.out.println("A(o) " + comodo + " tem " + total + " metros.");
			System.out.println();
			
			System.out.print("Você deseja continuar s/n?");
			resposta= leitor.next();
			System.out.println();
			
			totalcasa = (total+ total);
			
			System.out.println("sua casa tem " + totalcasa + " metros!");
			
		}}else if (resposta.equals("N") || resposta.equals ("n")) {
			
				System.out.println("obrigado!");
			
		}else {
			System.out.println("não corresponde");
		}
	
		}
				
			}
		

		
		
		
		

	


