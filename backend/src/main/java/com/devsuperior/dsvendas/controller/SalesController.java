package com.devsuperior.dsvendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SalesController {
	@Autowired
	private SaleService SaleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> SaleDTOs = SaleService.findAll(pageable);
		return ResponseEntity.ok(SaleDTOs);
	}
}