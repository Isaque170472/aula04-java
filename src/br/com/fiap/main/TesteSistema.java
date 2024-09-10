package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

    public static void main(String[] args) {

        // Instanciar objetos
        Produto objProduto = new Produto();
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();

        objCliente.setNome("Isaque Dias");
        objCliente.setIdade(19);
        objCliente.setAltura(1.87);

        objEndereco.setLogradouro("Rua Pinto Leite");
        objEndereco.setCep("537785679-39");
        objEndereco.setBairro("Cidade Pinto Souza");

        objCliente.setEndereco(objEndereco);

        // Saidas
        System.out.println(
                "Nome: " + objCliente.getNome() +
                        "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                        "\nCEP: " + objCliente.getEndereco().getCep() +
                "\nBairro: " + objCliente.getEndereco().getBairro()
        );

    }
}
