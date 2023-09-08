package com.example.project1.Controller;

import com.example.project1.Model.Boss;
import com.example.project1.Service.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boss")
public class BossController {
    @Autowired
    BossService bossService;

    @PostMapping("/add-boss")
    public ResponseEntity addBoss(@RequestBody Boss boss){
        Boss bos = bossService.addBoss(boss);
        return new ResponseEntity(bos, HttpStatus.CREATED);
    }

    @PutMapping("/update-salaries")
    public ResponseEntity updateSalaries(@RequestParam int salary, @RequestParam float rating){
        bossService.updateSalaries(salary,rating);
        return new ResponseEntity("Salaries update successfully",HttpStatus.OK);
    }
}
