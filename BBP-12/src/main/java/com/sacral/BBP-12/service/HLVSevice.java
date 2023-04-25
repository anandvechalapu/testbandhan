package com.sacral.BBP-12.service;

import com.sacral.BBP-12.repository.HLVRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HLVSevice {
    @Autowired
    private HLVRepository hlvRepository;

    public Integer findHLVByCrifScore(int crifScore) {
        return hlvRepository.findHLVByCrifScore(crifScore);
    }
}