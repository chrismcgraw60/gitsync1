package com.example.demo3mvc;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3mvc.model.Feature;

@RestController
public class FeatureController {

	
    @GetMapping("/feature/{id}")
    public Feature feature(@PathVariable String id) {
    	
    	Feature f1 = new Feature();
    	
    	f1.setId(id);
    	f1.setTitle("T_"+id);
    	f1.setDescription("D_"+id);
    	
    	Set<String> assets = new HashSet<>(); 
    	assets.add("aaa");
    	assets.add("bbb");
    	assets.add("ccc");
    	
    	
    	f1.setAssets(assets);
    	
        return f1;
    }
    
}
