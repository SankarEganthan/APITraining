package org.jsontraining;

import java.util.ArrayList;

public class Task3_List extends Data{
	public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<Data> data;
    public Support support;
	public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public ArrayList<Data> getData() {
		return data;
	}
	public Support getSupport() {
		return support;
	}
    
}
