package com.dio.live.model;
import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {

    private long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descripcion;

}
