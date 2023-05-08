package com.example.springboot.model;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "order_table")
@SequenceGenerator(name = "generator6", sequenceName = "gen", initialValue = 9000)

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator6")
	@Column(name = "order_id")
	private long  orderId;
	
	
	
//	@Column(name="product_id")
//	private long productId;
	
	@Column(name = "mrp_price")
    private double mrpPrice;
	
//	  @Column(name = "price")
//	    private double price;
	
	@Column(name = "quantity")
	private long quantity;
	  
	  @Column(name = "total_price")
	    private double totalPrice;
	  
	  @Column(name = "order_status")
	    private String orderStatus;
	  
	  @Column(name = "payment_status")
	    private String paymentStatus;
	
	@Column(name="ordered_date")
	private Date orderedDate;
	
	@ManyToOne( cascade=CascadeType.MERGE)
	@JoinColumn(name="customer_id")
	@JsonIgnore
    private Customer customer;
	
//	@ManyToOne( cascade=CascadeType.MERGE)
//	@JoinColumn(name="cart_id")
//	@JsonIgnore
//    private Cart cart;
	

		public Order() 
		{
			
		}




		public long getOrderId() {
			return orderId;
		}




		public void setOrderId(long orderId) {
			this.orderId = orderId;
		}




//		public Cart getCart() {
//			return cart;
//		}
//
//
//
//
//		public void setCart(Cart cart) {
//			this.cart = cart;
//		}
//



		public double getMrpPrice() {
			return mrpPrice;
		}




		public void setMrpPrice(double mrpPrice) {
			this.mrpPrice = mrpPrice;
		}




		public long getQuantity() {
			return quantity;
		}




		public void setQuantity(long quantity) {
			this.quantity = quantity;
		}




		public double getTotalPrice() {
			return totalPrice;
		}




		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}




		public String getOrderStatus() {
			return orderStatus;
		}




		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}




		public String getPaymentStatus() {
			return paymentStatus;
		}




		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}



       
		
      




		public Date getOrderedDate() {
			return orderedDate;
		}




		public void setOrderedDate(Date orderedDate) {
			this.orderedDate = orderedDate;
		}




		public Customer getCustomer() {
			return customer;
		}




		public void setCustomer(Customer customer) {
			this.customer = customer;
		}




		@Override
//		public String toString() {
//			return "Order [orderId=" + orderId + ", cart=" + cart + ", mrpPrice=" + mrpPrice + ", quantity=" + quantity
//					+ ", totalPrice=" + totalPrice + ", orderStatus=" + orderStatus + ", paymentStatus=" + paymentStatus
//					+ ", orderedDate=" + orderedDate + ", customer=" + customer + "]";
//		}

		public String toString() {
			return "Order [orderId=" + orderId + ", mrpPrice=" + mrpPrice + ", quantity=" + quantity
					+ ", totalPrice=" + totalPrice + ", orderStatus=" + orderStatus + ", paymentStatus=" + paymentStatus
					+ ", orderedDate=" + orderedDate + ", customer=" + customer + "]";
		}

         

		
		
		
}