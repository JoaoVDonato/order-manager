package br.com.donato.pedidolancamento.core.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String email;
    private Permissao permissao;
}
