package com.gabchak.budget.dao.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "CATEGORY")
public class Category {
  @Id
  private Integer id;
  @Column(name = "name")
  private String name;
}
