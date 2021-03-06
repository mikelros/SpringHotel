package org.cuatrovientos.spring;

import java.util.Vector;

public class Hotel {
	private String name;
	private Vector<Room> rooms;

	public Hotel() {
		super();
	}

	public Hotel(String name, Vector<Room> rooms) {
		super();
		this.name = name;
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vector<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Vector<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rooms=" + rooms + "]";
	}

}
