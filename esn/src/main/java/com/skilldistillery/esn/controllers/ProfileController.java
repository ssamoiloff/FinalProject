package com.skilldistillery.esn.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.esn.entities.Game;
import com.skilldistillery.esn.entities.Organization;
import com.skilldistillery.esn.entities.Player;
import com.skilldistillery.esn.entities.Profile;
import com.skilldistillery.esn.entities.Team;
import com.skilldistillery.esn.services.ProfileService;

@RestController
@RequestMapping("api")
public class ProfileController {

	@Autowired
	private ProfileService profileService;

	@GetMapping("profiles")
	public List<Profile> index(HttpServletRequest req, HttpServletResponse res, Principal principal) {
		List<Profile> results;
		try {
			results = profileService.index(principal.getName());
			if (results.size() > 0) {
				res.setStatus(200);
			} else {
				res.setStatus(400);
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			results = null;
		}
		return results;
	}

	@GetMapping("profiles/{pid}")
	public Profile getById(HttpServletRequest req, HttpServletResponse res, Principal principal) {
		Profile result;
		try {
			result = profileService.show(principal.getName());
			if (result != null) {
				res.setStatus(200);
			} else {
				res.setStatus(400);
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			result = null;
		}
		return result;
	}

	@PutMapping("profiles/{pid}")
	public Profile updateProfile(HttpServletRequest req, HttpServletResponse res, @RequestBody Profile profile,
			Principal principal) {
		try {
			profile = profileService.update(principal.getName(), profile);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}

		return profile;
	}

	@PutMapping("profiles/{id}/addTeam")
	public Profile addTeam(HttpServletRequest req, HttpServletResponse res, @RequestBody Team team,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.addTeam(principal.getName(), team);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}

	@PutMapping("profiles/{id}/addGame")
	public Profile addGame(HttpServletRequest req, HttpServletResponse res, @RequestBody Game game,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.addGame(principal.getName(), game);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}

	@PutMapping("profiles/{id}/addOrg")
	public Profile addOrg(HttpServletRequest req, HttpServletResponse res, @RequestBody Organization organization,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.addOrg(principal.getName(), organization);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}

	@PutMapping("profiles/{id}/addPlayer")
	public Profile addPlayer(HttpServletRequest req, HttpServletResponse res, @RequestBody Player player,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.addPlayer(principal.getName(), player);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}

	@PutMapping("profiles/{id}/removeTeam")
	public Profile removeTeam(HttpServletRequest req, HttpServletResponse res, @RequestBody Team team,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.removeTeam(principal.getName(), team);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}

	@PutMapping("profiles/{id}/removeGame")
	public Profile removeGame(HttpServletRequest req, HttpServletResponse res, @RequestBody Game game,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.removeGame(principal.getName(), game);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}

	@PutMapping("profiles/{id}/removeOrg")
	public Profile removeOrg(HttpServletRequest req, HttpServletResponse res, @RequestBody Organization organization,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.removeOrg(principal.getName(), organization);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}

	@PutMapping("profiles/{id}/removePlayer")
	public Profile removePlayer(HttpServletRequest req, HttpServletResponse res, @RequestBody Player player,
			Principal principal) {
		Profile profile;
		try {
			profile = profileService.removePlayer(principal.getName(), player);
			if (profile == null) {
				res.setStatus(404);
			}
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setStatus(400);
			profile = null;
		}
		return profile;
	}
}
