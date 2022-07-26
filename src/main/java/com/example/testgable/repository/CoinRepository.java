package com.example.testgable.repository;

import com.example.testgable.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinRepository extends JpaRepository<Coin, String> {
//    List<Coin> findAllByMarketCapRank(int min, int max);
}
