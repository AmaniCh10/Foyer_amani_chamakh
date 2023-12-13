package com.example.foyer_amani_chamakh.RestController;

import com.example.foyer_amani_chamakh.DAO.Entities.Bloc;
import com.example.foyer_amani_chamakh.DAO.Entities.Reservation;
import com.example.foyer_amani_chamakh.Services.Bloc.IBlocServices;
import com.example.foyer_amani_chamakh.Services.Reservation.IReservationServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("reservation")
@AllArgsConstructor
public class ReservationRestController {
    IReservationServices iresSer;
    @GetMapping("getallres")
    public List<Reservation> getAll(){
        return iresSer.findallres();

    }
    @PostMapping("addres")
    public Reservation add(@RequestBody Reservation b){
        return iresSer.addRes(b);
    }

    @GetMapping("getresbyid")
    public Reservation getById(@RequestParam String id ){
        return iresSer.findresById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("deleteres")
    public void DELETErESERVATION(@RequestParam Reservation b){
        iresSer.deleteres(b);
        System.out.println("res deleted ");
    }
}
