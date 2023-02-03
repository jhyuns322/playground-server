package com.son.playground.repository.fci;

import com.son.playground.dto.res.FourCharacterIdiomResDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomFourCharacterIdiomRepository {
    List<FourCharacterIdiomResDto> selectAll();
}
