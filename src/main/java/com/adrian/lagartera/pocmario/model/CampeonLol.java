package com.adrian.lagartera.pocmario.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "campeon")
public class CampeonLol {

  @Id private Long id;

  private String nombre;

  private String rol;

  private String tipo;

  private String descripcion;

  private String imagen;
}
