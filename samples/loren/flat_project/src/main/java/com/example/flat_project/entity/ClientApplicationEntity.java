package com.example.flat_project.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "client_info")
public class ClientApplicationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nick_name")
	private String nickName;
	private String email;
	private String password;
}
