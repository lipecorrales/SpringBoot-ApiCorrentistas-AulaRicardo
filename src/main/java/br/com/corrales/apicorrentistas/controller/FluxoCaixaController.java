package br.com.corrales.apicorrentistas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.corrales.apicorrentistas.dao.FluxoCaixaDao;
import br.com.corrales.apicorrentistas.model.FluxoCaixa;

@RestController
public class FluxoCaixaController {
    @Autowired // Permite com que a interface seja executada com os proecessos CRUD
	private FluxoCaixaDao dao;
	
	@GetMapping("/fluxo") // Permite indicar o nome da página que vocêdeverá executar no endereço da sua URL

	// Criando um método de leitura de dados da nossa tabela 
	public ArrayList<FluxoCaixa> recuperarTudo(){
		ArrayList<FluxoCaixa> lista;
		lista=(ArrayList<FluxoCaixa>)dao.findAll();
		return lista;
	}
}
