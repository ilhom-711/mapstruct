package com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.mapper;


import com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.dto.CommerceDto;
import com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.model.Commerce;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring")
public interface CommerceMapper {

    CommerceMapper INSTANCE= Mappers.getMapper(CommerceMapper.class);


    CommerceDto Dto_Dlya_model(Commerce commerce);

    List<CommerceDto> modelsToDtos(List<Commerce> commerce);

    Commerce Model_Dlya_Dto(CommerceDto commerceDto);

}
