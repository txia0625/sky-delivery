package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.result.Result;
import com.sky.service.DishService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/dish")
@Api(tags = "Dish Related APIs")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;
    public Result save(@RequestBody DishDTO dishDTO)
    {
        log.info("Newly Added Dish: {}", dishDTO);
        dishService.saveWithFlavor(dishDTO);

        return Result.success();
    }
}
