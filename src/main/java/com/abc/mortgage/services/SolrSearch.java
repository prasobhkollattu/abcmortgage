package com.abc.mortgage.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.mortgage.services.models.SolrSearchResponse;

@Service
public class SolrSearch {

	private static final Logger LOGGER = LoggerFactory.getLogger(SolrSearch.class);
	@Value("${solr.service.url}")
	private String solrService;

	public SolrSearchResponse search(final String searchParam) {
		LOGGER.info("searching solr with param [" + searchParam + "]");
		return getSolrSearchResponse(searchParam);
	}

	private SolrSearchResponse getSolrSearchResponse(String searchParam) {
		RestTemplate restTemplate = new RestTemplate();
		String url = solrService + "" + searchParam;
		System.out.println("url " + url);
		SolrSearchResponse resp = restTemplate.getForObject(url, SolrSearchResponse.class);
		return resp;

	}

}
