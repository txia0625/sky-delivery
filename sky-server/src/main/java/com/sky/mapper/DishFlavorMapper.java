package com.sky.mapper;

import com.sky.entity.DishFlavor;

import java.util.List;

public interface DishFlavorMapper {
    void insertBatch(List<DishFlavor> flavors);
}
