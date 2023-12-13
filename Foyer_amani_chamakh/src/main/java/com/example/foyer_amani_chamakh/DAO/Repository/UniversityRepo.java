package com.example.foyer_amani_chamakh.DAO.Repository;

import com.example.foyer_amani_chamakh.DAO.Entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface UniversityRepo extends JpaRepository<University,Long> {

    // 1- Afficher la liste des universités qui ont des étudiants dont leurs noms contiennent
    // la chaîne de caractères en paramètre et leurs dates de naissance entre deux dates passées en paramètre
    List<University> findByFoyerEtudiantsNomEtContainsAndFoyerEtudiantsDateNaissanceBetween(
            String nomEtudiant, Date dateDebut, Date dateFin);
}
