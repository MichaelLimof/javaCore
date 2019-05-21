package classes.aula.intro.testes;

import classes.aula.MensagemClass;

public class MensagemTest {
	public static void main(String[] args) {
		
		MensagemClass mensagemFinal = new MensagemClass();
		
		mensagemFinal.palavraUm = "Esta é";
		mensagemFinal.palavraDois = "uma mensagem";
		mensagemFinal.palavraTres = "escrita";
		mensagemFinal.palavraQuatro ="atraves de uma classe!" ;
		
		System.out.println(mensagemFinal.palavraUm);
		System.out.println(mensagemFinal.palavraDois);
		System.out.println(mensagemFinal.palavraTres);
		System.out.println(mensagemFinal.palavraQuatro);
		
	}

}
