package com.example.foyer_amani_chamakh.DAO.Repository;

import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;
import com.example.foyer_amani_chamakh.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ReservationRepo extends JpaRepository<Reservation,String> {

    Etudi findByCin(long cin);

    List<Reservation> findAll();

    List<Etudi> findByNomELike();
    List<Etudi> findByNomEContains();
    List<Etudi> findByNomEContaining();

    Etudi findByNomEAndprenomE(String nom,String prenom);
    Etudi findBycin(long cin);

    List<Etudi> findByNaissanceGreaterThan(LocalDate date);

    List<Etudi> findByecole(String nomEcole);

    List<Etudi> findByReservationsIdReservation(long id);

    //6- Recherche des étudiants par réservation (année de réservation)
    List<Etudi>findByReservationsAnneUniversitaire(Date anne);

    List<Etudi> findByNaissanceGreaterThanAndecole(LocalDate date, String nomEcole);

    List<Etudi> findByReservationsAnneUniversitaireOrderByNaissance(Date anne);
}
