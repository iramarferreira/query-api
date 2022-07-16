package br.ufrn.lii.genericapi.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@Data
public class SomeOther {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    private int someInt;

    public SomeOther() {
    }

}
