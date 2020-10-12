package org.opendevup;

import org.opendevup.dao.EtudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@SpringBootApplication
public class TpSpringMvcApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx=SpringApplication.run(TpSpringMvcApplication.class, args);
        EtudiantRepository etudiantRepository=
                ctx.getBean(EtudiantRepository.class);
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");

        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));

        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));
        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));
        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));
        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));
        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));

        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));

        etudiantRepository. save(
                new Etudiant("Laura", df.parse("2000-06-02"),
                        "laura@gmail.com", "laura.jpg"));

        etudiantRepository. save(
                new Etudiant("Martin", df.parse("2000-07-02"),
                        "martin@gmail.com", "martin.jpg"));
        etudiantRepository. save(
                new Etudiant("tatiana", df.parse("1997-07-02"),
                        "tatiana@gmail.com", "tatiana.jpg"));



        //Page<Etudiant> etds= etudiantRepository.findAll(PageRequest.of(0,5));
       Page<Etudiant> etds= etudiantRepository.chercherEtudiants( "%T%",PageRequest.of(0,5));
etds.forEach(e->System.out.println(e.getNom()));
	}

}
