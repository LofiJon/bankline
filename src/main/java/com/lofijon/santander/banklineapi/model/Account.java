package com.lofijon.santander.banklineapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="account")
public class Account extends AbstractModel {
    private Long number;
    private Double balance;
}
