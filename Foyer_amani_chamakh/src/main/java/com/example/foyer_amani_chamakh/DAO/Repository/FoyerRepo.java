package com.example.foyer_amani_chamakh.DAO.Repository;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Foyer;
import com.example.foyer_amani_chamakh.DAO.Entities.TypeChambre;
import com.example.foyer_amani_chamakh.DAO.Entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepo extends JpaRepository<Foyer,Long> {

    List<Foyer> findFoyerByCapacitFoyerGreaterThan(int cap);
    List<Foyer> findFoyerByCapacitFoyerLessThan(int cap);
    List<Foyer> findFoyerByCapacitFoyerBetween(int min,int max);

   Foyer findByUnivNomUniversity(String nom);

   List<Foyer> getByBloclistChambreTypeC(TypeChambre typeChambre);



}
