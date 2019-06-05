/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author nasse
 */

@ManagedBean (name="dadosTabela")
@RequestScoped
public class DadosTabela implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private static final Order[] orderList = new Order[] {
		
		new Order("A0001", "CPU Intel", 
				new BigDecimal("700.00"), 1),
		new Order("A0002", "HD 1TB", 
				new BigDecimal("300.00"), 2),
		new Order("A0003", "Dell Laptop", 
				new BigDecimal("11600.00"), 8),
		new Order("A0004", "Samsung LCD", 
				new BigDecimal("5200.00"), 3),
		new Order("A0005", "A4Tech Mouse", 
				new BigDecimal("100.00"), 10)
	};
    
    /**
     * Creates a new instance of DadosTabela
     */
    	public Order[] getOrderList() {
 
		return orderList;
 
	}
    public DadosTabela() {
    }
    
    public static class Order {

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }
        String orderNo;
        String productName;
	BigDecimal price;
	int qty;

	public Order(String orderNo, String productName, BigDecimal price, int qty) {
            this.orderNo = orderNo;
            this.productName = productName;
            this.price = price;
            this.qty = qty;
	}
    }
    
}
