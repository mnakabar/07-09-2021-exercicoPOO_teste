package com.company;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static <CalculadorFolha> void main(String[] args) throws IOException {
	Funcionario marta = new Funcionario("Marta", "f",3000.198);
	Funcionario roberto = new Funcionario("Roberto","m",5000.198);
	Funcionario jose = new Funcionario("José","m",5000.198);
    Gerente jenifer = new Gerente("Jenifer", "f",10000);
    Vendedor danilo = new Vendedor("Danilo","m", 8000, 100000 );
   //Diretor danilo = new Diretor();
	Desenvolvedor igor = new Desenvolvedor("Igor", "m", 10000, "pass123","igor@com");
	Cliente cliente = new Cliente("cliente@gmail.com", "87654");


		boolean autenticacaoIgor = igor.autentica("igor@com","pass123");
		boolean autenticacaoCliente = cliente.autentica("cliente@gmail.com", "87654");

		System.out.println("autenticacao do Igr é: " + autenticacaoIgor);
		System.out.println("autenticacao do cliente: " + autenticacaoCliente);

		Funcionario[] array = new Funcionario[6];
		array[0] = roberto;
		array[1] = marta;
		array[2] = jose;
		array[3] = jenifer;
		array[4] = danilo;
		array[5] = igor;


		CalcularFolha folha = new CalcularFolha();
		double total = folha.calcula(array);

		System.out.println("total da folha de pagamento: " + total);



		FileOutputStream fos = new FileOutputStream("funcionarios.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.append(marta.toString());
		bw.newLine();
		bw.append(roberto.toString());
		bw.newLine();
		bw.append(jose.toString());
		bw.newLine();
		bw.append(jenifer.toString());
		bw.newLine();
		bw.append(danilo.toString());
		bw.newLine();
		bw.append(igor.toString());
		bw.newLine();

		bw.close();

		//System.out.println(marta + "\n" + roberto + "\n" + jose);
    }
}
