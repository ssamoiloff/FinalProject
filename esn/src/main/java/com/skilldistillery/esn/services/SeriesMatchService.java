package com.skilldistillery.esn.services;

import java.util.List;

import com.skilldistillery.esn.entities.SeriesMatch;

public interface SeriesMatchService {
	List<SeriesMatch> getAllMatches();
	SeriesMatch getMatchById(Integer id);
	List<SeriesMatch> getAllByGameId(Integer gid);
}
