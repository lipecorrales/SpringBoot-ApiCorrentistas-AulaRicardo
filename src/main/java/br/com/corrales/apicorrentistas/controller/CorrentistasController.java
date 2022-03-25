package br.com.corrales.apicorrentistas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.corrales.apicorrentistas.dao.CorrentistasDao;
import br.com.corrales.apicorrentistas.model.Correntistas;

//@Controller
@RestController
//@RequestMapping("correntistas")
public class CorrentistasController {
    @Autowired
    private CorrentistasDao dao;

   @GetMapping("/correntistas")

    public ArrayList<Correntistas> recuperarTudo(){
        ArrayList<Correntistas>lista;
        lista=(ArrayList<Correntistas>)dao.findAll();
        return lista;
    }
}
