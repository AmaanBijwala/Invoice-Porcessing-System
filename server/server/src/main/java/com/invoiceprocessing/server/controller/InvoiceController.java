package com.invoiceprocessing.server.controller;

import com.invoiceprocessing.server.model.Invoice;
import com.invoiceprocessing.server.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @PostMapping("/invoice")
    public Invoice addInvoice(@RequestBody Invoice invoice){
        return invoiceService.addInvoice(invoice);
    }
    @GetMapping("/invoice")
    public List<Invoice> getAllInvoices(){
        return invoiceService.getAllInvoices();
    }
    @DeleteMapping("/invoice/{id}")
    public Invoice deleteInvoice(@PathVariable long id){
        return invoiceService.deleteInvoice(id);
    }

}
