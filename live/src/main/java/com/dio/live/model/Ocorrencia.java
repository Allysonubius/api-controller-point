package com.dio.live.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Ocorrencia {

    private long id;

    private String nameOcorrencia;

    private String descriptionOcorrencia;
}
