package iit.lk;

public class partTime<E> extends Employee<E> {

	protected int hourlyRate;
	protected int hoursofWork;

	public partTime(E name, E empType, int id, int hourlyRate, int hoursofWork) {

		super(name, empType, id);
		this.hourlyRate = hourlyRate;
		this.hoursofWork = hoursofWork;

	}

	@Override
	public int Payments() {
		int hourly = (int) hourlyRate;
		int hours = (int) hoursofWork;
		return hourly * hours;
	}

}
