package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Etudi;
import com.example.foyer_amani_chamakh.Services.Bloc.IBlocServices;
import com.example.foyer_amani_chamakh.Services.Etudiant.IEtudiantServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("etudiant")
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantServices etudSer;
    @GetMapping("getALLET")
    public List<Etudi> getAll(){
        return etudSer.findAllEt();

    }
    @PostMapping("ADDet")
    public Etudi addBloc(@RequestBody Etudi b){
        return etudSer.addEt(b);
    }

    @GetMapping("getETById")
    public Etudi getById(@RequestParam Long id ){
        return etudSer.findEtById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("deleteETTT")
    public void deleteBloc(@RequestParam Etudi b){
        etudSer.deleteEt(b);
        System.out.println("bloc deleted ");
    }
}
