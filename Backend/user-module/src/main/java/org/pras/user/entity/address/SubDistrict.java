package org.pras.user.entity.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.pras.user.utils.Constants;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ms_sub_district", schema = Constants.JEWEL_SCHEMA)
public class SubDistrict implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1620641137329724866L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_district_id")
	private long id;
	@Column(name = "sub_district_name")
	private String subDistrictName;
	@Column(name = "sub_district_code", length = 3)
	private String subDistrictCode;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "district_id")
	private District district;

}
