package repository;

import entity.State;

public class StateRepository {
	public static State getMaharastaStateDetails() {
		State state=new State();
		state.setStateName("maharastra");
		state.setCMName("Drevindra fadvnis");
		state.setStateCapitalName("Mumbai");
		state.setDeputyCMName("Eknath Shinde");
		state.setTotalMLA(288);
		state.setTotalDistrict(36);
		state.setTotalTaluka(358);
		return state;
		
	}

}