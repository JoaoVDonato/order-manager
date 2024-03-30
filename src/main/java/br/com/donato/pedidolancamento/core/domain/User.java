package br.com.donato.pedidolancamento.core.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String login;
    private String senha;
    private Permissao permissao;

}
