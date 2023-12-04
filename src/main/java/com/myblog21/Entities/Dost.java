package com.myblog21.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;

import javax.persistence.*;
import java.security.SecureRandom;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DostKhan",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Data
public class Dost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "no", nullable = false)
    private String no;


}
