package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class Cargo extends EntidadeAbstrata<Long> {
    @Column(nullable = false, length = 200)
    private String descricao;
}
