package br.com.etechoracio.study.model;

import br.com.etechoracio.study.enums.DiaSemanaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_disponibilidade")

public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISPONIBILIDADE")
    private Long id;

    @Column(name = "TX_DIA_SEMANA")
    private DiaSemanaEnum diaSemana;

    @Column(name = "DT_DAS")
    private LocalTime das;

    @Column(name = "DT_ATE")
    private LocalTime ate;

    @ManyToOne
    @JoinColumn(name = "ID_MONITOR")
    private Monitor monitor;

}
