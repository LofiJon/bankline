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
@Table(name="account_holder")
public class AccountHolder extends AbstractModel {

    private String cpf;

    private String name;
}
