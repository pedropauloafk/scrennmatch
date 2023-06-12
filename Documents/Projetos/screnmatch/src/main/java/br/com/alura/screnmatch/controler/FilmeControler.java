package br.com.alura.screnmatch.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")


public class FilmeControler {




    @GetMapping
    public String carregaPaginaFormulario(){



            return "filmes/formulario";


    }





}
