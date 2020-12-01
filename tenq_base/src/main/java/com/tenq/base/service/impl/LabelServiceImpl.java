package com.tenq.base.service.impl;

import com.tenq.base.mapper.LabelMapper;
import com.tenq.base.pojo.Label;
import com.tenq.base.service.LabelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@Transactional
public class LabelServiceImpl implements LabelService {
    @Autowired
    private LabelMapper labelMapper;

    public List<Label> findAll(){
        List<Label> labels = labelMapper.selectList(null);
        System.out.println(labels);
        return labels;
    }

    public Label findById(Long id){
        Label label = labelMapper.selectById(id);
        return label;
    }

    public void save(Label label){
        int insert = labelMapper.insert(label);
        log.info("LabelSave返回值:{}",insert);
    }
    public void update(Label label){
        int i = labelMapper.updateById(label);
        log.info("Labelupdate返回值:{}",i);
    }

    public void delete(Long id){
        int i = labelMapper.deleteById(id);
        log.info("Labeldelete返回值:{}",i);
    }
}
