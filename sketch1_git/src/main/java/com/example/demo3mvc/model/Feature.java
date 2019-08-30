package com.example.demo3mvc.model;

import java.util.Set;

import lombok.Data;

@Data
public class Feature {
	
	private String id;
	
	private String title;
	
	private String description;
	
	private Set<String> assets;
	
}
