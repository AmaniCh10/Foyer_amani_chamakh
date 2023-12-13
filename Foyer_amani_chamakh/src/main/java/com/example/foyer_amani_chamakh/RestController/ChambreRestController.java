package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Chambre;
import com.example.foyer_amani_chamakh.Services.Chambre.IChambreServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("chambre")
@AllArgsConstructor
public class ChambreRestController {
    IChambreServices IChamSer;
    @GetMapping("getALLch")
    public List<Chambre> getAll(){
        return IChamSer.findAllChambre();

    }
    @PostMapping("addch")
    public Chambre addBloc(@RequestBody Chambre b){
        return IChamSer.addChambre(b);
    }

    @GetMapping("getchById")
    public Chambre getById(@RequestParam Long id ){
        return IChamSer.findChambrebyId(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("deletech")
    public void deleteChambre(@RequestParam Chambre b){
        IChamSer.deleteChambre(b);
        System.out.println("bloc deleted ");
    }
}
