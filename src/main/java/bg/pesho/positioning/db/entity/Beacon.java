package bg.pesho.positioning.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "beacons")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Beacon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "major_id")
	private Integer majorId;
	
	@Column(name = "minor_id")
	private Integer minorId;

	@Column(name = "uuid")
	private String uuid;
	
	@Column(name = "display_name")
	private String displayName;
	
	@Column(name = "lng")
	private Double longitude;
	
	@Column(name = "ltd")
	private Double latitude;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "room_id")
	private Room room;
}
