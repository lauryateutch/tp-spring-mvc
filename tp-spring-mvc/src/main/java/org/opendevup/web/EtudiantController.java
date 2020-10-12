package org.opendevup.web;

import org.opendevup.dao.EtudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value="/Etudiant")
// il faudra toujours mettre Etudiant avt de mettre la méthode du controller
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @RequestMapping(value ="/Index")

    public String Index(Model model,@RequestParam(name="page",defaultValue = "0") int page,
                        @RequestParam(name="motCle",defaultValue = "") String mc){
        //les objets de la liste seront stockés dans l'objet model
        Page<Etudiant> pageEtudiants=etudiantRepository.chercherEtudiants("%"+mc+"%",PageRequest.of(page,7));
        model.addAttribute("pageEtudiants", pageEtudiants);//on ajoute l'attrbut etudiants à notre model ou sera stocké notre liste
        int pagesCount=pageEtudiants.getTotalPages();
        int []pages= new int[pagesCount];
        for(int i=0;i<pagesCount;i++)pages [i]=i;
        model.addAttribute("pages", pages);
        model.addAttribute("motCle", mc);
        model.addAttribute("pageCourante",page);
        return "etudiants";
    }

}
