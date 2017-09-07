package com.invasionofsmallcubes.beecoolbo

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "employees")
data class Employee (@Id val id: Long? = null, val name: String)