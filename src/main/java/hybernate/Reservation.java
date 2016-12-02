package hybernate;

public class Reservation {
	private String name;
	private int reservationid;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReservationid() {
		return reservationid;
	}
	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Reservation [name=" + name + ", reservationid=" + reservationid
				+ ", type=" + type + "]";
	}
	

}
