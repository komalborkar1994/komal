package repository;

import entity.Team;

public class Teamrepository {
	
	public static Team getMITeamDetail() {
		Team team = new Team();
		team.setId(100);
		team.setTeamName("mumbai");
		team.setCaptainName("hardik pandya");
		team.setCoachName("jayvardhane");
		team.setnRR(5.3f);
		team.setQualified(false);
		team.setShortname("MI");
		return team;
	}

	public static Team getCskTeamDetail() {
		Team team1 = new Team();
		team1.setId(101);
		team1.setCaptainName("m.s.dhoni");
		team1.setCoachName("stephen Fleming");
		team1.setnRR(6.4f);
		team1.setQualified(false);
		team1.setTeamName("Chennai super king");
		team1.setShortname("CSK");
		return team1;
	}

	public static Team getDelhiTeamDeatil() {
		Team team2 = new Team();
		team2.setId(102);
		team2.setTeamName("Delhi");
		team2.setCaptainName("Axar Patel");
		team2.setCoachName("Hemang Badani");
		team2.setnRR(4.2f);
		team2.setQualified(false);
		team2.setShortname("DI");
		return team2;

	}

	public static Team getKolkataTeamDetail() {
		Team team3 = new Team();
		team3.setId(103);
		team3.setTeamName("Kolkata");
		team3.setCaptainName("Ajinkya Rahane");
		team3.setCoachName("Chandrankant Pandit");
		team3.setnRR(7.2f);
		team3.setQualified(false);
		team3.setShortname("KNR");
		return team3;
	}

	public static Team getRoyalChallengerBengaluruTeamDetail() {
		Team team4 = new Team();
		team4.setId(104);
		team4.setTeamName("RoyalChallengBengaluru");
		team4.setCaptainName("Virat Kohali");
		team4.setCoachName("Andy Flower");
		team4.setnRR(5.2f);
		team4.setQualified(true);
		team4.setShortname("RCB");
		return team4;
	}

	public static Team getLucknowSupergiantsTeamDetail() {
		Team team5 = new Team();
		team5.setId(105);
		team5.setTeamName("LukhnowSupergiants");
		team5.setCaptainName("Rishabh pant");
		team5.setCoachName("Justin Langer");
		team5.setnRR(8.2f);
		team5.setQualified(false);
		team5.setShortname("LST");
		
		return team5;
	}

	public static Team getRajastanRoyalTeamDeatil() {
		Team team6 = new Team();
		team6.setId(106);
		team6.setTeamName("RajastanRoyal");
		team6.setCaptainName("Sanju Samson");
		team6.setCoachName("Rahul Dravid");
		team6.setnRR(3.2f);
		team6.setQualified(false);
		team6.setShortname("RR");
		return team6;
	}

	public static Team getPunjabKingsTeamDetail() {
		Team team7 = new Team();
		team7.setId(107);
		team7.setTeamName("PunjabKing");
		team7.setCaptainName("Shreyas Lyer");
		team7.setCoachName("Ricky Ponting");
		team7.setnRR(6.2f);
		team7.setQualified(false);
		team7.setShortname("PK");
		return team7;
	}

	public static Team getGujaratTitansTeamDeatil() {
		Team team8 = new Team();
		team8.setId(108);
		team8.setTeamName("GujaratTitan");
		team8.setCaptainName(" Shubham Gill");
		team8.setCoachName("Ashish Nehra");
		team8.setnRR(3.2f);
		team8.setQualified(false);
		team8.setShortname("GT");
		return team8;

	}

	public static Team getSunrisersTeamDeatil() {
		Team team9 = new Team();
		team9.setId(109);
		team9.setTeamName("Sunrisers");
		team9.setCaptainName("pat Cummins");
		team9.setCoachName("Daniel Vettori");
		team9.setnRR(7.2f);
		team9.setQualified(false);
		team9.setShortname("SR");
		return team9;

	}

}
