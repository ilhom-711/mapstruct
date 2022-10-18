package com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.repository;


import com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.model.Commerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommerceRepository extends JpaRepository<Commerce, Integer> {

}
