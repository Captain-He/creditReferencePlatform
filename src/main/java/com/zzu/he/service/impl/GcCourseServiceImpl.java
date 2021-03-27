package com.zzu.he.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzu.he.entity.Scores;
import com.zzu.he.mapper.GcCourseMapper;
import com.zzu.he.service.GcCourseService;

@Service
public class GcCourseServiceImpl implements GcCourseService{

	@Autowired
	GcCourseMapper gcCourseMapper;
	
	
	@Override
	public List<Scores>findScores(String coursename,String type,String gcg,String gcc,int start, int pagesize ) {
		// TODO Auto-generated method stub
		return gcCourseMapper.findScores(coursename,type,gcg, gcc,start, pagesize );
	}


	@Override
	public List<Scores> findAllScores(String coursename, String type, String gcg, String gcc) {
		// TODO Auto-generated method stub
		return gcCourseMapper.findAllScores(coursename,type,gcg, gcc);
	}


	@Override
	public List<Scores> compClaScores(String coursename, String gcg) {
		// TODO Auto-generated method stub
		return gcCourseMapper.compClaScores(coursename, gcg);
	}


	@Override
	public int updateScores(Map map) {
		// TODO Auto-generated method stub
		return gcCourseMapper.updateScores(map);
	}


	@Override
	public List<Scores> findPersonScore(String coursename, String num) {
		// TODO Auto-generated method stub
		return gcCourseMapper.findPersonScore(coursename, num);
	}

}
