package iit.lk;

public class fullTime<E> extends Employee<E> {
	
	protected int noOfWorkingDays;
	protected int dialyRate;

	public fullTime(E name, E empType, int id,int noOfWorkingDays,int dailyRate) {
		super(name, empType, id);
		this.noOfWorkingDays = noOfWorkingDays;
		this.dialyRate = dailyRate;
	}

	@Override
	public int Payments() {
		int noOfWork = (int) noOfWorkingDays;
		int dailyR = (int) dialyRate;
		return noOfWork * dailyR;
	}

	
}
