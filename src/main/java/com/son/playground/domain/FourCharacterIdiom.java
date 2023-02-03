package com.son.playground.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "tb_four_chrctr_idm")
@NoArgsConstructor
public class FourCharacterIdiom {
    @Id
    @Column(name = "FCI_ANSWER")
    private String fciAnswer;
    @Column(name = "FCI_SUB_ANSWER")
    private String fciSubAnswer;
    @Column(name = "FCI_QUESTION")
    private String fciQuestion;
    @Column(name = "USE_YN")
    private String useYn;
    @Column(name = "REG_DT")
    private LocalDateTime regDt;
}
