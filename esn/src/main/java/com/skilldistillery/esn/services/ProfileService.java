package com.skilldistillery.esn.services;

import java.util.List;

import com.skilldistillery.esn.entities.Game;
import com.skilldistillery.esn.entities.Organization;
import com.skilldistillery.esn.entities.Player;
import com.skilldistillery.esn.entities.Profile;
import com.skilldistillery.esn.entities.Team;

public interface ProfileService {

	public List<Profile> index(String username);

	public Profile show(Integer pid);
	
	public Profile getByUsername(String username);

	public Profile create(Profile profile, String username);

	public Profile update(String username, Profile profile);

	public Profile addTeam(String username, Team team);

	public Profile addPlayer(String username, Player player);

	public Profile addOrg(String username, Organization organization);

	public Profile addGame(String username, Game game);

	public Profile removeTeam(String username, Team team);

	public Profile removePlayer(String username, Player player);

	public Profile removeOrg(String username, Organization organization);

	public Profile removeGame(String username, Game game);
}
