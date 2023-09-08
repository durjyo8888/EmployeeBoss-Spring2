package com.example.project1.Repository;

import com.example.project1.Model.Boss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BossRepository extends JpaRepository<Boss,Integer> {
}
