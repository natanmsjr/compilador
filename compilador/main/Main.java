package compilador.main;

import compilador.lexer.*;
import compilador.parser.*;
import compilador.node.*;
//import compilador.analysis.*;

import java.io.*;
	
public class Main
{
    public static void main(String[] arguments) throws Exception, IOException, LexerException
    {
        File arquivo = new File("entrada.txt"); // Instancia o arquivo de entrada
		
		if (!arquivo.exists()) // Verifica se existe o aquivo de entrada
		
			System.out.println("Arquivo nao localizado!");
			
		else{			
			FileReader entrada = new FileReader(arquivo); // Ler o arquivo
			BufferedReader arq = new BufferedReader(entrada);
			String linha;
			System.out.println("Testando a entrada: ");
			
			while((linha = arq.readLine()) != null)
			{				
				MyLexer lexer = new MyLexer(new PushbackReader(entrada));
				Parser parser = new Parser(lexer);
				
				System.out.println(linha);
				try
				{
					Start ast = parser.parse();
					System.out.println("OK.");
				}
				catch(Exception e)
				{
					System.out.println("Token inválido.");
					throw e;
				}
			}
			
			entrada.close();
			arq.close();
			}
	}
}