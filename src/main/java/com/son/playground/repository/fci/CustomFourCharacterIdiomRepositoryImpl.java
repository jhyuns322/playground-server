package com.son.playground.repository.fci;

import com.querydsl.core.types.Projections;
import com.son.playground.domain.FourCharacterIdiom;
import com.son.playground.dto.res.FourCharacterIdiomResDto;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.son.playground.domain.QFourCharacterIdiom.fourCharacterIdiom;


public class CustomFourCharacterIdiomRepositoryImpl extends QuerydslRepositorySupport implements CustomFourCharacterIdiomRepository {
    public CustomFourCharacterIdiomRepositoryImpl() {
        super(FourCharacterIdiom.class);
    }

    @Override
    public List<FourCharacterIdiomResDto> selectAll() {
        return from(fourCharacterIdiom)
                .select(
                        Projections.bean(
                                FourCharacterIdiomResDto.class,
                                fourCharacterIdiom.fciAnswer,
                                fourCharacterIdiom.fciSubAnswer,
                                fourCharacterIdiom.fciQuestion,
                                fourCharacterIdiom.useYn,
                                fourCharacterIdiom.regDt
                        )
                )
                .where(
                        fourCharacterIdiom.useYn.eq("Y")
                )
                .fetch();
    }
}
