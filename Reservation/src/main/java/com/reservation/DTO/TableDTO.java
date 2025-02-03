package com.reservation.DTO;

import lombok.Data;

@Data
public class TableDTO {
	private int tableId;
	private Integer capacity;
	private Boolean isAvailable;

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public TableDTO() {
	}

	public TableDTO(int tableId, Integer capacity, Boolean isAvailable) {
		this.tableId = tableId;
		this.capacity = capacity;
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "TableDTO{" + "tableId=" + tableId + ", capacity=" + capacity + ", isAvailable=" + isAvailable + '}';
	}
}