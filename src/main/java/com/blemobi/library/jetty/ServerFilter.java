package com.blemobi.library.jetty;

import javax.servlet.Filter;

public class ServerFilter {
	private Filter filter;
	private String path;

	public ServerFilter(Filter filter, String path) {
		this.filter = filter;
		this.path = path;
	}

	public Filter getFilter() {
		return filter;
	}

	public String getPath() {
		return path;
	}

}
