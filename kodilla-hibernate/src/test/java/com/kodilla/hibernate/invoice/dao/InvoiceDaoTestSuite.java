package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("017/10/2023");

        Product bread = new Product("bread");
        Product butter = new Product("butter");

        Item itemBread = new Item(bread, new BigDecimal(5), 2);
        Item itemButter = new Item(butter, new BigDecimal(9), 1);

        itemBread.setInvoice(invoice);
        itemButter.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemBread);
        items.add(itemButter);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
        assertEquals(invoiceId, invoiceReadFromDB.getId());
        assertEquals(2, itemSize);
        assertEquals(itemSize, invoiceReadFromDB.getItems().size());
    }
}