package com.tcs.final1.keyword;

public class Ticket {
	private final String movie = "";
	private float price;

	public final void sell() { //dont want to be overridden

	}
	public final void sell(float price) {
		
	}
}

class IllegalTicket extends Ticket {
//	public final void sell() {
//
//	}
}
