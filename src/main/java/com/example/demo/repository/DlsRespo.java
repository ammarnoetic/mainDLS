package com.example.demo.repository;

import com.example.demo.model.RouteMcg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DlsRespo extends JpaRepository<RouteMcg,Integer> {


}
