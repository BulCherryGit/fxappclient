package com.xsclient.fxappclient.service;

import org.springframework.stereotype.Service;

import com.xsclient.fxappclient.dto.Client;

@Service
public class TestService {

	public Client getClientData()
	{
		Client cl = new Client();
		
		return cl;
	}
}
