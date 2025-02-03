package com.reservation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalExceptionHandler {
	public ResponseEntity<String> handleReservationNotFound(ReservationNotFound e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}

	public ResponseEntity<String> handleInvalidReservationTime(InvalidReservationTime e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}

}
