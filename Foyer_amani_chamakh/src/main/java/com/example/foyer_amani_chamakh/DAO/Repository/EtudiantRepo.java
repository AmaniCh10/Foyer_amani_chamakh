package com.example.foyer_amani_chamakh.DAO.Repository;

import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepo extends JpaRepository<Etudi,Long> {

    Etudi findByCin(long cin);
    Etudi findByNometLike(String nom);

    Etudi findByNometContaining(String nom);
    Etudi findByNometContains(String nom);
    int countEtudiByCin(Long cin);
}
