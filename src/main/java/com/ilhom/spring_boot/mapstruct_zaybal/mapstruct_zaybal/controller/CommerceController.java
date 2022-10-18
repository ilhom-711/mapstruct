package com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.controller;


import com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.dto.CommerceDto;
import com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.mapper.CommerceMapper;
import com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.model.Commerce;
import com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.repository.CommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommerceController {

    @Autowired
    private CommerceMapper commerceMapper;
    @Autowired
    private CommerceRepository commerceRepository;

    @PostMapping("/commerce")
    public ResponseEntity<Commerce> save(@RequestBody CommerceDto commerceDto){

        return new ResponseEntity<>(commerceRepository.save(commerceMapper.Model_Dlya_Dto(commerceDto)), HttpStatus.CREATED);
    }


    @GetMapping("/commerce")
    public ResponseEntity<List<CommerceDto>> findAll(){

        return new ResponseEntity<>(commerceMapper.modelsToDtos(commerceRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("/commerce/{id}")
    public ResponseEntity<CommerceDto> findById(@PathVariable(value = "id") Integer id){

        return new ResponseEntity<>(commerceMapper.Dto_Dlya_model(commerceRepository.findById(id).get()),HttpStatus.OK);
    }

    @DeleteMapping("/commerce/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") Integer id){
        CommerceDto commerceDto= commerceMapper.Dto_Dlya_model(commerceRepository.findById(id).get());
        commerceRepository.deleteById(commerceDto.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
