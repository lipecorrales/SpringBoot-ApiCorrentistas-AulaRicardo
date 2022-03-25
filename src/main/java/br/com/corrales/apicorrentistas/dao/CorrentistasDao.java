package br.com.corrales.apicorrentistas.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.corrales.apicorrentistas.model.Correntistas;

public interface CorrentistasDao extends CrudRepository<Correntistas,Integer> {
    
}
