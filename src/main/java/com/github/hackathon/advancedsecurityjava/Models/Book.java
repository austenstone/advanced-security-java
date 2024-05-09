package com.github.hackathon.advancedsecurityjava.Models;

public class Book {
    public String name;
    public String author;
    public String genre;
  
    public Boolean read = false;
  
    public Book(String name, String author, String genre) {
      this.name = name;
      this.author = author;
      this.genre = genre;
    }
  
    public Book(String name, String author, String genre, Boolean read) {
      this.name = name;
      this.author = author;
      this.genre = genre;
      this.read = read;
    }
  }
