package com.glaucus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glaucus.model.Number_Table;
/*
For Storing and updating the data to the Databse we have extended JpaRepository below.
*/
public interface Number_Repository extends JpaRepository<Number_Table, Integer> {

}
