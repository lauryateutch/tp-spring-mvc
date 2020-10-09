package org.opendevup.dao;

import org.opendevup.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

     public List<Etudiant> findByNom(String nom);
    public Page<Etudiant> findByNom(String nom, Pageable pageable);

   @Query("select e from Etudiant e where e.nom like : x")
   public Page<Etudiant> chercherEtudiants(@Param("x") String nom);

    @Query("select e from Etudiant e where e.dateNaissance>:x and e.dateNaissance< :y")
    public List<Etudiant> chercherEtudiants(@Param("x") Date d1, @Param("y") Date d2);
}
