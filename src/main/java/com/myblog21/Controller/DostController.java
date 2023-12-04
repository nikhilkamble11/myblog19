package com.myblog21.Controller;

import com.myblog21.payload.DostDto;
import com.myblog21.service.DostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/DostKhan")
public class DostController {


    private DostService dostService;

    public DostController(DostService dostService) {
        this.dostService = dostService;
    }

    //http://localhost:8080/api/DostKhan
    @PostMapping
    public ResponseEntity<DostDto> createDost(@RequestBody DostDto dostDto){
        DostDto dto = dostService.createDost(dostDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }

}
