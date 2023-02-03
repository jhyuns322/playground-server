package com.son.playground.service.impl;

import com.son.playground.dto.res.FourCharacterIdiomResDto;
import com.son.playground.repository.fci.FourCharacterIdiomRepository;
import com.son.playground.service.FourCharacterIdiomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FourCharacterIdiomServiceImpl implements FourCharacterIdiomService {

    private final FourCharacterIdiomRepository fourCharacterIdiomRepository;
    @Override
    public List<FourCharacterIdiomResDto> getFourCharacterIdioms() {
        return fourCharacterIdiomRepository.selectAll();
    }
}
