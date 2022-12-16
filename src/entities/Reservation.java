package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
		private Integer roomNumber;
		private Date checkIn;
		private Date checkOut;
		
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		public Reservation() {
		}
		
		public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
			super();
			this.roomNumber = roomNumber;
			this.checkIn = checkIn;
			this.checkOut = checkOut;
		}
		
		
		

		public Integer getRoomNumber() {
			return roomNumber;
		}

		public void setRoomNumber(Integer roomNumber) {
			this.roomNumber = roomNumber;
		}

		public Date getCheckIn() {
			return checkIn;
		}
		
		public Date getCheckOut() {
			return checkOut;
		}

		
		public long duration() {               //CALCULAR A DURAÇÃO EM DIAS COM BASE NAS DIFERENÇASS DAS DUAS DATAS
			long diff = checkOut.getTime() - checkIn.getTime();   // MOSTRA A DATA EM MILISEGUNDOS E DEPOIS CALCULA A DIFERENÇA EM MILISEGUNDOS E SALVA NA VARIAVEL DIFF
			return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);   // CONVERTE MILISEGUNDDOS EM DIAS/DATA
		}
		
		public void updateDates(Date checkIn, Date checkOut) {
			this.checkIn = checkIn;
			this.checkOut = checkOut;
		}
		
		@Override
		public String toString() {
			return "Room "
					+ roomNumber
					+ ", check-in: "
					+ sdf.format(checkIn)
					+ ", check-out: "
					+ sdf.format(checkOut)
					+ ", "
					+ duration()
					+ " nights";
		}	
		
}
