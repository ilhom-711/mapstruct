package com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class CommerceDto {
    @Id
    @JsonProperty("id")
    int id;
    @JsonProperty("name")

    String name;
    @JsonProperty("surname")
    String surname;
    @JsonProperty("department")
    String department;
    @JsonProperty("salary")
    int salary;
}
