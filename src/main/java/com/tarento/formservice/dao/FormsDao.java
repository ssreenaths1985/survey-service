package com.tarento.formservice.dao;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import org.elasticsearch.action.search.SearchRequest;

import com.tarento.formservice.model.ActivityLogs;
import com.tarento.formservice.model.IncomingData;
import com.tarento.formservice.model.State;
import com.tarento.formservice.model.StateMatrix;
import com.tarento.formservice.models.CourseFormDto;
import com.tarento.formservice.models.FormDetail;

/**
 * This interface for Portfolio contains the method which executes the Search
 * Request and Delete Request on Elastic Search Repositories
 * 
 * @author Darshan Nagesh
 *
 */
public interface FormsDao {

	Boolean addForm(FormDetail newForm);

	public Boolean addFormData(IncomingData incomingData);

	public Boolean addPlainFormData(IncomingData incomingData); 

	Boolean updateFormData(Map<String, Object> jsonMap, String id);

	Boolean updateFormData(Object object, String id);

	List<Map<String, Object>> searchResponse(SearchRequest searchRequest);
	
	List<Map<String, Object>> searchPlainFormResponse(SearchRequest searchRequest); 

	List<Map<String, Object>> searchAggregationResponse(SearchRequest searchRequest, String aggregationName);

	ConcurrentMap<Long, State> fetchAllStates(SearchRequest searchRequest);

	ConcurrentMap<String, List<StateMatrix>> fetchAllStateMatrix(SearchRequest searchRequest);

	Boolean addLogs(ActivityLogs activityLogs);

	Boolean updateForm(FormDetail newForm);

	List<Map<String, Object>> searchFormResponse(SearchRequest searchRequest);

	Boolean tagFormToCourse(CourseFormDto courseFormDto);

	Boolean untagFormToCourse(CourseFormDto courseFormDto);

}
