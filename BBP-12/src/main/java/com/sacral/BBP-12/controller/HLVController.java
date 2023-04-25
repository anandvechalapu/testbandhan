package com.sacral.BBP-12.controller;

import com.sacral.BBP-12.service.HLVSevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HLVController {
    @Autowired
    private HLVSevice hlvSevice;
    
    @GetMapping("/hlv-by-crif")
    public Integer getHLVByCrifScore(@RequestParam int crifScore) {
        return hlvSevice.findHLVByCrifScore(crifScore);
    }
}