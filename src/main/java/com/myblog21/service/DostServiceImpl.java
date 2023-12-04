package com.myblog21.service;

import com.myblog21.Entities.Dost;
import com.myblog21.Repository.DostRepository;
import com.myblog21.payload.DostDto;
import org.springframework.stereotype.Service;

@Service
public class DostServiceImpl implements DostService{

    private DostRepository dostRepository;

    public DostServiceImpl(DostRepository dostRepository) {
        this.dostRepository = dostRepository;
    }

    @Override
    public DostDto createDost(DostDto dostDto) {
        Dost dost= mapToEntity(dostDto);
        Dost newDost = dostRepository.save(dost);
        DostDto newDostdto = mapToDto(newDost);
        return newDostdto;
    }

   Dost mapToEntity (DostDto dostDto){
        Dost dost=new Dost();
        dost.setEmail(dostDto.getEmail());
        dost.setNo(dostDto.getNo());
        return dost;
    }
   DostDto mapToDto(Dost dost){
        DostDto dostDto=new DostDto();
        dostDto.setId(dost.getId());
       dostDto.setEmail(dost.getEmail());
       dostDto.setNo(dost.getNo());
        return dostDto;

    }
}
