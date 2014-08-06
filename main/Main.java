package main;

import java.io.*;

import compilador.lexer.*;
import compilador.parser.*;
import compilador.node.*;
import compilador.analysis.*;
	
public class Main
{
	public static void main(String[] args) throws ParserException, LexerException, IOException
    {		
		System.out.println("Iniciando testes... \n");
		System.out.println("Opção 1 - Leitura de arquivos específicos por argumento: \n");
		if (args.length > 0){ // Verifica se existe os aquivos como argumentos de entrada
			leitorArgumentos(args); //ler arquivos de testes por argumentos a pedido do professor
		}
		else{
			if(args.length <= 0)
				System.out.println("\t Não foi passado nenhum arquivo. \n");
			System.out.println("Opção 2 - Leitura de arquivos armazenados no diretório './testes': \n");
			leitorDiretorio("./testes"); //ler arquivos de teste através do diretório
		}
	}
	
	public static void leitorArgumentos(String[] args) throws ParserException, LexerException, IOException
	{
		Reader entrada = null;
		for (int i = 0; i < args.length; i++) {
			System.out.println("\t Testando o arquivo de entrada - "+args[i]+"\n");
			entrada = new FileReader(args[i]); // Instancia o arquivo de entrada			
			MyLexer lexer = new MyLexer(new PushbackReader(entrada, 1024)); // Instancia o lex
			Parser parser = new Parser(lexer); // Instancia o parse
			Start teste = parser.parse(); //inicia a passada do parse
			System.out.println("\t Fim de teste! OK. \n");
		}
		entrada.close();
	}
	
	public static void leitorDiretorio (String testes) throws ParserException, LexerException, IOException
	{
		String diretorio = testes;
		File arquivo = new File(diretorio);
		String[] arquivos = arquivo.list();
		if(arquivos == null)
			System.out.println("\t Não há arquivos nesse diretório. \n");
		else{
			Reader entrada = null;
			for (int i = 0; i < arquivos.length; i++) {
				System.out.println("\t Testando o arquivo de entrada - "+arquivos[i]+"\n");
				entrada = new FileReader(diretorio+"/"+arquivos[i]); // Instancia o arquivo de entrada
				MyLexer lexer = new MyLexer(new PushbackReader(entrada, 1024)); // Instancia o lex
				Parser parser = new Parser(lexer); // Instancia o parse
				Start teste = parser.parse(); //inicia a passada do parse
				System.out.println("\t Fim de teste! OK. \n");
			}
			entrada.close();
		}		
	}
}