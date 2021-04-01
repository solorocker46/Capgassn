package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "product40")
@NamedQuery(name = "findAll", query = "select p from Product p")
@NamedQueries(
		{
			@NamedQuery(name = "findById", query = "select p from Product p where id = :id"),
			@NamedQuery(name = "findByPrice", query = "select p from Product p where price > :price")
		}
		)
public class Product {
	@Id
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
