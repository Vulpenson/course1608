package com.example.course1608.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String roomId;

    @NotNull
    Integer counter = 0;

    @NotNull
    String word;

    @NotNull
    String hiddenWord;

    @PostLoad
    public void handleNull() {
        if(counter == null) {
            counter = 0;
        }
    }
}
