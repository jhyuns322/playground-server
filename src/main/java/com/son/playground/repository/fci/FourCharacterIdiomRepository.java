package com.son.playground.repository.fci;

import com.son.playground.domain.FourCharacterIdiom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FourCharacterIdiomRepository extends JpaRepository<FourCharacterIdiom, String>, CustomFourCharacterIdiomRepository {
}
