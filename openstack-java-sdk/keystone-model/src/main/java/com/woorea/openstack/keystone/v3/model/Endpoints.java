/*******************************************************************************
 * Copyright (C) 2016 AT&T Intellectual Property. All rights reserved. This code is licensed under the Apache License, Version 2.0
 *******************************************************************************/

package com.woorea.openstack.keystone.v3.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Endpoints implements Iterable<Endpoint>,  Serializable {

	@JsonProperty("endpoints")
	private List<Endpoint> list;

	/**
	 * @return the list
	 */
	public List<Endpoint> getList() {
		return list;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Endpoints [list=" + list + "]";
	}

	@Override
	public Iterator<Endpoint> iterator() {
		return list.iterator();
	}
	
}
