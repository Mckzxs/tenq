package com.tenq.base.controller;

import com.tenq.base.pojo.Label;
import com.tenq.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
    @Autowired
   private LabelService labelService;
    @GetMapping
    public Result findAll() {
        List<Label> labelAll = labelService.findAll();
        return new Result(true, StatusCode.OK, "查询成功",labelAll);
    }

    @GetMapping(value = "/{labelId}")
    public Result findById(@PathVariable("labelId") String labelId) {
        Long id = Long.valueOf(labelId);
        return new Result(true, StatusCode.OK, "查询成功",labelService.findById(id));
    }

    @PostMapping
    public Result save(@RequestBody Label label) {
        labelService.save(label);
        return new Result(true, StatusCode.OK, "保存成功");
    }

    @PutMapping("/{labelId}")
    public Result update(@PathVariable("labelId") String labelId, @RequestBody Label label) {
        label.setId(Long.valueOf(labelId));
        labelService.update(label);
        return new Result(true, StatusCode.OK, "更新成功");
    }

    @DeleteMapping("/{labelId}")
    public Result deteById(@PathVariable("labelId") String labelId) {
        labelService.delete(Long.valueOf(labelId));
        return new Result(true, StatusCode.OK, "删除成功");
    }
}
