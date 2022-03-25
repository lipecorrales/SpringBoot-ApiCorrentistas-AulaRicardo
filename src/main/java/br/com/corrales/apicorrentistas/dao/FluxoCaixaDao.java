package br.com.corrales.apicorrentistas.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.corrales.apicorrentistas.model.FluxoCaixa;

public interface FluxoCaixaDao extends CrudRepository<FluxoCaixa, Integer>{
    
}
