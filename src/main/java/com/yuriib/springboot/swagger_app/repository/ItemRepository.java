package com.yuriib.springboot.swagger_app.repository;

import com.yuriib.springboot.swagger_app.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
