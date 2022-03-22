package lorem.domain;

import java.util.Objects;

import lorem.annot.ValueObject;

@ValueObject
public class Name {
	private String name;

	public static Name of (String name) {
		return new Name(name);
	}
	private Name(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	
	
}
