package com.invasionofsmallcubes.beecoolbo

import javax.persistence.*

@Entity
@SequenceGenerator(name="my_seq", sequenceName="user_id_seq")
@Table(name = "employees")
data class Employee (@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq") val id: Long? = null,
                     val name: String = "defConstructorHell")