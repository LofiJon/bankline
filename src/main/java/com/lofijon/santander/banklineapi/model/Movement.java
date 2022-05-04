package com.lofijon.santander.banklineapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movement")
public class Movement extends AbstractModel {

    private LocalDateTime dateHour;
    private String description;
    private Double value;
    private MovementTypeEnum movementTypeEnum;

}
