package com.project.lms.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Books")
public class Books {

    @Id
    //for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // auto increment
    Integer bookId;
    String bookName;
    String bookAuthor;
    String bookGenre;
    Integer noOfCopies;

    public void borrowBook() {
        this.noOfCopies--;
        //decrease no of copies when user borrow book
    }

    public void returnBook() {
        this.noOfCopies++;
        //increase no of copies when user return book
    }

}
