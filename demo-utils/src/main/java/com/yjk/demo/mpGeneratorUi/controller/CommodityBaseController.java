package com.yjk.demo.mpGeneratorUi.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.yjk.demo.mpGeneratorUi.service.CommodityBaseService;
import com.yjk.demo.mpGeneratorUi.entity.CommodityBase;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 基础物料 前端控制器
 * </p>
 *
 * @author yjk
 * @since 2023-03-17
 */
@Api("mp测试")
@RestController
@RequestMapping("/commodityBase")
public class CommodityBaseController {


    @Autowired
    private CommodityBaseService commodityBaseService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<CommodityBase>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<CommodityBase> aPage = commodityBaseService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CommodityBase> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(commodityBaseService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody CommodityBase params) {
        commodityBaseService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        commodityBaseService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> delete(@RequestBody CommodityBase params) {
        commodityBaseService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
