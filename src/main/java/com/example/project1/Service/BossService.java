package com.example.project1.Service;

import com.example.project1.Model.Boss;
import com.example.project1.Repository.BossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BossService {
    @Autowired
    BossRepository bossRepository;
    public Boss addBoss(Boss boss) {
        return bossRepository.save(boss);
    }

    public void updateSalaries(int salary, float rating) {
        List<Boss> bossList = bossRepository.findAll();
        for(Boss currBoss : bossList){
            if(currBoss.getRating() > rating){
                currBoss.setSalary(salary);
            }
        }
    }
}
