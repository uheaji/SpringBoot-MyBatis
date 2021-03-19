package com.cos.mybatisex01.model.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PanmaeBean {

	private int id; // Panmae
	private String username;
	private String name; // Product
	private String code;
}
