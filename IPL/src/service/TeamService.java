package service;

import entity.Team;
import repository.Teamrepository;

public class TeamService {

	public void PrintTeamDetail() {

		Team team = Teamrepository.getMITeamDetail();
		System.out.println(team.getId());
		System.out.println(team.getCaptainNameString());
		System.out.println(team.getCoachNameString());
		System.out.println(team.getTeamName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
		System.out.println("----------------------------");

		Team team1 = Teamrepository.getCkkTeamDetail();
		System.out.println(team1.getId());
		System.out.println(team1.getCaptainNameString());
		System.out.println(team1.getCoachNameString());
		System.out.println(team1.getTeamName());
		System.out.println(team1.getnRR());
		System.out.println(team1.isQualified());
		System.out.println("------------------------------");

		Team team2 = Teamrepository.getDelhiTeamDeatil();
		System.out.println(team2.getId());
		System.out.println(team2.getCaptainNameString());
		System.out.println(team2.getCoachNameString());
		System.out.println(team2.getTeamName());
		System.out.println(team2.getnRR());
		System.out.println(team2.isQualified());
		System.out.println("------------------------------");

		Team team3 = Teamrepository.getKolkataTeamDetail();
		System.out.println(team3.getId());
		System.out.println(team3.getCaptainNameString());
		System.out.println(team3.getCoachNameString());
		System.out.println(team3.getTeamName());
		System.out.println(team3.getnRR());
		System.out.println(team3.isQualified());
		System.out.println("----------------------------");

		Team team4 = Teamrepository.getRoyalChallengerBengaluruTeamDetail();
		System.out.println(team4.getId());
		System.out.println(team4.getCaptainNameString());
		System.out.println(team4.getCoachNameString());
		System.out.println(team4.getTeamName());
		System.out.println(team4.getnRR());
		System.out.println(team4.isQualified());
		System.out.println("---------------------------------");

		Team team5 = Teamrepository.getLucknowSupergiantsTeamDetail();
		System.out.println(team5.getId());
		System.out.println(team5.getCaptainNameString());
		System.out.println(team5.getCoachNameString());
		System.out.println(team5.getTeamName());
		System.out.println(team5.getnRR());
		System.out.println(team5.isQualified());
		System.out.println("----------------------------------");

		Team team6 = Teamrepository.getRajastanRoyalTeamDeatil();
		System.out.println(team6.getId());
		System.out.println(team6.getCaptainNameString());
		System.out.println(team6.getCoachNameString());
		System.out.println(team6.getTeamName());
		System.out.println(team6.getnRR());
		System.out.println(team6.isQualified());
		System.out.println("---------------------------------");

		Team team7 = Teamrepository.getPunjabKingsTeamDetail();
		System.out.println(team7.getId());
		System.out.println(team7.getCaptainNameString());
		System.out.println(team7.getCoachNameString());
		System.out.println(team7.getTeamName());
		System.out.println(team7.getnRR());
		System.out.println(team7.isQualified());
		System.out.println("--------------------------------");

		Team team8 = Teamrepository.getGujaratTitansTeamDeatil();
		System.out.println(team8.getId());
		System.out.println(team8.getCaptainNameString());
		System.out.println(team8.getCoachNameString());
		System.out.println(team8.getTeamName());
		System.out.println(team8.getnRR());
		System.out.println(team8.isQualified());
		System.out.println("---------------------------------");

		Team team9 = Teamrepository.getSunrisersTeamDeatil();
		System.out.println(team9.getId());
		System.out.println(team9.getCaptainNameString());
		System.out.println(team9.getCoachNameString());
		System.out.println(team9.getTeamName());
		System.out.println(team9.getnRR());
		System.out.println(team9.isQualified());
		System.out.println("---------------------------------");

	}

}
