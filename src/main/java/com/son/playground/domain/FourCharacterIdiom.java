package com.son.playground.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "tb_four_chrctr_idm")
@NoArgsConstructor
public class FourCharacterIdiom {
    @Id
    @Column(name = "FCI_ANSWER_KO")
    private String fciAnswerKo;
    @Column(name = "FCI_ANSWER_CN")
    private String fciAnswerCn;
    @Column(name = "FCI_SUB_ANSWERS")
    private String fciSubAnswers;
    @Column(name = "FCI_QUESTION")
    private String fciQuestion;
    @Column(name = "FCI_LEVEL")
    private String fciLevel;
    @Column(name = "USE_YN")
    private String useYn;
    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime regDt;
}
