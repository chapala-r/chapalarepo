package com.flat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flat.entity.Flat;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Long> {

}
