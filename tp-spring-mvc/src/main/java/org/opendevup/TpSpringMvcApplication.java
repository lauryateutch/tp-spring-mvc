package org.opendevup;

import org.opendevup.dao.EtudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

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
                        "martin@gmail.com", "martin.jpg"));	}

}
