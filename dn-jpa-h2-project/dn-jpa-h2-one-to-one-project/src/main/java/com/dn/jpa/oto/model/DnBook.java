package com.dn.jpa.oto.model;

import javax.persistence.*;

@Entity
@Table(name = "books", catalog = "dn")
public class DnBook{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_desc")
    private String bookDesc;

    @Column(name = "autor")
    private String author;

    @Column(name = "no_of_pages")
    private Integer noOfPages;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "book")
    private DnBookDetail bookDetail;

    public DnBook(String bookName,String bookDesc,String author,Integer noOfPages){
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.author = author;
        this.noOfPages = noOfPages;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(Integer noOfPages) {
		this.noOfPages = noOfPages;
	}

    public DnBookDetail getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(DnBookDetail bookDetail) {
		this.bookDetail = bookDetail;
	}

}