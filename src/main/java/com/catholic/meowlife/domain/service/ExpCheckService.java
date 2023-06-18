package com.catholic.meowlife.domain.service;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.stereotype.Component;

@Component
public class ExpCheckService {

    public boolean isExpReached100(CatDTO catDTO){
        if(catDTO.getExp() >= 100){
            return true;
        }
        return false;
    }



}