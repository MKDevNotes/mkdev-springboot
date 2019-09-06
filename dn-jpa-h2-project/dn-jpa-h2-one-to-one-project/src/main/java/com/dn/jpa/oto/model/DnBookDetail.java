package com.dn.jpa.oto.model;

import javax.persistence.*;

@Entity
@Table(name = "bookdetail", catalog = "dn")
public class DnBookDetail{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "detail_id")
    private Integer id;

    @Column(name = "price")
    private String price;

    @Column(name = "format")
    private String format;

    @Column(name = "number_of_purchase")
    private String noOfPurchase;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private DnBook dnBook;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getNoOfPurchase() {
		return noOfPurchase;
	}

	public void setNoOfPurchase(String noOfPurchase) {
		this.noOfPurchase = noOfPurchase;
	}

	public DnBook getDnBook() {
		return dnBook;
	}

	public void setDnBook(DnBook dnBook) {
		this.dnBook = dnBook;
	}
}