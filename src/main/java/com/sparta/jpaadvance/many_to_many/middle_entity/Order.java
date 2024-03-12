//package com.sparta.jpaadvance.many_to_many.middle_entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "orders")
//public class Order {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//
//  @ManyToOne
//  @JoinColumn(name = "food_id")
//  private Food food;
//
//  @ManyToOne
//  @JoinColumn(name = "user_id")
//  private User user;
//}
//
///*
//주문일 추가할 때 사용
//package com.sparta.jpaadvance.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "orders")
//@EntityListeners(AuditingEntityListener.class)
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "food_id")
//    private Food food;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @CreatedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime orderDate;
//}
// */
