package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {

        private long idBancoHoras;

        private long idMovimentacao;

        private long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;

    private LocalDateTime dataTrabalhadas;

    private BigDecimal quantidadeHoras;

    private BigDecimal saldoHoras;
}
