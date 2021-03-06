package es.fantasymanager.parser.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "NEWS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NEWS_ID")
	private Integer newsId;

	@Column(name = "TITLE", length = 500)
	private String title;

	@Column(name = "SUMMARY", length = 1000)
	private String summary;

	@Column(name = "DATE_TIME")
	private LocalDateTime dateTime;

}