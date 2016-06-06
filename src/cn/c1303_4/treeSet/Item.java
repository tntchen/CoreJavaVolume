package cn.c1303_4.treeSet;

import java.util.Objects;

public class Item implements Comparable<Item> {
	private String description;
	private int partNumber;

	// 构造方法
	public Item(String description, int partNumber) {
		super();
		this.description = description;
		this.partNumber = partNumber;
	}

	// description的get方法
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Item [description=" + description + ", partNumber=" + partNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (partNumber != other.partNumber)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, partNumber);
	}

	// 重写compareto方法
	public int compareTo(Item other) {
		return Integer.compare(partNumber, other.partNumber);
	}

}
