package br.edu.ifal.gerenciador_lembretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/convidados")
public class ConvidadosController {

    @Autowired
    private RepositorioConvidados convidados;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListarConvidados.html");
        mv.addObject("convidados", convidados.findAll());
        mv.addObject(new Convidado());
        return mv;
    }

    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "Redirect:/convidados";
    }
}