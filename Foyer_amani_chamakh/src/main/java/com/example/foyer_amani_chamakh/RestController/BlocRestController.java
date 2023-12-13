package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.Services.Bloc.IBlocServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bloc")
@AllArgsConstructor
public class BlocRestController {
    IBlocServices iblocSer;
    @GetMapping("getALLbb")
    public List<Bloc> getAll(){
        return iblocSer.findAllBlocs();

    }
    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return iblocSer.addBloc(b);
    }

    @GetMapping("getblocById")
    public Bloc getById(@RequestParam Long id ){
        return iblocSer.findBlocById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("deleteblooc")
    public void deleteBloc(@RequestParam Bloc b){
        iblocSer.deleteBloc(b);
        System.out.println("bloc deleted ");
    }

}
