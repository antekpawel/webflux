package com.example.webflux;

import lombok.*;

/**
 * User: Z6PWA
 * Date: 19.10.2023
 */
@AllArgsConstructor
@Getter
@ToString
public class Book {
  private final String title;
  private final String author;
  private final int year;
}
