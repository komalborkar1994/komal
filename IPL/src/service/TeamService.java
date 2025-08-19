package service;

import java.lang.classfile.instruction.SwitchCase;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

import entity.Team;
import repository.Teamrepository;

public class TeamService {
	
	public void selectOptions() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");
		System.out.println("3. Get team details by team id");

		int input = sc.nextInt();
		System.err.println("You have selected option : " + input);

		switch (input) {
		
		case 1: {
			System.out.println(Teamrepository.getMITeamDetail());
			System.out.println(Teamrepository.getRoyalChallengerBengaluruTeamDetail());
			System.out.println(Teamrepository.getCskTeamDetail());
			System.out.println(Teamrepository.getDelhiTeamDeatil());
			System.out.println(Teamrepository.getGujaratTitansTeamDeatil());
			System.out.println(Teamrepository.getKolkataTeamDetail());
			System.out.println(Teamrepository.getLucknowSupergiantsTeamDetail());
			System.out.println(Teamrepository.getPunjabKingsTeamDetail());
			System.out.println(Teamrepository.getRajastanRoyalTeamDeatil());
			System.out.println(Teamrepository.getSunrisersTeamDeatil());
		break;
		}
		
		case 2: {
			System.out.println("Please enter your fav team's short name : ");
			String teamShortName = sc.next();
			System.err.println("entered team short name is  : " + teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		case 3 : {
			System.out.println("please enter your fav team's id:");
			int id = sc.nextInt();
			System.err.println("Enter team  id is:" + id);
			getTeamById(id);
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}

	private void getTeamByShortName(String shortName) {
	
		switch (shortName) {
		case "MI": {
			System.out.println(Teamrepository.getMITeamDetail());
			break;
		}
		case "RCB" : {
			System.out.println(Teamrepository.getRoyalChallengerBengaluruTeamDetail());
			break;
		}
		
		case "CSK": {
			System.out.println(Teamrepository.getCskTeamDetail());
			break;
		}
		case "SR": {
			System.out.println(Teamrepository.getSunrisersTeamDeatil());
			break;
		}
		case "GT": {
			System.out.println(Teamrepository.getGujaratTitansTeamDeatil());
			break;
		}
		case "PK": {
			System.out.println(Teamrepository.getPunjabKingsTeamDetail());
			break;
		}
		case "RR": {
			System.out.println(Teamrepository.getRajastanRoyalTeamDeatil());
			break;
		}
		case "LST": {
			System.out.println(Teamrepository.getLucknowSupergiantsTeamDetail());
			break;
		}
		case "KNR": {
			System.out.println(Teamrepository.getKolkataTeamDetail());
			break;
		}
		case "DI": {
			System.out.println(Teamrepository.getDelhiTeamDeatil());
			break;
		}

		default:
			throw new IllegalArgumentException("unexcted value:" + shortName);

		}}
		private void getTeamById(int id) {
		    if (id == 100) {
		        System.out.println(Teamrepository.getMITeamDetail());
		    } else if (id == 101) {
		        System.out.println(Teamrepository.getCskTeamDetail());
		    } else if (id == 102) {
		        System.out.println(Teamrepository.getDelhiTeamDeatil());
		    } else if (id == 103) {
		        System.out.println(Teamrepository.getKolkataTeamDetail());
		    } else if (id == 104) {
		        System.out.println(Teamrepository.getRoyalChallengerBengaluruTeamDetail());
		    } else if (id == 105) {
		        System.out.println(Teamrepository.getLucknowSupergiantsTeamDetail());
		    } else if (id == 106) {
		        System.out.println(Teamrepository.getRajastanRoyalTeamDeatil());
		    } else if (id == 107) {
		        System.out.println(Teamrepository.getPunjabKingsTeamDetail());
		    } else if (id == 108) {
		        System.out.println(Teamrepository.getGujaratTitansTeamDeatil());
		    } else if (id == 109) {
		        System.out.println(Teamrepository.getSunrisersTeamDeatil());
		    } else {
		        throw new IllegalArgumentException("No team found with ID: " + id);
		    }}
}

		
		

