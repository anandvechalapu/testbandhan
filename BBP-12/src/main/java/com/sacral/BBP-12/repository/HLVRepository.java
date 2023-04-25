package com.sacral.BBP-12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HLVRepository extends JpaRepository<HLV, Long> {

    @Query(value = "SELECT h.hlv FROM HLV h WHERE h.crifScore = ?1", nativeQuery = true)
    Integer findHLVByCrifScore(int crifScore);

}