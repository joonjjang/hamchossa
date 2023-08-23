package com.example.hamchossa.repository;// Hamburger.java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // 이 어노테이션으로 이 클래스를 JPA 엔터니로 선언합니다.
public class Hamburger {

    @Id // 이 필드를 데이터베이스 테이블의 기본 키(primary key)로 지정합니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 값 생성 전략을 지정합니다.
    private Long id;

    private String name; // 햄버거 이름
    private String description;  // 햄버거 설명

    // getter 와 setter 메서드는 생략되었습니다...
}
