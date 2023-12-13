package com.example.foyer_amani_chamakh.DAO.Repository;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    //recherche par om bloc
    Bloc getByNomBloc(String nomBloc);
    //recherche par capacité
    Bloc  findBlocByCapaciteBloc(int cap);

    //select * from bloc where nombloc= and capacity=
    Bloc getByNomBlocAndCapaciteBloc(String nomBloc , int capaciteBloc);

    Bloc getByNomblocContainingIgnoreCase(String nomBloc);

    // recherche pa capacité> a une valeur

    Bloc getByCapaciteBlocGreaterThan(int mincap);

    List<Bloc> getOrOrderByNombloc();
    Bloc getByNomBlocOrCapaciteBloc(String nomBloc , int capaciteBloc);
    Bloc findBlocByFIdFoyer(int idFoyer);
    Bloc findBlocByFUniv(int idUniversity);


}
