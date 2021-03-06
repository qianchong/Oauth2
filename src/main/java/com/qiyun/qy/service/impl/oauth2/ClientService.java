package com.qiyun.qy.service.impl.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import com.qiyun.qy.entity.Client;
import com.qiyun.qy.mapper.mysql.IClientDao;

@Service("qiYunClientService") 
public class ClientService implements ClientDetailsService {
	
	@Autowired
	private IClientDao clientDao;
	
	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		Client client = clientDao.loadClientByClientId(clientId);
		return client;
	}

}
