package service;

import java.lang.classfile.instruction.SwitchCase;
import java.lang.reflect.UndeclaredThrowableException;
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
		//get All team details
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
		//get team details by short Name
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
		// here we will write a code logic to get team details by short name
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
		    }
		


//	}
//
//}

//	public void PrintTeamDetail() {

//		default:
//			throw new IllegalArgumentException("Unexpected value: " + shortName);
		}
	}
//	public void printTeamDetails() {
//		Team team = TeamRepository.getMITeamDetails();
//		System.out.println(team.getId());
//		System.out.println(team.getTeamName());
//		System.out.println(team.getCaptainName());
//		System.out.println(team.getCoachName());
//		System.out.println(team.getnRR());
//		System.out.println(team.isQualified());}
//
//	public void SelectOptions() {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("welcome To IPL portal");
//		System.out.println("please select following option");
//		System.out.println("1.get all team detail");
//		System.out.println("2. get team detail by shortname");
//		int input = scanner.nextInt();
//		System.err.println("you have select option:" + input);
//		switch (input) {
//		case 1: {
//			System.err.println("in case 1");
//			System.out.println(Teamrepository.getMITeamDetail());
//			System.out.println(Teamrepository.getCskTeamDetail());
//			System.out.println(Teamrepository.getDelhiTeamDeatil());
//			System.out.println(Teamrepository.getGujaratTitansTeamDeatil());
//			System.out.println(Teamrepository.getKolkataTeamDetail());
//			System.out.println(Teamrepository.getLucknowSupergiantsTeamDetail());
//			System.out.println(Teamrepository.getPunjabKingsTeamDetail());
//			System.out.println(Teamrepository.getRajastanRoyalTeamDeatil());
//			System.out.println(Teamrepository.getRoyalChallengerBengaluruTeamDetail());
//			System.out.println(Teamrepository.getSunrisersTeamDeatil());
//			break;
//		}
//		case 2: {
//			System.out.println("please enter your fav team's short name:");
//			String teamShortName = scanner.next();
//			System.err.println("Enter team short name is:" + teamShortName);
//		}
//		case 3: {
//			System.out.println("please enter your fav team's id:");
//			int id = scanner.nextInt();
//			System.err.println("Enter team  id is:" + id);
//		}
//
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + input);
//		}
//	}
//
//	private void getTeamByShortName(String shortname) {
//		switch (shortname) {
//		case "MI": {
//			System.out.println(Teamrepository.getMITeamDetail());
//			break;
//		}
//		case "RCB": {
//			System.out.println(Teamrepository.getRoyalChallengerBengaluruTeamDetail());
//		}
//
//		case "CSK": {
//			System.out.println(Teamrepository.getCskTeamDetail());
//		}
//		case "SR": {
//			System.out.println(Teamrepository.getSunrisersTeamDeatil());
//		}
//		case "GT": {
//			System.out.println(Teamrepository.getGujaratTitansTeamDeatil());
//		}
//		case "PK": {
//			System.out.println(Teamrepository.getPunjabKingsTeamDetail());
//		}
//		case "RR": {
//			System.out.println(Teamrepository.getRajastanRoyalTeamDeatil());
//		}
//		case "LST": {
//			System.out.println(Teamrepository.getLucknowSupergiantsTeamDetail());
//		}
//		case "KNR": {
//			System.out.println(Teamrepository.getKolkataTeamDetail());
//		}
//		case "DI": {
//			System.out.println(Teamrepository.getDelhiTeamDeatil());
//		}
//
//		default:
//			throw new IllegalArgumentException("unexcted value:" + shortname);
//
//		}
//
//	}
//
//}

//	public void PrintTeamDetail() {
//
//		Team team = Teamrepository.getMITeamDetail();
//		System.out.println(team.getId());
//		System.out.println(team.getCaptainName());
//		System.out.println(team.getCoachName());
//		System.out.println(team.getTeamName());
//		System.out.println(team.getnRR());
//		System.out.println(team.isQualified());
//		System.out.println("----------------------------");
//
//		Team team1 = Teamrepository.getCkkTeamDetail();
//		System.out.println(team1.getId());
//		System.out.println(team1.getCaptainName());
//		System.out.println(team1.getCoachName());
//		System.out.println(team1.getTeamName());
//		System.out.println(team1.getnRR());
//		System.out.println(team1.isQualified());
//		System.out.println("------------------------------");
//
//		Team team2 = Teamrepository.getDelhiTeamDeatil();
//		System.out.println(team2.getId());
//		System.out.println(team2.getCaptainName());
//		System.out.println(team2.getCoachName());
//		System.out.println(team2.getTeamName());
//		System.out.println(team2.getnRR());
//		System.out.println(team2.isQualified());
//		System.out.println("------------------------------");
//
//		Team team3 = Teamrepository.getKolkataTeamDetail();
//		System.out.println(team3.getId());
//		System.out.println(team3.getCaptainName());
//		System.out.println(team3.getCoachName());
//		System.out.println(team3.getTeamName());
//		System.out.println(team3.getnRR());
//		System.out.println(team3.isQualified());
//		System.out.println("----------------------------");
//
//		Team team4 = Teamrepository.getRoyalChallengerBengaluruTeamDetail();
//		System.out.println(team4.getId());
//		System.out.println(team4.getCaptainName());
//		System.out.println(team4.getCoachName());
//		System.out.println(team4.getTeamName());
//		System.out.println(team4.getnRR());
//		System.out.println(team4.isQualified());
//		System.out.println("---------------------------------");
//
//		Team team5 = Teamrepository.getLucknowSupergiantsTeamDetail();
//		System.out.println(team5.getId());
//		System.out.println(team5.getCaptainName());
//		System.out.println(team5.getCoachName());
//		System.out.println(team5.getTeamName());
//		System.out.println(team5.getnRR());
//		System.out.println(team5.isQualified());
//		System.out.println("----------------------------------");
//
//		Team team6 = Teamrepository.getRajastanRoyalTeamDeatil();
//		System.out.println(team6.getId());
//		System.out.println(team6.getCaptainName());
//		System.out.println(team6.getCoachName());
//		System.out.println(team6.getTeamName());
//		System.out.println(team6.getnRR());
//		System.out.println(team6.isQualified());
//		System.out.println("---------------------------------");
//
//		Team team7 = Teamrepository.getPunjabKingsTeamDetail();
//		System.out.println(team7.getId());
//		System.out.println(team7.getCaptainName());
//		System.out.println(team7.getCoachName());
//		System.out.println(team7.getTeamName());
//		System.out.println(team7.getnRR());
//		System.out.println(team7.isQualified());
//		System.out.println("--------------------------------");
//
//		Team team8 = Teamrepository.getGujaratTitansTeamDeatil();
//		System.out.println(team8.getId());
//		System.out.println(team8.getCaptainName());
//		System.out.println(team8.getCoachName());
//		System.out.println(team8.getTeamName());
//		System.out.println(team8.getnRR());
//		System.out.println(team8.isQualified());
//		System.out.println("---------------------------------");
//
//		Team team9 = Teamrepository.getSunrisersTeamDeatil();
//		System.out.println(team9.getId());
//		System.out.println(team9.getCaptainName());
//		System.out.println(team9.getCoachName());
//		System.out.println(team9.getTeamName());
//		System.out.println(team9.getnRR());
//		System.out.println(team9.isQualified());
//		System.out.println("---------------------------------");
//
//	}

  // public void PrintTeamDetail() {
	   //     printTeamDetails(Teamrepository.getMITeamDetail());
//	        printTeamDetails(Teamrepository.getCkkTeamDetail());
//	        printTeamDetails(Teamrepository.getDelhiTeamDeatil());
//	        printTeamDetails(Teamrepository.getKolkataTeamDetail());
//	        printTeamDetails(Teamrepository.getRoyalChallengerBengaluruTeamDetail());
//	        printTeamDetails(Teamrepository.getLucknowSupergiantsTeamDetail());
//	        printTeamDetails(Teamrepository.getRajastanRoyalTeamDeatil());
//	        printTeamDetails(Teamrepository.getPunjabKingsTeamDetail());
//	        printTeamDetails(Teamrepository.getGujaratTitansTeamDeatil());
//	        printTeamDetails(Teamrepository.getSunrisersTeamDeatil());
//	    }
//
//	    private void printTeamDetails(Team team) {
//	        System.out.println(team.getId());
//	        System.out.println(team.getCaptainName());
//	        System.out.println(team.getCoachName());
//	        System.out.println(team.getTeamName());
//	        System.out.println(team.getnRR());
//	        System.out.println(team.isQualified());
//	        System.out.println("---------------------------------");
//	    }
//	
//

