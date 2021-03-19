package com.cos.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cos.mybatisex01.model.Panmae;
import com.cos.mybatisex01.model.Product;
import com.cos.mybatisex01.model.beans.PanmaeBean;

@Mapper
public interface PanmaeRepository {

	public PanmaeBean findByIdAndJoin(int id);

}
