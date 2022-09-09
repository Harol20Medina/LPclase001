package upeu.edu.pe.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.clase01.entity.Invoices;
import upeu.edu.upeu.clase01.entity.Customers;
import upeu.edu.upeu.clase01.service.CustomersService;
import upeu.edu.pe.clase01.service.InvoicesService;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {
	@Autowired
	private InvoicesService invoicesService;
	@Autowired
	private CustomersService customersService;

	@GetMapping("/invoices")
	public List<Invoices> all(){
		return invoicesService.readAll();

	
	@GetMapping("/customers")
	public List<Customers> getListCustomers(){
		return customersService.readAll();
	}
}
