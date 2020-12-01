package com.tenq.base.service;

import com.tenq.base.pojo.Label;

import java.util.List;

public interface LabelService {
    List<Label> findAll();
    Label findById(Long id);
    void save(Label label);
    void update(Label label);
    void delete(Long id);
}
