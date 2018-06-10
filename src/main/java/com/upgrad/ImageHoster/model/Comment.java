package com.upgrad.ImageHoster.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Comment implements Serializable {

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

  // @ManyToOne(fetch = FetchType.LAZY)
   // private Image image;

   // @ManyToOne(fetch = FetchType.LAZY)
    //private User user;

    @Column
    private String text;

    @Column
    private User user;

    public Comment(String comment,User user) {
        this.text = comment;
        this.user=user;
    }

    public Comment() {

    }
    public void setId(int id) {
        this.id = id;

    }

    public void setComment(String comment) {
        this.text = comment;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return text;
    }
}
